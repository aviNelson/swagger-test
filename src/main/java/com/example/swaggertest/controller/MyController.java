package com.example.swaggertest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping
    public String helloSwagger(){
        return "Hello Swagger!";
    }
}
