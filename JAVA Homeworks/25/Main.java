package sestaSedmica.Petak.DomaciZadatak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ROMANOPISAC
        ArrayList<Knjiga> romani = new ArrayList<>();
        Knjiga roman1 = new Knjiga("Roman 1", 33, 1993);
        Knjiga roman2 = new Knjiga("Roman 2", 32, 1985);
        Knjiga roman3 = new Knjiga("Roman 3", 501, 1987);
        romani.add(roman1);
        romani.add(roman2);
        romani.add(roman3);

        Romanopisac romanopisac = new Romanopisac("Romanopisac", 1940, romani);

        System.out.println("Najpoznatija knjiga koju je " + romanopisac.getIme() + " napisao je: " + romanopisac.najpoznatijaKnjiga() + ".");
        System.out.println("Vreme pisanja romana je: " + romanopisac.vremePisanja() + " godina.");
        romanopisac.dugometrazniRoman();

        //PESNIK
        ArrayList<Knjiga> zbirkaPoezije = new ArrayList<>();
        Knjiga poezija1 = new Knjiga("Poezija 1", 80, 2000);
        Knjiga poezija2 = new Knjiga("Poezija 2", 90, 2001);
        Knjiga poezija3 = new Knjiga("Poezija 3", 100, 2002);
        zbirkaPoezije.add(poezija1);
        zbirkaPoezije.add(poezija2);
        zbirkaPoezije.add(poezija3);

        Pesnik pesnik = new Pesnik("Pesnik", 1990, zbirkaPoezije);

        System.out.println("Najpoznatija knjiga koju je " + pesnik.getIme() + " napisao je: " + pesnik.najpoznatijaKnjiga() + ".");
        System.out.println("Vreme pisanja poezije je: " + pesnik.vremePisanja() + " godina.");
        System.out.println("Broj zbirki poezije koje je " + pesnik.getIme() + " napisao sa manje od 100 strana iznosi: " + pesnik.brojZbirki() + ".");

        //ESEJISTA
        ArrayList<Knjiga> eseji = new ArrayList<>();
        Knjiga esej1 = new Knjiga("Esej 1", 45, 2010);
        Knjiga esej2 = new Knjiga("Esej 2", 55, 2011);
        Knjiga esej3 = new Knjiga("Esej 3", 40, 2020);
        eseji.add(esej1);
        eseji.add(esej2);
        eseji.add(esej3);

        Esejista esejista = new Esejista("Esejista", 1985, eseji);

        System.out.println("Najpoznatija knjiga koju je " + esejista.getIme() + " napisao je: " + esejista.najpoznatijaKnjiga() + ".");
        System.out.println("Vreme pisanja eseja je: " + esejista.vremePisanja() + " godina.");
        System.out.println("Broj eseja koje je " + esejista.getIme() + " napisao sa manje od 50 strana iznosi: " + esejista.kratkiEseji() + ".");
    }
}
