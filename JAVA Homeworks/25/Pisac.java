package sestaSedmica.Petak.DomaciZadatak;

import java.util.ArrayList;

public class Pisac {

    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> knjige;

    //konstruktor
    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige){
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.knjige = knjige;
    }

    //metode
    //najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
    public String najpoznatijaKnjiga(){
        if (getKnjige().isEmpty()) {
            return "Nema knjiga.";
        }
        //ovde je mogao objekat tipa Knjiga pa se preko njega uzima sta mi treba
        Knjiga najpoznatijaKnjiga = null;
        int najveciBrojStrana = getKnjige().get(0).getBrojStrana();
        String naslovNajpoznatijeKnjige = getKnjige().get(0).getNaslov();
        for (int i = 1; i < getKnjige().size(); i++){
            if (najveciBrojStrana < getKnjige().get(i).getBrojStrana()){
                najveciBrojStrana = getKnjige().get(i).getBrojStrana();
                naslovNajpoznatijeKnjige = getKnjige().get(i).getNaslov();
            }
        }
        return naslovNajpoznatijeKnjige;
    }

    //vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
    public int vremePisanja(){
        int najnovijaKnjiga = getKnjige().get(0).getGodinaIzdavanja();
        for (int i = 1; i < getKnjige().size(); i++){
            if (najnovijaKnjiga < getKnjige().get(i).getGodinaIzdavanja()){
                najnovijaKnjiga = getKnjige().get(i).getGodinaIzdavanja();
            }
        }
        int najstarijaKnjiga = getKnjige().get(0).getGodinaIzdavanja();
        for (int i = 1; i <getKnjige().size(); i++){
            if (najstarijaKnjiga > getKnjige().get(i).getGodinaIzdavanja()){
                najstarijaKnjiga = getKnjige().get(i).getGodinaIzdavanja();
            }
        }
        return najnovijaKnjiga - najstarijaKnjiga;
    }

    //vreme pisanja jednostavnija metoda
    public int vremePisanjaJednostavnijiNacin() {
        if (getKnjige().isEmpty()) {
            return 0; //
        }

        int najnovijaKnjiga = getKnjige().get(0).getGodinaIzdavanja();
        int najstarijaKnjiga = getKnjige().get(0).getGodinaIzdavanja();

        for (int i = 1; i < getKnjige().size(); i++) {
            int godinaIzdavanja = getKnjige().get(i).getGodinaIzdavanja();
            if (najnovijaKnjiga < godinaIzdavanja) {
                najnovijaKnjiga = godinaIzdavanja;
            }
            if (najstarijaKnjiga > godinaIzdavanja) {
                najstarijaKnjiga = godinaIzdavanja;
            }
        }

        return najnovijaKnjiga - najstarijaKnjiga;
    }

    //metoda za stampanje liste knjiga sa njihovim podacima
    public void stampajListuObjekataKnjiga(){
        System.out.println("Pisac " + getIme() + " je napisao sledece knjige:");
        for (Knjiga knjiga : knjige){
            System.out.println(knjiga);
        }
    }


    //geteri i seteri
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public String toString(){
        return ime + " " + godinaRodjenja + " " + knjige;
    }
}
