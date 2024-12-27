package sedmaSedmica.Utorak;

public class Artikl {

    private String naziv;
    private double cena;
    private int godinaProizvodnje;

    public Artikl(String naziv, double cena, int godinaProizvodnje) {
        this.naziv = naziv;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
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
    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String toString(){
        return naziv + " " + cena + " " + godinaProizvodnje;
    }
}
