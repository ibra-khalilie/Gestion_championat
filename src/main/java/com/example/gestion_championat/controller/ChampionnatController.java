package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.ChampionnatDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.service.ChampionnatService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ChampionnatController {

    private ChampionnatService championnatService;

    private DefaultMapper defaultMapper;

    public ChampionnatController(ChampionnatService championnatService,DefaultMapper defaultMapper){
        this.championnatService = championnatService;
        this.defaultMapper = defaultMapper;
    }


    @PostConstruct
    public List<ChampionnatDto> getAllChampionnat(){
       List<ChampionnatDto> dtoList =  championnatService.getAll()
               .stream().map(championnat -> defaultMapper.mapEntityToDto(championnat, ChampionnatDto.class))
               .collect(Collectors.toList());

        System.out.println(dtoList);
        return dtoList;
    }



}
