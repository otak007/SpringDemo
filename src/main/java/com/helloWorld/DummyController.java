package com.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DummyController {

    @GetMapping()
    public String home(){
        return "Hello World";
    }
}
