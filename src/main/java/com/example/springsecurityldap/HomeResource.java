package com.example.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("")
    public String index() {
        return "<h2>Test</2h>";
    }
}
