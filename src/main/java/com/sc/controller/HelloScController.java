package com.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloScController {

    @GetMapping("/helloSc")
    public String helloSc(){
        return "hello,Sc!";
    }
}
