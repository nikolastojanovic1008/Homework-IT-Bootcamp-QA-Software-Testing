package sedmaSedmica.Utorak;

import java.util.ArrayList;

public class Reserved extends Prodavnica{

    private double ocekivanaGodZarada;

    public Reserved(int brojZaposlenih, ArrayList<Artikl> listaArtikla, double ocekivanaGodZarada) {
        super(brojZaposlenih, listaArtikla);
        this.ocekivanaGodZarada = ocekivanaGodZarada;
    }

    /*dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
    svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100. */

    @Override
    public double ukupnaZarada() {
        double zarada = 0;

        for (Artikl artikl : getListaArtikla()){
            zarada += artikl.getCena();
        }

        if (zarada >= getOcekivanaGodZarada()){
            return zarada - (getBrojZaposlenih() * 200);
        }else {
            return zarada - (getBrojZaposlenih() * 100);
        }
    }

    public double getOcekivanaGodZarada() {
        return ocekivanaGodZarada;
    }
    public void setOcekivanaGodZarada(double ocekivanaGodZarada) {
        this.ocekivanaGodZarada = ocekivanaGodZarada;
    }

}
