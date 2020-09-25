package com.example.carros.api.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {

    @GetMapping()
    public String get(){
        return "API dos Carros";
    };


    @GetMapping("/userInfor")
    public UserDetails userInfor(@AuthenticationPrincipal UserDetails user){
        return user;
    }

}
