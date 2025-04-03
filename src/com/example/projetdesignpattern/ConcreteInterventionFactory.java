package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.Intervention;
import com.example.projetdesignpattern.models.InterventionMaintenance;
import com.example.projetdesignpattern.models.InterventionUrgence;

public class ConcreteInterventionFactory extends InterventionFactory {
    @Override
    public Intervention creerIntervention(String type) {
        switch (type.toLowerCase()) {
            case "maintenance":
                return new InterventionMaintenance();
            case "urgence":
                return new InterventionUrgence();
            default:
                throw new IllegalArgumentException("Type d'intervention non supporté");
        }
    }
}
