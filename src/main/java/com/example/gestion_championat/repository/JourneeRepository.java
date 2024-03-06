package com.example.gestion_championat.repository;

import com.example.gestion_championat.model.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneeRepository extends JpaRepository<Journee,Long> {
}
