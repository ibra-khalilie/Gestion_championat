package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.ChampionnatDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.service.ChampionnatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ChampionnatController {

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
}
