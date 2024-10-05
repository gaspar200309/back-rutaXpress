package com.microservice_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice_user.dto.ReqRes;
import com.microservice_user.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    /**
     * @param signUpRequest
     * {
     *     "email": "123123@com.com",
     *     "password": "notebok456",
     *      "role": "DRIVER",
     *      "name": "Alfredo",
     *     "lastName": "Torrico",
     *     "phone": 1234567890
     * }
     *
     * @return 200  OK
     */
    @PostMapping("/signup")
    public ResponseEntity<ReqRes> signUp(@RequestBody ReqRes signUpRequest){
        return ResponseEntity.ok(authService.signUp(signUpRequest));
    }


    /**
     *
     * @param signInRequest
     * {
     *     "email": "123123@com.com",
     *     "password": "notebok456"
     * }
     * @return 200 ok autorizado
     */
    @PostMapping("/signin")
    public ResponseEntity<ReqRes> signIn(@RequestBody ReqRes signInRequest){
        return ResponseEntity.ok(authService.signIn(signInRequest));
    }
    @PostMapping("/refresh")
    public ResponseEntity<ReqRes> refreshToken(@RequestBody ReqRes refreshTokenRequest){
        return ResponseEntity.ok(authService.refreshToken(refreshTokenRequest));
    }
}
