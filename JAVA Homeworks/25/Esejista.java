package sestaSedmica.Petak.DomaciZadatak;

import java.util.ArrayList;

public class Esejista extends Pisac{

    public Esejista(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    //kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
    public int kratkiEseji(){
        int brojac = 0;
        for (Knjiga knjiga : getKnjige()){
            if (knjiga.getBrojStrana() < 50){
                brojac++;
            }
        }
        return brojac;
    }
}
