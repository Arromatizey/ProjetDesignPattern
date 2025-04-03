package com.example.projetdesignpattern.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Technicien {
    private String nom;
    private String prenom;
    private String role;

    @Override
    public String toString() {
        return "Technicien{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
