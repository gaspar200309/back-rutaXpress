package com.microservice_user.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, public route!";
    }

    @GetMapping("/me")
    public Jwt getCurrentUser(@AuthenticationPrincipal Jwt jwt) {
        return jwt;
    }
}
