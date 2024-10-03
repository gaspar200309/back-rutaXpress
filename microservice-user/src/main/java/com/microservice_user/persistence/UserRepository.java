package com.microservice_user.persistence;

import com.microservice_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>, JpaRepository<User, Long> {

    List<User> findByEmail(String email);
}
