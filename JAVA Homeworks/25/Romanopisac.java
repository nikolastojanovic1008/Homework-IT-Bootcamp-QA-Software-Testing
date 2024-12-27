package sestaSedmica.Petak.DomaciZadatak;

import java.util.ArrayList;

public class Romanopisac extends Pisac{

    public Romanopisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        super(ime, godinaRodjenja, knjige);
    }

    //dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
    public void dugometrazniRoman() {
        if (getKnjige().isEmpty()) {
            System.out.println("Nema knjiga za procenu strana.");
        }
        for (Knjiga knjiga : getKnjige()) {
            if (knjiga.getBrojStrana() > 500) {
                System.out.println(knjiga.getNaslov() + " je dugometrazni roman.");
            }else{
                System.out.println(knjiga.getNaslov() + " nije dugometrazni roman.");
            }
        }
    }
}
