package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.ChampionnatDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.model.EquipeClassement;
import com.example.gestion_championat.service.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ChampionnatController {

    @Autowired
    private ChampionnatService championnatService;
    private DefaultMapper defaultMapper;

    public ChampionnatController(ChampionnatService championnatService, DefaultMapper defaultMapper){
        this.championnatService = championnatService;
        this.defaultMapper = defaultMapper;
    }

    @GetMapping("/championnats")
    public List<ChampionnatDto> getAllChampionnats() {
        List<ChampionnatDto> dtoList =  championnatService.getAll()
                .stream()
                .map(championnat -> defaultMapper.mapEntityToDto(championnat, ChampionnatDto.class))
                .collect(Collectors.toList());

        return dtoList;
    }
    @GetMapping("/classement")
    public String classementPage(Model model) {
        List<ChampionnatDto> tousLesChampionnatsDto = championnatService.getAll();

        model.addAttribute("tousLesChampionnats", tousLesChampionnatsDto);


        if (!tousLesChampionnatsDto.isEmpty()) {
            Long championnatIdParDefaut = tousLesChampionnatsDto.get(0).getId();
            List<EquipeClassement> classementParDefaut = championnatService.calculerClassement(championnatIdParDefaut);

            model.addAttribute("classement", classementParDefaut);
            model.addAttribute("championnat", tousLesChampionnatsDto.get(0));
        }

        return "classement";
    }


    @GetMapping("/classement/{championnatId}")
    public String getClassement(@PathVariable Long championnatId, Model model) {

        List<ChampionnatDto> tousLesChampionnatsDto = championnatService.getAll();
        model.addAttribute("tousLesChampionnats", tousLesChampionnatsDto);


        ChampionnatDto championnatDto = championnatService.getChampionnatById(championnatId);
        model.addAttribute("championnat", championnatDto);

        List<EquipeClassement> classement = championnatService.calculerClassement(championnatId);


        model.addAttribute("classement", classement);

        return "classement";
    }



}
