package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StadeDto {
    private Long id;
    private String nom;
    private String adresse;
    private String capacite;
    private String telephone;
    private List<Game> game;
}
