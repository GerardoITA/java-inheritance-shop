package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private boolean cablate;
    private String colore;

    public Cuffie(String nome, String descrizione, double prezzo, int iva, boolean cablate, String colore) {
        super(nome, descrizione, prezzo, iva);
        this.cablate = cablate;
        this.colore = colore;
    }

    public boolean isCablate() {
        return cablate;
    }

    public void setCablate(boolean cablate) {
        this.cablate = cablate;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    @Override
    public String toString() {
        String obj = "Nome = " + getNome() + " Descrizione = " + getDescrizione() + " Prezzo = " + getPrezzoIva() + " Cablate = " + isCablate() + " Colore = " + getColore();
        return obj;
    }
}
