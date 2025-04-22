// ConsoleObserver.java
package com.example.projetdesignpattern.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("📢 ConsoleObserver : " + message);
    }
}
