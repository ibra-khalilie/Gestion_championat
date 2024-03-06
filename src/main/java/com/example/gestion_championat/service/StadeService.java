package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Stade;
import com.example.gestion_championat.repository.StadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadeService {

    private StadeRepository stadeRepository;

    public StadeService(StadeRepository stadeRepository){
        this.stadeRepository=stadeRepository;
    }

    public List<Stade> getAll(){
        return stadeRepository.findAll();
    }
}
