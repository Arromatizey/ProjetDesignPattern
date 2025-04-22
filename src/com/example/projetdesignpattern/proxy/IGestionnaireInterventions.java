package com.example.projetdesignpattern.proxy;

public interface IGestionnaireInterventions {
    void creerIntervention(String type, java.util.Date date, String technicien, int duree, String lieu);
    void assignerTechnicien(int interventionIndex, String technicien);
    void sauvegarder();
    void afficherInterventions();
}
