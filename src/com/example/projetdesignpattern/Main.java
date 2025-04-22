package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.Role;
import com.example.projetdesignpattern.models.Technicien;
import com.example.projetdesignpattern.observer.ConsoleObserver;
import com.example.projetdesignpattern.observer.LogObserver;
import com.example.projetdesignpattern.proxy.IGestionnaireInterventions;
import com.example.projetdesignpattern.proxy.ProxyGestionnaireInterventions;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestionnaireInterventions gestionnaire = new GestionnaireInterventions();
        Technicien admin = new Technicien("Anis", "Ben", Role.ADMIN);
        Technicien simpleTech = new Technicien("Lina", "Bouk", Role.TECHNICIEN);

        IGestionnaireInterventions gestionAdmin = new ProxyGestionnaireInterventions(admin);
        IGestionnaireInterventions gestionTech = new ProxyGestionnaireInterventions(simpleTech);

        System.out.println("\n--- 🔐 Admin ---");
        gestionAdmin.creerIntervention("maintenance", new Date(), "Jean", 3, "Paris");
        gestionAdmin.assignerTechnicien(0, "Alice");
        gestionAdmin.sauvegarder();
        gestionAdmin.afficherInterventions();

        System.out.println("\n--- 🔒 Technicien (lecture seule) ---");
        gestionTech.creerIntervention("urgence", new Date(), "Paul", 1, "Lyon");
        gestionTech.assignerTechnicien(0, "Chloe");
        gestionTech.sauvegarder();
        gestionTech.afficherInterventions();
        // Ajouter les observateurs
        gestionnaire.ajouterObservateur(new ConsoleObserver());
        gestionnaire.ajouterObservateur(new LogObserver());

        gestionnaire.creerIntervention("maintenance", new Date(), "Paul Martin", 2, "Paris");
        gestionnaire.creerIntervention("urgence", new Date(), "Jean Dupont", 1, "Lyon");

        gestionnaire.assignerTechnicien(0, "Alice Durand");  // Assigner Alice à la première intervention

        gestionnaire.sauvegarder();

        gestionnaire.afficherInterventions();
    }
}

