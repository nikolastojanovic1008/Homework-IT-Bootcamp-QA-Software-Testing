package sedmaSedmica.Utorak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Artikl> listaArtikala = new ArrayList<>();
        Artikl majica = new Artikl("majica", 2000, 2000);
        Artikl torba = new Artikl("torba", 4000, 2000);
        Artikl jakna = new Artikl("jakna", 5000, 2024);
        Artikl dzemper = new Artikl("dzemper", 2500, 2024);
        Artikl sal = new Artikl("sal", 900, 1990);
        listaArtikala.add(majica);
        listaArtikala.add(torba);
        listaArtikala.add(jakna);
        listaArtikala.add(dzemper);
        listaArtikala.add(sal);

        //HM
        HM hm = new HM(10, listaArtikala);

        System.out.println("HM");
        hm.blackFriday();
        System.out.println(hm.pronadji("jakna"));
        System.out.println(hm.triftKolekcija()); //majica, torba, sal
        System.out.println("Zarada za HM prodavnicu iznosi: " + hm.ukupnaZarada()); //750
        hm.izbaciPrestaro();
        System.out.println(hm.getListaArtikla()); //izbacen je sal jer je prestar

        //ZARA
        Zara zara = new Zara(5, listaArtikala);

        System.out.println("ZARA");
        zara.blackFriday();
        System.out.println(zara.pronadji("majica"));
        System.out.println(zara.triftKolekcija());
        System.out.println("Zarada za Zara prodavnicu iznosi: " + zara.ukupnaZarada());
        zara.izbaciPrestaro();
        System.out.println(zara.getListaArtikla());

        //RESERVED
        Reserved reserved = new Reserved(5, listaArtikala, 1000);

        System.out.println("RESERVED");
        reserved.blackFriday();
        System.out.println(reserved.pronadji("jakna"));
        System.out.println(reserved.triftKolekcija());
        System.out.println("Zarada za Reserved prodavnicu iznosi: " + reserved.ukupnaZarada());
        reserved.izbaciPrestaro();
        System.out.println(reserved.getListaArtikla());


        //SPORT VISION
        SportVision sportVision = new SportVision(8, listaArtikala);

        System.out.println("SPORT VISION");
        sportVision.blackFriday();
        System.out.println(sportVision.pronadji("kaput"));
        System.out.println(sportVision.triftKolekcija());
        System.out.println("Zarada za Sport Vision prodavnicu iznosi: " + sportVision.ukupnaZarada());
        sportVision.izbaciPrestaro();
        System.out.println(sportVision.getListaArtikla());

    }
}
