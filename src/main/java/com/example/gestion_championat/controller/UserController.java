package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.UserDto;
import com.example.gestion_championat.mapper.DefaultMapper;
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
    private DefaultMapper defaultMapper;

    public UserController(UserService userService, DefaultMapper defaultMapper) {
        this.userService = userService;
        this.defaultMapper = defaultMapper;
    }

    @PostMapping(value = "/")
    public ModelAndView Login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = userService.findByLogin(username);

        if (user != null && user.getMdp().equals(password)) {

            UserDto userDto = defaultMapper.mapEntityToDto(user, UserDto.class);
            ModelAndView mav = new ModelAndView("redirect:/calendrier");
            mav.addObject("user", userDto);

            return mav;

        } else {

            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Identifiants incorrects !");
            return mav;
        }
    }

    @GetMapping("/")
    public String Login() {
        return "login";
    }

}
