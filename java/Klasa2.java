package com.mojaaplikacja.pakiet2;

/**
 * Klasa reprezentująca obiekt klasy 2.
 */
public class Klasa2 {
    private int liczba;

    /**
     * Konstruktor klasy Klasa2.
     *
     * @param liczba Liczba obiektu.
     */
    public Klasa2(int liczba) {
        this.liczba = liczba;
    }

    /**
     * Wykonuje akcję dla obiektu klasy 2.
     */
    public void wykonajAkcje() {
        System.out.println("Wykonano akcję w klasie 2: " + liczba);
    }
}