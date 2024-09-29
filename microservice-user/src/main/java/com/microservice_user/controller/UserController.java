package com.microservice_user.controller;

import com.microservice_user.entities.User;
import com.microservice_user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody User user) {
        userService.save(user);

    }
    @GetMapping("/hello")
    public String hello () {
        return "Hello";
    }

    @GetMapping("/helloSecured")
    public String bye () {
        return "BHello secured";
    }
}
