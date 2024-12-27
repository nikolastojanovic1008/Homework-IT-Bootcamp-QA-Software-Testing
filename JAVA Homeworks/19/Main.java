package sestaSedmica.DodatniZadaci.Ishrana;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //VOCE
        NutritivneVrednosti vitaminBvoce = new NutritivneVrednosti("B", 10);
        NutritivneVrednosti vitaminCvoce = new NutritivneVrednosti("C", 5);
        ArrayList<NutritivneVrednosti> nutrijentiVoce = new ArrayList<>();
        nutrijentiVoce.add(vitaminBvoce);
        nutrijentiVoce.add(vitaminCvoce);

        Voce jabuka = new Voce("jabuka", 51, nutrijentiVoce, false);
        Voce limun = new Voce("limun", 29, nutrijentiVoce, true);
        Voce lubenica = new Voce("lubenica", 39, nutrijentiVoce, false);
        System.out.println(jabuka.daLiJeNiskoKaloricno()); //false

        System.out.println(jabuka.getNutrijenti());//[B vitamin - procenat: 10.0, Vlakna vitamin - procenat: 8.0]
        jabuka.stampanjeNutritivnihVrednosti();//B vitamin - procenat: 10.0 -> bolji output od ovog gore
        /*znaci u klasiNutritivne vrednosti imamo toString() metod koji zadaje izgled, dok metoda stampanje u Hrana klasi
        gde se nalazi lista nutrijenata stampa svaki pojedinacno u novom redu da lepse izgleda. */

        System.out.println(jabuka.nutrijentSaNajvecimProcentom());
        ArrayList<Voce> listaVoca = new ArrayList<>();
        listaVoca.add(jabuka);
        listaVoca.add(limun);
        listaVoca.add(lubenica);
        //ovo sad stampa lepo u novom redu svaki objekat voce, ali to smo mogli definisati mozda u klasi Voce
        for (Voce vocka: listaVoca){
            System.out.println(vocka);
        }
        System.out.println(listaVoca); //[jabuka 51.0 false, limun 29.0 true, lubenica 39.0 false] -> default stampanje


        //POVRCE
        NutritivneVrednosti vitaminApovrce = new NutritivneVrednosti("A", 20);
        NutritivneVrednosti vitaminCpovrce = new NutritivneVrednosti("C", 35);
        ArrayList<NutritivneVrednosti> nutrijentiPovrce = new ArrayList<>();
        nutrijentiPovrce.add(vitaminApovrce);
        nutrijentiPovrce.add(vitaminCpovrce);

        Povrce kelj = new Povrce("kelj", 50, nutrijentiPovrce, true);
        Povrce krompir = new Povrce("krompir", 75, nutrijentiPovrce, false);
        Povrce krastavac = new Povrce("krastavac", 14, nutrijentiPovrce, false);
        Povrce zelenaSalata = new Povrce("zelena salata", 17, nutrijentiPovrce, true);
        ArrayList<Povrce> listaPovrca = new ArrayList<>();
        listaPovrca.add(kelj);
        listaPovrca.add(krompir);
        listaPovrca.add(krastavac);
        listaPovrca.add(zelenaSalata);
        System.out.println(krompir.daLiJeNiskoKaloricno());


        //ZITARICE
        NutritivneVrednosti proteinZitarice = new NutritivneVrednosti("protein", 15);
        NutritivneVrednosti vitaminBzitarice = new NutritivneVrednosti("B", 10);
        ArrayList<NutritivneVrednosti> nutrijentiZitarice = new ArrayList<>();
        nutrijentiZitarice.add(proteinZitarice);
        nutrijentiZitarice.add(vitaminBzitarice);

        Zitarice psenica = new Zitarice("psenica", 329, nutrijentiZitarice, 13);
        Zitarice ovas = new Zitarice("ovas", 379, nutrijentiZitarice, 10);
        Zitarice raz = new Zitarice("raz", 335, nutrijentiZitarice, 8);

        System.out.println(Zitarice.sumaSadrzajaVlakana());
    }
}
