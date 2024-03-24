package com.example.gestion_championat.repository;

import com.example.gestion_championat.dto.ChampionnatDto;
import com.example.gestion_championat.model.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {

    Championnat findChampionnatById(Long id);

}
