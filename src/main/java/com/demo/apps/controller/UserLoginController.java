package com.demo.apps.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {


    @GetMapping("/greeting")
    public String greeting(Authentication authentication) {

        String userName = authentication.getName();

        return " Welcome " + userName;
    }

}
