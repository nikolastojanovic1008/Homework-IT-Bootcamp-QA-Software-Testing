package sedmaSedmica.Ponedeljak.DomaciZadatak;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub{

    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    //za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol
    @Override
    public int vrednostTima() {
        int sumaCenaSvihIgraca = 0;
        for (Igrac igrac : getListaIgraca()){
            sumaCenaSvihIgraca += (igrac.getBrojPostignutihPoena() * 1000);
        }
        return sumaCenaSvihIgraca;
    }

    //najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene)
    public String najboljiStrelac(){
        String igracSaNajviseGolova = getListaIgraca().get(0).getIme();
        int najveciBrojGolova = getListaIgraca().get(0).getBrojPostignutihPoena();

        for (Igrac igrac : getListaIgraca()){
            if (najveciBrojGolova < igrac.getBrojPostignutihPoena()){
                najveciBrojGolova = igrac.getBrojPostignutihPoena();
                igracSaNajviseGolova = igrac.getIme();
            }
        }
        return igracSaNajviseGolova;
    }

}
