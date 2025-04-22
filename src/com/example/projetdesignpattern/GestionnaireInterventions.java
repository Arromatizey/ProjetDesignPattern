package com.example.projetdesignpattern;

import com.example.projetdesignpattern.models.Intervention;
import com.example.projetdesignpattern.observer.Observer;
import com.example.projetdesignpattern.observer.Subject;
import com.example.projetdesignpattern.proxy.IGestionnaireInterventions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionnaireInterventions implements Subject, IGestionnaireInterventions {
    private List<Intervention> interventions = new ArrayList<>();
    private static final String FICHIER_LOG = "interventions.log";
    private List<Observer> observateurs = new ArrayList<>();


    // 🏭 Méthode simple pour créer une intervention via la Factory
    public void creerIntervention(String type, Date date, String technicien, int duree, String lieu) {
        Intervention intervention = InterventionFactory.creerIntervention(type, date, technicien, duree, lieu);
        interventions.add(intervention);
        System.out.println("✅ Intervention ajoutée !");
        notifierObservateurs("Nouvelle intervention créée : " + intervention.toString());

    }

    // 👷‍♂️ Méthode simple pour assigner un technicien à une intervention
    public void assignerTechnicien(int interventionIndex, String technicien) {
        if (interventionIndex >= 0 && interventionIndex < interventions.size()) {
            Intervention intervention = interventions.get(interventionIndex);
            intervention.setTechnicien(technicien);
            System.out.println("✅ Technicien assigné : " + technicien);
            notifierObservateurs("Technicien assigné à l'intervention : " + intervention.toString());
        } else {
            System.out.println("❌ Intervention non trouvée.");
        }
    }

    // 💾 Méthode simple pour sauvegarder les interventions dans un fichier .log
    public void sauvegarder() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FICHIER_LOG, true))) {
            for (Intervention intervention : interventions) {
                writer.println(intervention);
            }
            System.out.println("✅ Sauvegarde LOG réussie !");
        } catch (IOException e) {
            System.out.println("❌ Erreur lors de la sauvegarde LOG : " + e.getMessage());
        }
    }

    // 📜 Méthode simple pour afficher toutes les interventions
    public void afficherInterventions() {
        interventions.forEach(Intervention::afficherDetails);
    }

    @Override
    public void ajouterObservateur(Observer observer) {
        observateurs.add(observer);
    }

    @Override
    public void supprimerObservateur(Observer observer) {
        observateurs.remove(observer);
    }

    @Override
    public void notifierObservateurs(String message) {
        for (Observer observer : observateurs) {
            observer.update(message);
        }
    }
}
