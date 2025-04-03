package com.example.projetdesignpattern.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public interface Intervention {
    void afficherDetails();
    void setTechnicien(String technicien);  // Assigner un technicien
    String toString();  // Retourner une représentation textuelle de l'intervention

}
