package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private boolean cablate;
    private String colore;

    public Cuffie(String nome, String descrizione, double prezzo, int iva, boolean cablate, String colore) {
        super(nome, descrizione, prezzo, iva);
        this.cablate = cablate;
        this.colore = colore;
    }
}
