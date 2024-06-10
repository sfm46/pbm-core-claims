package com.pbm.core.pbm.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/Hello")
    public String  getMessage(){
        return "Hello World";
    }

    @PostMapping("/create")
    public String createMessage() {
        return "Message Created";
    }
    @PutMapping("/update")
    public String updateMessage(){
        return "Updated Message";
        }


}
