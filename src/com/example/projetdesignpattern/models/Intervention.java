package com.example.projetdesignpattern.models;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Intervention {
    protected LocalDateTime dateIntervention;  // ex: 2025-03-12 14:30
    protected Duration duree;                  // ex: 2h
    protected String lieu;                     // ex: "Paris"
    protected Technicien technicien;           // technicien assigné

    // Constructeur vide
    public Intervention() {
    }

    // Constructeur avec paramètres
    public Intervention(LocalDateTime dateIntervention, Duration duree, String lieu, Technicien technicien) {
        this.dateIntervention = dateIntervention;
        this.duree = duree;
        this.lieu = lieu;
        this.technicien = technicien;
    }

    // Getters / Setters
    public LocalDateTime getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(LocalDateTime dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    // Méthode commune qu'on pourrait override dans les sous-classes
    public void afficherDetails() {
        System.out.println("=== Intervention ===");
        System.out.println("Date : " + dateIntervention);
        System.out.println("Durée : " + duree);
        System.out.println("Lieu : " + lieu);
        if (technicien != null) {
            System.out.println("Technicien : " + technicien.getNom() + " " + technicien.getPrenom());
        } else {
            System.out.println("Aucun technicien assigné");
        }
    }

    // Méthode abstraite qu'on pourra spécialiser si nécessaire
    public abstract void demarrerIntervention();
}
