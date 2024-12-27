package sedmaSedmica.Ponedeljak.DomaciZadatak;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub{

    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    //za odbojkaski tim svaki igrac vredi 100 po poenu
    @Override
    public int vrednostTima() {
        int sumaCenaSvihIgraca = 0;
        for (Igrac igrac : getListaIgraca()){
            sumaCenaSvihIgraca += (igrac.getBrojPostignutihPoena() * 100);
        }
        return sumaCenaSvihIgraca;
    }

    //odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine
    public String odbrambeniAs() {
        String igracSaNajPoenaManjeOdTriGod = "";
        int najveciBrojPoena = 0;

        for (Igrac igrac : getListaIgraca()) {
            if (najveciBrojPoena < igrac.getBrojPostignutihPoena() && igrac.getGodineIskustva() < 3) {
                najveciBrojPoena = igrac.getBrojPostignutihPoena();
                igracSaNajPoenaManjeOdTriGod = igrac.getIme();
            }
        }

        if (igracSaNajPoenaManjeOdTriGod.isEmpty()) {
            return "Nema igraca koji je igrao manje od 3 godine.";
        }

        return igracSaNajPoenaManjeOdTriGod;
    }

}
