package com.mojaaplikacja.pakiet1;

/**
 * Klasa reprezentująca obiekt klasy 1.
 */
public class Klasa1 {
    private String nazwa;

    /**
     * Konstruktor klasy Klasa1.
     *
     * @param nazwa Nazwa obiektu.
     */
    public Klasa1(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * Wykonuje akcję dla obiektu klasy 1.
     */
    public void wykonajAkcje() {
        System.out.println("Wykonano akcję w klasie 1: " + nazwa);
    }
}