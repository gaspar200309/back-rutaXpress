package com.microservice_user.service;

import com.microservice_user.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void deleteById(Long id);

    List<User> findByEmail(String email);
}
