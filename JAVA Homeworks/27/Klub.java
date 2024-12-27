package sedmaSedmica.Ponedeljak.DomaciZadatak;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaIgraca;

    public Klub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }

    //METODE
    //najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
    public String najiskusnijiIgrac(){
        int godine = getListaIgraca().get(0).getGodineIskustva();
        String igracSaNajviseGodIskustva = getListaIgraca().get(0).getIme();

        for (Igrac igrac : getListaIgraca()){
            if (godine < igrac.getGodineIskustva()){
                godine = igrac.getGodineIskustva();
                igracSaNajviseGodIskustva = igrac.getIme();
            }
        }
        return igracSaNajviseGodIskustva;
    }

    //ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu
    public int ukupnoPoena(){
        int brojPoenaSvihIgraca = 0;

        for (Igrac igrac : getListaIgraca()){
            brojPoenaSvihIgraca += igrac.getBrojPostignutihPoena();
        }
        return brojPoenaSvihIgraca;
    }

    //vrednostTima() -> vraca vrednost tima (apstraktan metod)
    public abstract int vrednostTima();

    //geteri i seteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getGrad() {
        return grad;
    }
    public void setGrad(String grad) {
        this.grad = grad;
    }
    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }
    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    public String toString(){
        return naziv + " " + grad + " " + listaIgraca;
    }
}
