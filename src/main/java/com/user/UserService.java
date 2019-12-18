package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public void addUser(User newUser){
        repository.save(newUser);
    }


    public List<User> getUsers(){
        List<User> users;
        users = repository.findAll();
        return users;
    }

    public Optional<User> getUser(String id){

        Optional<User> user = repository.findById(id);
        return user;
    }
}
