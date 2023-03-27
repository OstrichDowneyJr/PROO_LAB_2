package src;

import src.Otoczenia.Klamry;
import src.Otoczenia.Nawiasy;

public class Main {
    public static void main(String[] args) {
        Napis tekst1 = new Tekst("jakis string");
        System.out.println(tekst1.pobierzZawartosc());

        Otoczenie nawiasy = new Nawiasy(tekst1);
        System.out.println(nawiasy.pobierzZawartosc());

        Otoczenie klamry = new Klamry(tekst1);
        System.out.println(klamry.pobierzZawartosc());

        Otoczenie mix = new Klamry(new Nawiasy(new Klamry(tekst1)));
        System.out.println(mix.pobierzZawartosc());

        Otoczenie mix2 = new Klamry(new Nawiasy(new Klamry("oto zadanie 2")));
        System.out.println(mix2.pobierzZawartosc());
    }
    
}