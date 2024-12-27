package sestaSedmica.Cetvrtak.DodatniZadatak;

import java.util.ArrayList;

public class Student extends Osoba{

    private ArrayList<Predmet> predmeti;
    private int index;
    private Predmet predmet;
    private ArrayList<Integer> ocene;

    public Student(String ime, String prezime, int godinaRodjenja, ArrayList<Predmet> predmeti, int index, ArrayList<Integer> ocene) {
        super(ime, prezime, godinaRodjenja);
        this.predmeti = predmeti;
        this.index = index;
        this.ocene = ocene;
    }

    //METODE
    public void dodavanjePredmeta(Predmet predmet){
        getPredmeti().add(predmet);
    }

    public double prosekOcena(){
        double suma = 0;
        for(Integer ocena: ocene){
            suma += ocena;
        }
        return suma / ocene.size();
    }

    public void prikaziPredmete() {
        for (Predmet predmet : predmeti) {
            System.out.println(predmet);
        }
    }

    //geteri i seteri
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }
    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
    public Predmet getPredmet() {
        return predmet;
    }
    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    @Override
    public String toString() {
        return super.toString() + " |Broj indexa: " + index;
    }
}
