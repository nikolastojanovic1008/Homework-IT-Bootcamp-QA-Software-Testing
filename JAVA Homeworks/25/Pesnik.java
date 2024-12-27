package sestaSedmica.Petak.DomaciZadatak;

import java.util.ArrayList;

public class Pesnik extends Pisac{

    public Pesnik(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    //brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana
    public int brojZbirki(){
        int brojac = 0;
        for (Knjiga knjiga : getKnjige()){
            if (knjiga.getBrojStrana() < 100){
                brojac++;
            }
        }
        return brojac;
    }
}
