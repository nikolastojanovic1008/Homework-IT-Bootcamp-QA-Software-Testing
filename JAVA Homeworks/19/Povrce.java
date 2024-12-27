package sestaSedmica.DodatniZadaci.Ishrana;

import java.util.ArrayList;

public class Povrce extends Hrana{

    private boolean daLiJeLisnato;
    private static ArrayList<Povrce> listaPovrca = new ArrayList<>();

    public Povrce(String naziv, double kcal, ArrayList<NutritivneVrednosti> nutrijenti, boolean daLiJeLisnato) {
        super(naziv, kcal, nutrijenti);
        this.daLiJeLisnato = daLiJeLisnato;
        listaPovrca.add(this);
    }

    //metoda koja ide kroz listu povrca i vraca listu lisnatog porvca
    public ArrayList<Povrce> listaLisnatogPovrca(ArrayList<Povrce> listaPovrca){
        ArrayList<Povrce> listaLisnatogPovrca = new ArrayList<>();
        for (Povrce povrce : getListaPovrca()){
            if (povrce.daLiJeLisnato){
                listaLisnatogPovrca.add(povrce);
            }
        }
        return listaLisnatogPovrca;
    }

    //geteri i seteri
    public boolean isDaLiJeLisnato() {
        return daLiJeLisnato;
    }
    public void setDaLiJeLisnato(boolean daLiJeLisnato) {
        this.daLiJeLisnato = daLiJeLisnato;
    }
    public static ArrayList<Povrce> getListaPovrca() {
        return listaPovrca;
    }
    public static void setListaPovrca(ArrayList<Povrce> listaPovrca) {
        Povrce.listaPovrca = listaPovrca;
    }

    public String toString() {
        return super.toString() + " " + daLiJeLisnato;
    }

}
