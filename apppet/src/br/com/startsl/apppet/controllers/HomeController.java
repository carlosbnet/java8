package br.com.startsl.apppet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String  welcome(){
        return "home.tiles";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "home.login.tiles";
    }


}
