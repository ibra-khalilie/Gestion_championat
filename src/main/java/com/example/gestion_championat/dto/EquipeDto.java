package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.model.Stade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipeDto {
    private Long id;
    private String nom;
    private Date dateDeCreation;
    private String logo;
    private String nomEntraineur;
    private String president;
    private String statut;
    private String Siege;
    private String numero;
    private String siteWeb;
    private Stade stade;
    private List<Championnat> championnatList;
}
