package sestaSedmica.DodatniZadaci.Prodavnica;

public class Proizvod {

    private String nazivProizvoda;
    private double cena;

    public Proizvod(String nazivProizvoda, double cena){
        this.nazivProizvoda = nazivProizvoda;
        this.cena = cena;
    }

    //geteri i seteri
    public String getNazivProizvoda() {
        return nazivProizvoda;
    }
    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }
    public double getCena() {
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena mora biti veca od nule.");
        }
        return cena;
    }
    public void setCena(double cena) {
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena mora biti veca od nule.");
        }
        this.cena = cena;
    }

    public String toString(){
        return nazivProizvoda + " - cena: " + cena;
    }

}
