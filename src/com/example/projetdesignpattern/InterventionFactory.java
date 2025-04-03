package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.Intervention;

public abstract class InterventionFactory {
    public abstract Intervention creerIntervention(String type);
}