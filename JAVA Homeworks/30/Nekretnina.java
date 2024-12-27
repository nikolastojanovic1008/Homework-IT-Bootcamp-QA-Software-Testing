package sedmaSedmica.Ponedeljak.StambeniProstori;

import java.util.ArrayList;

public class Nekretnina {
    //atribut kvadraturu, cena po kvadratu i listu ponuda.
    private double kvadratura;
    private double cenaPoKvadratu;
    private ArrayList<Double> listaPonuda;

    //konstruktor
    public Nekretnina(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda){
        this.kvadratura = kvadratura;
        this.cenaPoKvadratu = cenaPoKvadratu;
        this.listaPonuda = listaPonuda;
    }

    //metode
    //najvecaPonuda() -> vraca najvecu ponudu iz liste
    public double najvecaPonudaIzListe(){
        double najvecaPonuda = getListaPonuda().get(0);
        for (Double ponuda : listaPonuda){
            if (najvecaPonuda < ponuda){
                najvecaPonuda = ponuda;
            }
        }
        return najvecaPonuda;
    }

    //cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
    public double cenaNekretnine(){
        double cena = getCenaPoKvadratu() * getKvadratura();
        if (getKvadratura() > 100){
            return cena * 0.85;
        }
        return cena;
    }

    //geteri i seteri

    public double getKvadratura() {
        return kvadratura;
    }
    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }
    public double getCenaPoKvadratu() {
        return cenaPoKvadratu;
    }
    public void setCenaPoKvadratu(double cenaPoKvadratu) {
        this.cenaPoKvadratu = cenaPoKvadratu;
    }
    public ArrayList<Double> getListaPonuda() {
        return listaPonuda;
    }
    public void setListaPonuda(ArrayList<Double> listaPonuda) {
        this.listaPonuda = listaPonuda;
    }

    public String toString(){
        return kvadratura + " " + cenaPoKvadratu + " " + listaPonuda;
    }
}
