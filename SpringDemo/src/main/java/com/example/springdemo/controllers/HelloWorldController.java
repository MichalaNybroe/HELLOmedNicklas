package com.example.springdemo.controllers;

import com.example.springdemo.services.CalculateDayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/parameter")
    public String parameter(@RequestParam String name) {
        return name + " " + ":)";
    }

    @GetMapping("/echo")
    public String input(@RequestParam String input) {
        return input;
    }
    @GetMapping("/friday")
    public String isItFriday() {
        return CalculateDayOfWeek.calc();
    }
}
