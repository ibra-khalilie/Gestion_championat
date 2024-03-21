package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.repository.EquipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipeService{

private EquipeRepository equipeRepository;


public EquipeService(EquipeRepository EquipeRepository) {
    this.equipeRepository = EquipeRepository;
}

public List<Equipe> getAll(){
    return equipeRepository.findAll();
}

public Equipe findEquipeByName(String nom) {
    return equipeRepository.findByNom(nom);
}

}


