package com.example.projetdesignpattern.decorators;

import com.example.projetdesignpattern.models.Intervention;

public class SuiviGPSDecorator extends InterventionDecorator {

    public SuiviGPSDecorator(Intervention intervention) {
        super(intervention);
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("📍 Suivi GPS activé.");
    }

    @Override
    public void setTechnicien(String technicien) {
        intervention.setTechnicien(technicien);
    }


}

