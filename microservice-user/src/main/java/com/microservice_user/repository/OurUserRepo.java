package com.microservice_user.repository;

import java.util.Optional;
import com.microservice_user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OurUserRepo extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByEmail(String email);
}
