package com.example.gestion_championat.controller;

import com.example.gestion_championat.model.User;
import com.example.gestion_championat.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService){

        this.userService = userService;
    }

    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @PostMapping(value = "/login")
    public ModelAndView Login(@RequestParam("username") String username, @RequestParam("password") String password) {

        User user = userService.findByLogin(username);

        if (user != null && user.getMdp().equals(password)) {

            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Identifiants corrects !");
            return mav;

        } else {

            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Identifiants incorrects !");
            return mav;
        }
    }
}