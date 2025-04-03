package com.example.projetdesignpattern.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Intervention {
    protected LocalDateTime dateIntervention;  // ex: 2025-03-12 14:30
    protected Duration duree;                  // ex: 2h
    protected String lieu;                     // ex: "Paris"
    protected Technicien technicien;           // technicien assigné


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

    public abstract void demarrerIntervention();
}
