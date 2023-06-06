package org.lessons.java.shop;

import java.util.Random;

public class Televisore extends Prodotto {

    private boolean smart;
    private int dimensioni;

    public Televisore(String nome, String descrizione, double prezzo, int iva, boolean smart, int dimensioni) {
        super(nome, descrizione, prezzo, iva);
        this.smart = smart;

        this.dimensioni = dimensioni > 0 ? dimensioni : null;
    }
}
