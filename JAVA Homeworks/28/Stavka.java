package sedmaSedmica.Ponedeljak.Kupovina;

public class Stavka {

    //ukupan br racuna podelimo sa br stavki
    //od kredi kartice oduzmemo stavku da dobijemo ostatak
    private String naziv;
    private double cena;

    public Stavka(String naziv, double cena){
        this.naziv = naziv;
        this.cena = cena;
    }



    //geteri i seteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public String tostring(){
        return naziv + " " + cena;
    }

}
