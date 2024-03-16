package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Equipe;
import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.model.Stade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameDto {
    private Long id;
    private int pointEquipe1;
    private int pointEquipe2;
    private int idEquipe1;
    private int idEquipe2;
    private Stade stade;
    private Equipe equipe1;
    private Equipe equipe2;
    private Journee journee;
    private Date date;
}
