package com.example.projetdesignpattern.models;

import java.time.Duration;
import java.time.LocalDateTime;

public class InterventionUrgence extends Intervention {

    public InterventionUrgence() {
    }

    public InterventionUrgence(LocalDateTime dateIntervention, Duration duree, String lieu, Technicien technicien) {
        super(dateIntervention, duree, lieu, technicien);
    }

    @Override
    public void demarrerIntervention() {
        System.out.println("Démarrage d'une intervention d'URGENCE ! Priorité absolue. Lieu : " + lieu);
    }
}
