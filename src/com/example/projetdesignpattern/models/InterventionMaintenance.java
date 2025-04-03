package com.example.projetdesignpattern.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InterventionMaintenance implements Intervention {
    private Date date;
    private String technicien;
    private int duree;
    private String lieu;

    @Override
    public void afficherDetails() {
        System.out.println("🛠 Intervention de Maintenance");
        System.out.println("📅 Date : " + date);
        System.out.println("👨‍🔧 Technicien : " + technicien);
        System.out.println("⏳ Durée : " + duree + " heures");
        System.out.println("📍 Lieu : " + lieu);
    }

    @Override
    public String toString() {
        return "Maintenance{Date=" + date + ", Technicien='" + technicien + "', Durée=" + duree + "h, Lieu='" + lieu + "'}";
    }
}

