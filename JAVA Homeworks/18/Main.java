package sestaSedmica.DodatniZadaci.Prodavnica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Kupac kupac1 = new Kupac("Ana", "ana@mail.com");

        Proizvod proizvod1 = new Proizvod("Cokolada", 2);
        Proizvod proizvod2 = new Proizvod("Granola", 4);
        Proizvod proizvod3 = new Proizvod("Skyr", 3);

        ArrayList<Proizvod> listaProizvoda = new ArrayList<>();
        listaProizvoda.add(proizvod1);
        listaProizvoda.add(proizvod2);
        listaProizvoda.add(proizvod3);

        Narudzbina narudzbina1 = new Narudzbina(kupac1, listaProizvoda);

        ArrayList<Narudzbina> narudzbine = new ArrayList<>();

        ListaPorudzbina listaPorudzbina = new ListaPorudzbina();
        listaPorudzbina.dodavanjeNarudzbine(narudzbina1);

        narudzbine.add(narudzbina1);

        System.out.println("Porudzbina za: " + kupac1);
        listaPorudzbina.prikazPorudzbina();
        System.out.println("Ukupan iznos: " + narudzbina1.racun());
    }
}
