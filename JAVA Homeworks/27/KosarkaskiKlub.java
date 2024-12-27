package sedmaSedmica.Ponedeljak.DomaciZadatak;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{

    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    //za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen
    @Override
    public int vrednostTima() {
        int sumaCenaSvihIgraca = 0;
        for (Igrac igrac : getListaIgraca()){
            sumaCenaSvihIgraca += (igrac.getBrojPostignutihPoena() * 50);
        }
        return sumaCenaSvihIgraca;
    }

    //sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
    public String sampionTima(){
        String sampion = "";
        for (Igrac igrac : getListaIgraca()){
            if (igrac.getBrojPostignutihPoena() > 1000){
                sampion = igrac.getIme();
            }
        }
        if (sampion.isEmpty()) {
            return "Nema igraca sa vise od 1000 poena.";
        }
        return sampion;
    }

}
