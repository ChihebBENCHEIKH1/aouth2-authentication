package com.pfa.authentication.controller;

import com.pfa.authentication.dto.JwtLogin;
import com.pfa.authentication.dto.LoginResponse;
import com.pfa.authentication.service.TokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080
@RestController
@RequestMapping("/auth")
// http://localhost:8080/auth
public class LoginController {

    private TokenService tokenService;

    @Autowired
    public LoginController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    // http://localhost:8080/auth/login
    @PostMapping("/login")
    public LoginResponse login(@RequestBody JwtLogin jwtLogin) throws Exception {
    	return tokenService.login(jwtLogin);
       
    }
}
