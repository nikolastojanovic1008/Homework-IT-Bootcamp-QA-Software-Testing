package sedmaSedmica.Ponedeljak.DomaciZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //KOSARKA
        ArrayList<Igrac> listaIgracaKosarka = new ArrayList<>();
        Igrac igrac1K = new Igrac("Igrac 1", 7, 10);
        Igrac igrac2K = new Igrac("Igrac 2", 9, 20);
        Igrac igrac3K = new Igrac("Igrac 3", 20, 1001);
        listaIgracaKosarka.add(igrac1K);
        listaIgracaKosarka.add(igrac2K);
        listaIgracaKosarka.add(igrac3K);

        KosarkaskiKlub kosarka = new KosarkaskiKlub("KK", "Novi Sad", listaIgracaKosarka);

        System.out.println("Najiskusniji igrac u kosarkaskom klubu je: " + kosarka.najiskusnijiIgrac());
        System.out.println("Ukupan broj poena koji su postigli svi igraci u Kosarkaskom klubu iznosi: " + kosarka.ukupnoPoena());
        System.out.println("Vrednost kosarkaskog tima iznosi: " + kosarka.vrednostTima());
        System.out.println("Igrac kosarkaskog kluba koji ima vise od 1000 postignutih poena je: " + kosarka.sampionTima());

        //FUDBAL
        ArrayList<Igrac> listaIgracaFudbal = new ArrayList<>();
        Igrac igrac1F = new Igrac("Igrac 1", 12, 50);
        Igrac igrac2F = new Igrac("Igrac 2", 7, 50);
        Igrac igrac3F = new Igrac("Igrac 3", 4, 30);
        listaIgracaFudbal.add(igrac1F);
        listaIgracaFudbal.add(igrac2F);
        listaIgracaFudbal.add(igrac3F);

        FudbalskiKlub fudbal = new FudbalskiKlub("FK", "Kikinda", listaIgracaFudbal);

        System.out.println("Najiskusniji igrac u fudbalskom klubu je: " + fudbal.najiskusnijiIgrac());
        System.out.println("Ukupan broj poena koji su postigli svi igraci u fudbalskom klubu iznosi: " + fudbal.ukupnoPoena());
        System.out.println("Vrednost fudbalskog tima iznosi: " + fudbal.vrednostTima());
        System.out.println("Igrac fudbalskog kluba koji ima najvise postignutih golova je: " + fudbal.najboljiStrelac());

        //ODBOJKA
        ArrayList<Igrac> listaIgracaOdbojka = new ArrayList<>();
        Igrac igrac1_o = new Igrac("Igrac 1", 2, 420);
        Igrac igrac2_o = new Igrac("Igrac 2", 4, 150);
        Igrac igrac3_o = new Igrac("Igrac 3", 2, 290);
        listaIgracaOdbojka.add(igrac1_o);
        listaIgracaOdbojka.add(igrac2_o);
        listaIgracaOdbojka.add(igrac3_o);

        OdbojkaskiKlub odbojka = new OdbojkaskiKlub("OK", "Beograd", listaIgracaOdbojka);

        System.out.println("Najiskusniji igrac u odbojkaskom klubu je: " + odbojka.najiskusnijiIgrac());
        System.out.println("Ukupan broj poena koji su postigli svi igraci u odbojkaskom klubu iznosi: " + odbojka.ukupnoPoena());
        System.out.println("Vrednost odbojkaskog tima iznosi: " + odbojka.vrednostTima());
        System.out.println("Igrac odbojkaskog kluba koji ima najvise poena, ali je igrao manje od 3 godine je: " + odbojka.odbrambeniAs());
    }
}
