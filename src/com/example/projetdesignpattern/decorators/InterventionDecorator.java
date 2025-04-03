package com.example.projetdesignpattern.decorators;

import com.example.projetdesignpattern.models.Intervention;

public abstract class InterventionDecorator implements Intervention {
    protected Intervention intervention;

    public InterventionDecorator(Intervention intervention) {
        this.intervention = intervention;
    }

    @Override
    public void afficherDetails() {
        intervention.afficherDetails();
    }
}

