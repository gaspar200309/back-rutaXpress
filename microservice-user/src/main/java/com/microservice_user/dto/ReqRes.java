package com.microservice_user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.microservice_user.entity.UserEntity;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {
    private String email;
    private String password;
    private String role;
    private String name;
    private String lastName;
    private Long phone;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String message;
    private int statusCode;
    private String error;
    private UserEntity userEntity;
}
