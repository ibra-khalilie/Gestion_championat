package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.repository.ChampionnatRepository;
import com.example.gestion_championat.repository.JourneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionnatService  {
   private ChampionnatRepository championnatRepository;
   private JourneeRepository journeeRepository;


   public ChampionnatService(ChampionnatRepository championnatRepository, JourneeRepository journeeRepository){
       this.championnatRepository = championnatRepository;
       this.journeeRepository = journeeRepository;

   }
   public List<Championnat> getAll(){
       return championnatRepository.findAll();
   }

    public List<Journee> getAllJournees() {
        return journeeRepository.findAll();
    }

}
