package com.example.gestion_championat.model;

public class EquipeClassement {
    private String nom;
    private int points;
    private int joues;
    private int gagnes;
    private int nuls;
    private int perdus;
    private int butsPour;
    private int butsContre;
    private int differenceButs;

    // Constructeur
    public EquipeClassement(String nom) {
        this.nom = nom;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getJoues() {
        return joues;
    }

    public void setJoues(int joues) {
        this.joues = joues;
    }

    public int getGagnes() {
        return gagnes;
    }

    public void setGagnes(int gagnes) {
        this.gagnes = gagnes;
    }

    public int getNuls() {
        return nuls;
    }

    public void setNuls(int nuls) {
        this.nuls = nuls;
    }

    public int getPerdus() {
        return perdus;
    }

    public void setPerdus(int perdus) {
        this.perdus = perdus;
    }

    public int getButsPour() {
        return butsPour;
    }

    public void setButsPour(int butsPour) {
        this.butsPour = butsPour;
    }

    public int getButsContre() {
        return butsContre;
    }

    public void setButsContre(int butsContre) {
        this.butsContre = butsContre;
    }

    public int getDifferenceButs() {
        return differenceButs;
    }

    public void setDifferenceButs(int differenceButs) {
        this.differenceButs = differenceButs;
    }
}
