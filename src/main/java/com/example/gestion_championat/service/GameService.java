package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Game;
import com.example.gestion_championat.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    private GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }


    public List<Game> getAll(){
        return this.gameRepository.findAll();
    }
}
