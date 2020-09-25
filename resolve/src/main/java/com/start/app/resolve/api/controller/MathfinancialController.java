package com.start.app.resolve.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mathfinancial")
public class MathfinancialController {


    @GetMapping("/interest")
    public String interest(){
        return 0;
    }




}
