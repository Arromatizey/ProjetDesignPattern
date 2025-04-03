package com.example.projetdesignpattern.decorators;

import com.example.projetdesignpattern.models.Intervention;

public class PiecesJointesDecorator extends InterventionDecorator {

    public PiecesJointesDecorator(Intervention intervention) {
        super(intervention);
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("📎 Pièces jointes ajoutées.");
    }

    @Override
    public void setTechnicien(String technicien) {
        intervention.setTechnicien(technicien);
    }
}

