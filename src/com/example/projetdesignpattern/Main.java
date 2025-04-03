package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        // Création d'un technicien
        Technicien t = new Technicien("Dupont", "Jean");

        // Création d'une intervention Maintenance
        InterventionMaintenance maintenance = new InterventionMaintenance(
                LocalDateTime.now(),
                Duration.ofHours(2),
                "Paris",
                t
        );

        // Appel d'une méthode pour afficher
        maintenance.afficherDetails();
        maintenance.demarrerIntervention();

        System.out.println("--------------------");

        // Création d'une intervention Urgence
        InterventionUrgence urgence = new InterventionUrgence(
                LocalDateTime.now(),
                Duration.ofHours(1),
                "Marseille",
                t
        );
        urgence.afficherDetails();
        urgence.demarrerIntervention();
    }
}
