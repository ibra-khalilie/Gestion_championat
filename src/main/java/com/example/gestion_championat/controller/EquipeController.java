package com.example.gestion_championat.controller;

import com.example.gestion_championat.dto.EquipeDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.service.EquipeService;
import org.springframework.stereotype.Controller;

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

    public List<EquipeDto> getAllTeam() {
        return this.equipeService.getAll().stream()
                .map(equipe -> defaultMapper.mapEntityToDto(equipe, EquipeDto.class))
                .collect(Collectors.toList());
    }


}
