package sestaSedmica.Petak.Skola;

import java.util.ArrayList;

public abstract class Ucenik {

    private String ime;
    //ako pravimo konstantu(final) MORAMO je ubaciti u konstruktor i dodeliti joj vrednost jer mora imati finalnu vrednost
    private final double cenaSkolovanja;
    private ArrayList<Integer> ocene;
    private int brojNeopravdanih;

    //konstruktor
    public Ucenik(String ime, final double cenaSkolovanja, ArrayList<Integer> ocene, int brojNeopravdanih){
        this.ime = ime;
        this.cenaSkolovanja = cenaSkolovanja;
        this.ocene = ocene;
        this.brojNeopravdanih = brojNeopravdanih;
    }

    //metoda za sve (da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
    public boolean ukor(){
        int brojac = 0;
        for (Integer ocena: getOcene()){
            if (ocena == 1){
                brojac++;
            }
        }
        if (brojac > 10){
            return true;
        }
        if (getBrojNeopravdaanih() > 10){
            return true;
        }
        return false;
    }

    //PRAVIMO ukor() METODU POMOCU POMOCNE METODE
    //pomocna metoda da prebroji keceve, posto je koristimo samo ovde najbolje da bude private (kao opcija)
    private int prebrojKeceve(){
        int brojac = 0;
        for (Integer ocena: getOcene()){
            if (ocena == 1){
                brojac++;
            }
        }
        return brojac;
    }
    public boolean ukorPrekoPomocne(){
        if (prebrojKeceve() > 10 || getBrojNeopravdaanih() > 10){
            return true;
        }
        return false;
    }

    //abstract metoda
    /*cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
    iznose 15% od fiksne cene skolovanja. */
    public abstract double cenaSkolovanja();

    //geteri i seteri
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public double getCenaSkolovanja() {
        return cenaSkolovanja;
    }
    public ArrayList<Integer> getOcene() {
        return ocene;
    }
    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
    public int getBrojNeopravdaanih() {
        return brojNeopravdanih;
    }
    public void setBrojNeopravdaanih(int brojNeopravdaanih) {
        this.brojNeopravdanih = brojNeopravdaanih;
    }

    public String toString(){
        return ime + " " + cenaSkolovanja + " " + ocene + " " + brojNeopravdanih;
    }
}
