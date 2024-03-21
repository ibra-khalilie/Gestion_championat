package com.example.gestion_championat.service;

import com.example.gestion_championat.dto.ChampionnatDto;
import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.model.EquipeClassement;
import com.example.gestion_championat.model.Game;
import com.example.gestion_championat.repository.ChampionnatRepository;
import com.example.gestion_championat.repository.EquipeRepository;
import com.example.gestion_championat.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ChampionnatService {


    private ChampionnatRepository championnatRepository;


    private GameRepository gameRepository;


    public ChampionnatService(ChampionnatRepository championnatRepository, GameRepository gameRepository, EquipeRepository equipeRepository) {
        this.championnatRepository = championnatRepository;
        this.gameRepository = gameRepository;
    }

    public List<Championnat> getAll() {
        return championnatRepository.findAll();
    }

    public Championnat getChampionnatById(Long id){
        return championnatRepository.findChampionnatById(id);
    }

    public List<EquipeClassement> calculerClassement(Long championnatId) {
        List<Game> games = gameRepository.findAllByJourneeChampionnatId(championnatId);
        Map<Long, EquipeClassement> classement = new HashMap<>();


        for (Game game : games) {
            updateStats(classement, game);
        }

        return classement.values().stream()
                .sorted(Comparator.comparingInt(EquipeClassement::getPoints).reversed())
                .collect(Collectors.toList());

    }

    private void updateStats(Map<Long, EquipeClassement> classement, Game game) {
        Equipe equipe1 = game.getEquipe1();
        Equipe equipe2 = game.getEquipe2();

        EquipeClassement statsEquipe1 = classement.computeIfAbsent(equipe1.getId(), k -> new EquipeClassement(equipe1.getNom()));
        EquipeClassement statsEquipe2 = classement.computeIfAbsent(equipe2.getId(), k -> new EquipeClassement(equipe2.getNom()));

        int butsEquipe1 = game.getPointEquipe1();
        int butsEquipe2 = game.getPointEquipe2();

        // Mise à jour des buts pour et contre
        statsEquipe1.setButsPour(statsEquipe1.getButsPour() + butsEquipe1);
        statsEquipe1.setButsContre(statsEquipe1.getButsContre() + butsEquipe2);
        statsEquipe2.setButsPour(statsEquipe2.getButsPour() + butsEquipe2);
        statsEquipe2.setButsContre(statsEquipe2.getButsContre() + butsEquipe1);

        // Mise à jour de la différence de buts
        statsEquipe1.setDifferenceButs(statsEquipe1.getButsPour() - statsEquipe1.getButsContre());
        statsEquipe2.setDifferenceButs(statsEquipe2.getButsPour() - statsEquipe2.getButsContre());

        // Mise à jour des points, des victoires, nuls, et pertes
        if (butsEquipe1 > butsEquipe2) {
            // Equipe 1 gagne
            statsEquipe1.setPoints(statsEquipe1.getPoints() + 3);
            statsEquipe1.setGagnes(statsEquipe1.getGagnes() + 1);
            statsEquipe2.setPerdus(statsEquipe2.getPerdus() + 1);
        } else if (butsEquipe1 < butsEquipe2) {
            // Equipe 2 gagne
            statsEquipe2.setPoints(statsEquipe2.getPoints() + 3);
            statsEquipe2.setGagnes(statsEquipe2.getGagnes() + 1);
            statsEquipe1.setPerdus(statsEquipe1.getPerdus() + 1);
        } else {
            // Match nul
            statsEquipe1.setPoints(statsEquipe1.getPoints() + 1);
            statsEquipe2.setPoints(statsEquipe2.getPoints() + 1);
            statsEquipe1.setNuls(statsEquipe1.getNuls() + 1);
            statsEquipe2.setNuls(statsEquipe2.getNuls() + 1);
        }

        // Mise à jour du nombre de matchs joués
        statsEquipe1.setJoues(statsEquipe1.getJoues() + 1);
        statsEquipe2.setJoues(statsEquipe2.getJoues() + 1);

        classement.put(equipe1.getId(), statsEquipe1);
        classement.put(equipe2.getId(), statsEquipe2);
    }

}
