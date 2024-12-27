package sestaSedmica.Cetvrtak.DomaciZadatak;

public class Valuta {

    private String naziv;
    private String simbol;
    private double kurs;

    public Valuta(String naziv, String simbol, double kurs){
        this.naziv = naziv;
        this.simbol = simbol;
        this.kurs = kurs;
    }

    //metoda
    public double konvertujUdinare(double iznos){
        return iznos * kurs;
    }

    //geteri i seteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getSimbol() {
        return simbol;
    }
    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }
    public double getKurs() {
        return kurs;
    }
    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public String toString(){
        return naziv + " | " + simbol +  " | " + kurs;
    }
}
