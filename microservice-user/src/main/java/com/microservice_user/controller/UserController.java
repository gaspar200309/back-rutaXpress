package com.microservice_user.controller;

import com.microservice_user.entities.User;
import com.microservice_user.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, public route!";
    }

    @GetMapping("/me")
    public Jwt getCurrentUser(@AuthenticationPrincipal Jwt jwt) {
        return jwt;
    }
}
