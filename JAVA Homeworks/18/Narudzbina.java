package sestaSedmica.DodatniZadaci.Prodavnica;

import java.util.ArrayList;

public class Narudzbina {

    private Kupac kupac;
    private ArrayList<Proizvod> proizvodi;

    public Narudzbina(Kupac kupac, ArrayList<Proizvod> proizvodi){
        this.kupac = kupac;
        this.proizvodi = proizvodi;
    }

    //metode
    public void dodavanjeProizvoda(Proizvod proizvod){
        getProizvodi().add(proizvod);
    }

    public double racun(){
        double ukupnaCena = 0;
        for (Proizvod proizvod: proizvodi){
            ukupnaCena += proizvod.getCena();
        }
        return ukupnaCena;
    }

    //geteri i seteri
    public Kupac getKupac() {
        return kupac;
    }
    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public ArrayList<Proizvod> getProizvodi() {
        return proizvodi;
    }
    public void setProizvodi(ArrayList<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    //stampanje
    public String toString(){
        return proizvodi + "";
    }
}
