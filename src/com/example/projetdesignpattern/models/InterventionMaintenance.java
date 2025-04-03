package com.example.projetdesignpattern.models;

import java.time.Duration;
import java.time.LocalDateTime;

public class InterventionMaintenance extends Intervention {

    public InterventionMaintenance() {
        // super() implicite
    }

    public InterventionMaintenance(LocalDateTime dateIntervention, Duration duree, String lieu, Technicien technicien) {
        super(dateIntervention, duree, lieu, technicien);
    }

    @Override
    public void demarrerIntervention() {
        System.out.println("Démarrage de l'intervention de MAINTENANCE sur le site : " + lieu);
    }
}
