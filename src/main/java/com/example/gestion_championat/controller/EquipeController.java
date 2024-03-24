package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.EquipeDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.service.EquipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EquipeController {

    private EquipeService equipeService;


    private DefaultMapper defaultMapper;
    public EquipeController(EquipeService equipeService, DefaultMapper defaultMapper){
        this.equipeService = equipeService;
        this.defaultMapper = defaultMapper;
    }

    @GetMapping("/equipe/{nom}")
    public String showEquipeInfo(@PathVariable String nom, Model model) {

        EquipeDto equipe = equipeService.findEquipeByName(nom);
        model.addAttribute("equipe", equipe);

        return "equipeInfo";
    }


}
