// Subject.java
package com.example.projetdesignpattern.observer;

public interface Subject {
    void ajouterObservateur(Observer observer);
    void supprimerObservateur(Observer observer);
    void notifierObservateurs(String message);
}
