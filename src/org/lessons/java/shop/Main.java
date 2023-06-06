package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi acquistare uno smartphone, televisore, cuffie o uscire?");
        String prodotto = scanner.next();

        if (prodotto.equalsIgnoreCase("smartphone")) {
            System.out.println("Inserire nome");
            String nome = scanner.next();
            System.out.println("Inserire descrizione");
            String descrizione = scanner.next();
            System.out.println("Inserire prezzo");
            double prezzo = scanner.nextDouble();
            System.out.println("Inserire iva");
            int iva = scanner.nextInt();
            System.out.println("Inserire memoria");
            int memoria = scanner.nextInt();

            Smartphone oggetto = new Smartphone(nome, descrizione, prezzo, iva,  memoria);
            System.out.println(oggetto);
        }
        if (prodotto.equalsIgnoreCase("televisore")) {
            System.out.println("Inserire nome");
            String nome = scanner.next();
            System.out.println("Inserire descrizione");
            String descrizione = scanner.next();
            System.out.println("Inserire prezzo");
            double prezzo = scanner.nextDouble();
            System.out.println("Inserire iva");
            int iva = scanner.nextInt();
            System.out.println("Inserire smart");
            boolean smart = scanner.nextBoolean();
            System.out.println("Inserire dimensioni");
            int dimensioni = scanner.nextInt();

            Televisore oggetto = new Televisore(nome, descrizione, prezzo, iva,  smart, dimensioni);
            System.out.println(oggetto);
        }
        if (prodotto.equalsIgnoreCase("cuffie")) {
            System.out.println("Inserire nome");
            String nome = scanner.next();
            System.out.println("Inserire descrizione");
            String descrizione = scanner.next();
            System.out.println("Inserire prezzo");
            double prezzo = scanner.nextDouble();
            System.out.println("Inserire iva");
            int iva = scanner.nextInt();
            System.out.println("Inserire cablate");
            boolean cablate = scanner.nextBoolean();
            System.out.println("Inserire colore");
            String colore = scanner.next();

            Cuffie oggetto = new Cuffie(nome, descrizione, prezzo, iva,  cablate, colore);
            System.out.println(oggetto);
        }
        else {
            System.out.println("Scelta non valida");
        }






    }
}
