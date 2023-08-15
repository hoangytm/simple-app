package com.okta.developer.simpleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/greeting")
    public String greet() {
        String a = "1";
        return "Hello ";
    }
}
