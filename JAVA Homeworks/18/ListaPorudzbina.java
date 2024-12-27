package sestaSedmica.DodatniZadaci.Prodavnica;

import java.util.ArrayList;

public class ListaPorudzbina {

    private ArrayList<Narudzbina> narudzbine;

    public ListaPorudzbina(){
        this.narudzbine = new ArrayList<>();
    }

    //metode
    public void dodavanjeNarudzbine(Narudzbina narudzbina){
        getNarudzbine().add(narudzbina);
    }

    public void prikazPorudzbina(){
        for (Narudzbina narudzbina: narudzbine){
            for (Proizvod proizvod: narudzbina.getProizvodi()){
                System.out.println(proizvod);
            }
            //System.out.println();
        }
    }

    //geteri i seteri
    public ArrayList<Narudzbina> getNarudzbine() {
        return narudzbine;
    }
    public void setNarudzbine(ArrayList<Narudzbina> narudzbine) {
        this.narudzbine = narudzbine;
    }

}
