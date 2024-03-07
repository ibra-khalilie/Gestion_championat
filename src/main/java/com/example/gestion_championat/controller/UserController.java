package com.example.gestion_championat.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Login {
    @PostMapping(value = "/login")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {

        String Username = "admin";
        String Password = "password";

        if (Username.equals(username) && Password.equals(password)) {

            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Identifiants incorrects !");
            return mav;

        } else {

            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Identifiants incorrects !");
            return mav;
        }
    }

}
