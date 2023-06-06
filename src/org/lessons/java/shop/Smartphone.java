package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

    static Random random = new Random();
    private String imei;
    private int memoria;

    static String creaImei(){
        String codice = "";

        while (codice.length() < 15) {
            int n = random.nextInt(0,9);

            String nString = Integer.toString(n);

            codice += nString;
        }


        return codice;
    }
    public Smartphone(String nome, String descrizione, double prezzo, int iva, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.memoria = memoria;
        this.imei = creaImei();

    }

    public String getImei() {
        return imei;
    }

    private void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        String obj = "Nome = " + getNome() + " Descrizione = " + getDescrizione() + " Prezzo = " + getPrezzoIva() + " Memoria = " + getMemoria() + " Imei = " + getImei();
        return obj;
    }
}
