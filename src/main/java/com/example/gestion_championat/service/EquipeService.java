package com.example.gestion_championat.service;

import com.example.gestion_championat.dto.EquipeDto;
import com.example.gestion_championat.mapper.DefaultMapper;
import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.repository.EquipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class EquipeService{

    private EquipeRepository equipeRepository;

    private DefaultMapper defaultMapper;

    public EquipeService(EquipeRepository EquipeRepository, DefaultMapper defaultMapper) {
        this.equipeRepository = EquipeRepository;
        this.defaultMapper = defaultMapper;
    }

    public List<EquipeDto> getAll() {
            List<Equipe> equipes = equipeRepository.findAll();
            return equipes.stream()
                    .map(equipe -> defaultMapper.mapEntityToDto(equipe, EquipeDto.class))
                    .collect(Collectors.toList());
    }

    public EquipeDto findEquipeByName(String nom) {
        Equipe equipe = equipeRepository.findByNom(nom);
        if (equipe == null) {
            throw new RuntimeException("Équipe non trouvée");
        }
        return defaultMapper.mapEntityToDto(equipe, EquipeDto.class);
    }


}


