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

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    @Override
    public String toString() {
        String obj = "Nome = " + getNome() + " Descrizione = " + getDescrizione() + " Prezzo = " + getPrezzoIva() + " Smart = " + isSmart() + " Dimensioni = " + getDimensioni();
        return obj;
    }
}
