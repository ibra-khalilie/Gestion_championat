package com.example.gestion_championat.repository;

import com.example.gestion_championat.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
    List<Game> findByJourneeId(Long journeeId);

    List<Game> findAllByJourneeChampionnatId(Long championnatId);

}
