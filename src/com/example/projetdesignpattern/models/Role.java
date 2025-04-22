// Role.java
package com.example.projetdesignpattern.models;

public enum Role {
    ADMIN, TECHNICIEN, VISITEUR;

    public boolean peutModifier() {
        return this == ADMIN;
    }
}
