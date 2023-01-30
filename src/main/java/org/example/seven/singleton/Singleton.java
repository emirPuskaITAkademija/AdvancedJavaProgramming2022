package org.example.seven.singleton;

public enum Singleton {
    INSTANCE;

    private Singleton(){
        System.out.println("Kreiram instancu pozivajuc konstruktor...");
    }
}
