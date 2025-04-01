package com.example.projetdesignpattern.models;

public class Technicien {
    private String nom;
    private String prenom;
    // éventuellement : liste de compétences, id, etc.

    // Constructeur vide
    public Technicien() {
    }

    // Constructeur avec paramètres
    public Technicien(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters / Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Technicien{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
