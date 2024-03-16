package com.example.gestion_championat.controller;

import com.example.gestion_championat.model.Game;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.service.GameService;
import com.example.gestion_championat.service.JourneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class GameController {

    private final JourneeService journeeService;

    public GameController(JourneeService journeeService) {
        this.journeeService = journeeService;
    }

    @GetMapping("/calendrier")
    public String afficherCalendrier(Model model) {

        List<Journee> journees = journeeService.getAllJournees();
        model.addAttribute("journees", journees);

        return "calendrier";
    }
}
