package com.mojaaplikacja.test;

import com.mojaaplikacja.pakiet1.Klasa1;
import com.mojaaplikacja.pakiet2.Klasa2;

public class TestowaKlasa {
    public static void main(String[] args) {
        Klasa1 klasa1 = new Klasa1("Obiekt 1");
        Klasa2 klasa2 = new Klasa2(10);

        klasa1.wykonajAkcje();
        klasa2.wykonajAkcje();
    }
}