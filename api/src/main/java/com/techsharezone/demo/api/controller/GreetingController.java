package com.techsharezone.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greetings")
    @ResponseBody
    public String greetings(@RequestParam String name) {
        return "Hello, " + name;
    }
}
