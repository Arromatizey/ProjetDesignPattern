// ProxyGestionnaireInterventions.java
package com.example.projetdesignpattern.proxy;

import com.example.projetdesignpattern.GestionnaireInterventions;
import com.example.projetdesignpattern.models.Technicien;

import java.util.Date;

public class ProxyGestionnaireInterventions implements IGestionnaireInterventions {
    private Technicien technicien;
    private GestionnaireInterventions vraiGestionnaire;

    public ProxyGestionnaireInterventions(Technicien technicien) {
        this.technicien = technicien;
        this.vraiGestionnaire = new GestionnaireInterventions();
    }

    private boolean peutModifier() {
        return technicien.getRole().peutModifier();
    }

    @Override
    public void creerIntervention(String type, Date date, String tech, int duree, String lieu) {
        if (peutModifier()) {
            vraiGestionnaire.creerIntervention(type, date, tech, duree, lieu);
        } else {
            System.out.println("🚫 Accès refusé à " + technicien + " pour la création d'intervention.");
        }
    }

    @Override
    public void assignerTechnicien(int index, String tech) {
        if (peutModifier()) {
            vraiGestionnaire.assignerTechnicien(index, tech);
        } else {
            System.out.println("🚫 Accès refusé à " + technicien + " pour l’assignation de technicien.");
        }
    }

    @Override
    public void sauvegarder() {
        if (peutModifier()) {
            vraiGestionnaire.sauvegarder();
        } else {
            System.out.println("🚫 Accès refusé à " + technicien + " pour la sauvegarde.");
        }
    }

    @Override
    public void afficherInterventions() {
        vraiGestionnaire.afficherInterventions();
    }
}
