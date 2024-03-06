package com.example.gestion_championat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Championnat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nom;
    private String logo;
    private Date dateDebut;
    private Date dateFin;
    private Long pointPerdu;
    private Long pointNull;
    private String typeClassement;

    @ManyToOne
    private Pays pays;

    @ManyToOne
    private Equipe equipe;

    @OneToMany(mappedBy = "championnat",fetch = FetchType.EAGER)
    private List<Journee> journeeList;
}
