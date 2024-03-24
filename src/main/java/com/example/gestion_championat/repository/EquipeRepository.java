package com.example.gestion_championat.repository;

import com.example.gestion_championat.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {

    Equipe findByNom(String nom);

}
