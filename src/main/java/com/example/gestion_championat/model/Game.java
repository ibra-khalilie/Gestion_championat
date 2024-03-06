package com.example.gestion_championat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pointEquipe1;
    private int pointEquipe2;
    private int idEquipe1;
    private int idEquipe2;

    @ManyToOne
    private Stade stade;

    @ManyToOne
    private Equipe Equipe1;

    @ManyToOne
    private Equipe Equipe2;

    @ManyToOne
    private Journee journee;

}
