package sedmaSedmica.Ponedeljak.StambeniProstori;

import java.util.ArrayList;

public class Kuca extends Nekretnina{

    public Kuca(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaPoKvadratu, listaPonuda);
    }

    //popust od 20% ukoliko je kuca veca od 200 kvadrata
    @Override
    public double cenaNekretnine() {
        double cena = getCenaPoKvadratu() * getKvadratura();
        if (getKvadratura() > 200){
            return cena * 0.8;
        }
        return cena;
    }
}
