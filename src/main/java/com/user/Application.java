package com.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    @Autowired
    private static UserController userController;

    public Application(UserController userController) {
        this.userController = userController;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
