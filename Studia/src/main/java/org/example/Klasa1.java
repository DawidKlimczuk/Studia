package com.mojaaplikacja.pakiet1;

public class Klasa1 {
    private String nazwa;

    public Klasa1(String nazwa) {
        this.nazwa = nazwa;
    }

    public void wykonajAkcje() {
        System.out.println("Wykonano akcję w klasie 1: " + nazwa);
    }
}
