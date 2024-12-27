package sestaSedmica.DodatniZadaci.Ishrana;

import java.util.ArrayList;

public class Voce extends Hrana{

    private boolean daLiJeCitrus;
    private static ArrayList<Voce> listaVoca = new ArrayList<>();

    public Voce(String naziv, double kcal,  ArrayList<NutritivneVrednosti> nutrijenti, boolean daLiJeCitrus) {
        super(naziv, kcal, nutrijenti);
        this.daLiJeCitrus = daLiJeCitrus;
        listaVoca.add(this);
    }

    //metoda koja ce ici kroz listuVoca i naci vocku sa najvise kalorija
    public String vockaSaNajviseKalorija(){
        double najveciBrojKalorija = getListaVoca().get(0).getKcal();
        String vockaSaNajviseKalorija = getListaVoca().get(0).getNaziv();
        for (int i = 0; i < getListaVoca().size(); i++){
            if (najveciBrojKalorija < getListaVoca().get(i).getKcal()){
                najveciBrojKalorija = getListaVoca().get(i).getKcal();

            }
        }
        return vockaSaNajviseKalorija;
    }

    //geteri i seteri
    public boolean isDaLiJeCitrus() {
        return daLiJeCitrus;
    }
    public void setDaLiJeCitrus(boolean daLiJeCitrus) {
        this.daLiJeCitrus = daLiJeCitrus;
    }
    public static ArrayList<Voce> getListaVoca() {
        return listaVoca;
    }
    public static void setListaVoca(ArrayList<Voce> listaVoca) {
        Voce.listaVoca = listaVoca;
    }

    public String toString() {
        return super.toString() + " " + daLiJeCitrus;
    }

}
