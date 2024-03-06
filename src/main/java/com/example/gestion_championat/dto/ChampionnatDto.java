package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.model.Pays;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChampionnatDto {
    private Long id;
    private String nom;
    private String logo;
    private Date dateDebut;
    private Date dateFin;
    private Long pointPerdu;
    private Long pointNull;
    private String typeClassement;
    private Pays pays;
    private Equipe equipe;
    private List<Journee> journeeList;
}
