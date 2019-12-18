package com.user;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


@RestController
public class UserController {

    @Autowired UserService userService;

    @PostMapping("/user")
    public void setUser(@RequestParam String id, @RequestParam String name, @RequestParam int age, @RequestParam boolean man, @RequestParam String nationality){

        User newUser = new User(id, name, age, man, nationality);
        userService.addUser(newUser);
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getSpecificUser(@PathVariable String id){

        Optional<User> user = userService.getUser(id);

        if (user.isPresent()){
            return ResponseEntity.ok().body(user.get());
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
