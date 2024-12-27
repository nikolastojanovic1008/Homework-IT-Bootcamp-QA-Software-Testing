package sedmaSedmica.Utorak;

import java.util.ArrayList;

public class HM extends Prodavnica{

    public HM(int brojZaposlenih, ArrayList<Artikl> listaArtikla) {
        super(brojZaposlenih, listaArtikla);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;

        for (Artikl artikl : getListaArtikla()){
            zarada += artikl.getCena();
        }
        return zarada - (getBrojZaposlenih() * 150);
    }
}
