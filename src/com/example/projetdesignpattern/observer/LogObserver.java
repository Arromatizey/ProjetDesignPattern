// LogObserver.java
package com.example.projetdesignpattern.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogObserver implements Observer {
    private static final String LOG_FILE = "notifications.log";

    @Override
    public void update(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println("📝 LogObserver : " + message);
        } catch (IOException e) {
            System.out.println("❌ Erreur lors de l'écriture dans le fichier log : " + e.getMessage());
        }
    }
}
