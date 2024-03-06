package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.repository.EquipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipeService{

private EquipeRepository EquipeRepository;


public EquipeService(EquipeRepository EquipeRepository) {
    this.EquipeRepository = EquipeRepository;
}

public List<Equipe> getAll(){
    return EquipeRepository.findAll();
}
}
