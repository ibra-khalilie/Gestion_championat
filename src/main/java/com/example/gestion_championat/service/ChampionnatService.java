package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.repository.ChampionnatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionnatService  {
   private ChampionnatRepository championnatRepository;


   public ChampionnatService(ChampionnatRepository championnatRepository){
       this.championnatRepository = championnatRepository;

   }

   public List<Championnat> getAll(){
       return championnatRepository.findAll();
   }
}
