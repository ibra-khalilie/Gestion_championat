package com.example.gestion_championat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nom;
    private String adresse;
    private String capacite;
    private String telephone;
    @OneToMany(mappedBy = "stade")
    private List<Equipe> equipe;
    @OneToMany(mappedBy ="stade" )
    private List<Game> game;


}
