package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.Intervention;
import com.example.projetdesignpattern.models.InterventionMaintenance;
import com.example.projetdesignpattern.models.InterventionUrgence;

import java.util.Date;

public class InterventionFactory {
    public static Intervention creerIntervention(String type, Date date, String technicien, int duree, String lieu) {
        switch (type.toLowerCase()) {
            case "maintenance":
                return new InterventionMaintenance(date, technicien, duree, lieu);
            case "urgence":
                return new InterventionUrgence(date, technicien, duree, lieu);
            default:
                throw new IllegalArgumentException("Type d'intervention non supporté: " + type);
        }
    }
}