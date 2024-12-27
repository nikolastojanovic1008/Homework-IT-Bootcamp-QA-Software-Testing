package sedmaSedmica.Ponedeljak.StambeniProstori;

import java.util.ArrayList;

public class Lokal extends Nekretnina{

    public Lokal(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaPoKvadratu, listaPonuda);
    }

    //popust od 25% ukoliko je kuca veca od 250 kvadrata
    @Override
    public double cenaNekretnine() {
        double cena = getCenaPoKvadratu() * getKvadratura();
        if (getKvadratura() > 250){
            return cena * 0.75;
        }
        return cena;
    }
}
