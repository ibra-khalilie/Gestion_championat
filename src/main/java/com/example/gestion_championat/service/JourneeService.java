package com.example.gestion_championat.service;

import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.dto.JournneDto;
import com.example.gestion_championat.model.Game;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.repository.JourneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JourneeService {

    private final JourneeRepository journeeRepository;
    private final DefaultMapper defaultMapper;

    public JourneeService(JourneeRepository journeeRepository, DefaultMapper defaultMapper) {
        this.journeeRepository = journeeRepository;
        this.defaultMapper = defaultMapper;
    }

    public List<JournneDto> getAllJournees() {
        List<Journee> journees = journeeRepository.findAll();
        return journees.stream()
                .map(journee -> defaultMapper.mapEntityToDto(journee, JournneDto.class))
                .collect(Collectors.toList());
    }

}
