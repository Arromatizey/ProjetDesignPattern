package com.example.projetdesignpattern;

import com.example.projetdesignpattern.decorators.PiecesJointesDecorator;
import com.example.projetdesignpattern.decorators.SuiviGPSDecorator;
import com.example.projetdesignpattern.models.Intervention;

import java.util.Date;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionnaireInterventions {
    private List<Intervention> interventions = new ArrayList<>();
    private static final String FICHIER_LOG = "interventions.log";

    // 🏭 Méthode simple pour créer une intervention via la Factory
    public void creerIntervention(String type, Date date, String technicien, int duree, String lieu) {
        Intervention intervention = InterventionFactory.creerIntervention(type, date, technicien, duree, lieu);
        interventions.add(intervention);
        System.out.println("✅ Intervention ajoutée !");
    }

    // 👷‍♂️ Méthode simple pour assigner un technicien à une intervention
    public void assignerTechnicien(int interventionIndex, String technicien) {
        if (interventionIndex >= 0 && interventionIndex < interventions.size()) {
            Intervention intervention = interventions.get(interventionIndex);
            intervention.setTechnicien(technicien);
            System.out.println("✅ Technicien assigné : " + technicien);
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
}
