package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.*;
import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestionnaireInterventions gestionnaire = new GestionnaireInterventions();

        gestionnaire.creerIntervention("maintenance", new Date(), "Paul Martin", 2, "Paris");
        gestionnaire.creerIntervention("urgence", new Date(), "Jean Dupont", 1, "Lyon");

        gestionnaire.assignerTechnicien(0, "Alice Durand");  // Assigner Alice à la première intervention

        gestionnaire.sauvegarder();

        gestionnaire.afficherInterventions();
    }
}

