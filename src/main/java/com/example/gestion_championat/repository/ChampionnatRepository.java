package com.example.gestion_championat.repository;

import com.example.gestion_championat.model.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {
}
