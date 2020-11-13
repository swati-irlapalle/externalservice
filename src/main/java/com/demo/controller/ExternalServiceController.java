package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/externalservice")
public class ExternalServiceController {

    @GetMapping("/{message}")
    public String getMessage(@PathVariable("message") String message){

        return "My name is abc";
    }
}
