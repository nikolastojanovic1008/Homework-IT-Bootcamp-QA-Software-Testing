package sedmaSedmica.Ponedeljak.StambeniProstori;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> listaPonuda = new ArrayList<>();
        listaPonuda.add(100.0);
        listaPonuda.add(200.0);
        listaPonuda.add(300.0);

        Stan stan = new Stan(45, 900, listaPonuda);
        System.out.println(stan.najvecaPonudaIzListe());
        System.out.println(stan.cenaNekretnine());

        Kuca kuca = new Kuca(90, 1000, listaPonuda);
        System.out.println(kuca.najvecaPonudaIzListe());
        System.out.println(kuca.cenaNekretnine());

        Lokal lokal = new Lokal(35, 1500, listaPonuda);
        System.out.println(lokal.najvecaPonudaIzListe());
        System.out.println(lokal.cenaNekretnine());

    }
}
