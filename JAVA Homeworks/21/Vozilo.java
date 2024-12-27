package sestaSedmica.Cetvrtak.Garaza;

public class Vozilo {

    private double cena;
    private int kilometraza;
    private int godinaProizvodnje;

    public Vozilo(double cena, int kilometraza, int godinaProizvodnje){
        this.cena = cena;
        this.kilometraza = kilometraza;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double izracunajCenu(){
        return cena * 0.5;
    }

    //geteri i seteri
    public double getCena() {
        return cena;
    }
    public int getKilometraza() {
        return kilometraza;
    }
    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setKilometraza(int kilometraza) {
        this.kilometraza = kilometraza;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String toString(){
        return cena + " " + kilometraza + " " + godinaProizvodnje;
    }
}
