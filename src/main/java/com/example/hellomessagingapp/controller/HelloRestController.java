package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String sayhello(){
        return "Hello From BridgeLabz";
    }
}