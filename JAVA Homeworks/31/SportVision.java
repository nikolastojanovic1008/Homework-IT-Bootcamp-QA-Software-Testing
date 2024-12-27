package sedmaSedmica.Utorak;

import java.util.ArrayList;

public class SportVision extends Prodavnica{

    public SportVision(int brojZaposlenih, ArrayList<Artikl> listaArtikla) {
        super(brojZaposlenih, listaArtikla);
    }

    //za black Friday daje popust od 30% na sve artikle
    @Override
    public void blackFriday() {
        double popust = 0;
        for (Artikl artikl : getListaArtikla()){
            popust = artikl.getCena() * 0.7; //znaci dobicemo 70% koji ostanu nakon popusta
            artikl.setCena(popust);
        }
    }
}
