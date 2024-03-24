package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.JournneDto;
import com.example.gestion_championat.model.Game;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.model.JourneeAvecMatchsParDate;
import com.example.gestion_championat.service.GameService;
import com.example.gestion_championat.service.JourneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;


@Controller
public class GameController {

    private final JourneeService journeeService;
    private final  GameService gameService;

    public GameController(JourneeService journeeService, GameService gameService) {
        this.journeeService = journeeService;
        this.gameService = gameService;
    }


    /*@GetMapping("/calendrier")
    public String afficherCalendrier(Model model) {
        List<JournneDto> journees = journeeService.getAllJournees();

        // Tri des matchs par date dans chaque journée
        for (JournneDto journee : journees) {
            journee.getGame().sort(Comparator.comparing(Game::getDate));
        }

        model.addAttribute("journees", journees);
        model.addAttribute("activePage", "calendrier");

        return "calendrier";
    }*/

    @GetMapping("/calendrier")
    public String afficherCalendrier(Model model) {
        List<JournneDto> journees = journeeService.getAllJournees();
        List<JourneeAvecMatchsParDate> journeesAvecMatchs = new ArrayList<>();

        for (JournneDto journee : journees) {
            Map<LocalDate, List<Game>> matchsParDate = journee.getGame().stream()
                    .collect(Collectors.groupingBy(game ->
                            game.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));

            JourneeAvecMatchsParDate journeeAvecMatchs = new JourneeAvecMatchsParDate();
            journeeAvecMatchs.setJournee(journee);
            journeeAvecMatchs.setMatchsParDate(matchsParDate);

            journeesAvecMatchs.add(journeeAvecMatchs);
        }

        model.addAttribute("journees", journeesAvecMatchs);
        model.addAttribute("activePage", "calendrier");

        return "calendrier";
    }


}
