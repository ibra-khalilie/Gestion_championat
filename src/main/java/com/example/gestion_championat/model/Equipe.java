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
public class Equipe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

    @ManyToOne
    private Stade stade;

    @ManyToMany
    @JoinTable(name = "equipe_championnat",
            joinColumns = @JoinColumn(name = "equipe_id"),
            inverseJoinColumns = @JoinColumn(name = "championnat_id"))
    private List<Championnat> championnatList;

}
