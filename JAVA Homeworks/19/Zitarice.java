package sestaSedmica.DodatniZadaci.Ishrana;

import java.util.ArrayList;

public class Zitarice extends Hrana{

    private double sadrzajVlakana;
    //ovo mora biti staticno
    private static ArrayList<Zitarice> listaZitarica = new ArrayList<>();

    public Zitarice(String naziv, double kcal, ArrayList<NutritivneVrednosti> nutrijenti, double sadrzajVlakana) {
        super(naziv, kcal, nutrijenti);
        this.sadrzajVlakana = sadrzajVlakana;
        listaZitarica.add(this);
    }

    //metoda koja vraca ukupnu sumu sadrzaja vlakana u zitaricama
    //ona je STATICNA zato sto treba da se pozove za staticnu metodu listaZitarica
    //a ovo i ArrayList gore je staticno da bi se ova metoda mogla pozvati preko klase Zitarice u Main klasi
    public static int sumaSadrzajaVlakana(){
        int suma = 0;
        for (Zitarice zitarica : listaZitarica){
            suma += zitarica.getSadrzajVlakana();
        }
        return suma;
    }
    //geteri i seteri
    public double getSadrzajVlakana() {
        return sadrzajVlakana;
    }
    public void setSadrzajVlakana(double sadrzajVlakana) {
        this.sadrzajVlakana = sadrzajVlakana;
    }
    public static ArrayList<Zitarice> getListaZitarica() {
        return listaZitarica;
    }
    public static void setListaZitarica(ArrayList<Zitarice> listaZitarica) {
        Zitarice.listaZitarica = listaZitarica;
    }

    public String toString() {
        return super.toString() + " " + sadrzajVlakana;
    }

}
