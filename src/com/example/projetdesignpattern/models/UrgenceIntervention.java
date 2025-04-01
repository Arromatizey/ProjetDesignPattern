package com.example.projetdesignpattern.models;

import java.time.Duration;
import java.time.LocalDateTime;

public class UrgenceIntervention extends Intervention {

    public UrgenceIntervention() {
    }

    public UrgenceIntervention(LocalDateTime dateIntervention, Duration duree, String lieu, Technicien technicien) {
        super(dateIntervention, duree, lieu, technicien);
    }

    @Override
    public void demarrerIntervention() {
        System.out.println("Démarrage d'une intervention d'URGENCE ! Priorité absolue. Lieu : " + lieu);
    }
}
