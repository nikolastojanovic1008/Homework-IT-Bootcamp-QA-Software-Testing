package sestaSedmica.Cetvrtak.DodatniZadatak;

public class Predmet {

    private String naziv;
    private int espb;
    private String imeProfesora;
    //ovde mozemo dodati ocenu kao atribut
    private double ocena;

    public Predmet(String naziv, int espb, String imeProfesora){
        this.naziv = naziv;
        this.espb = espb;
        this.imeProfesora = imeProfesora;
    }

    //geteri i seteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getEspb() {
        return espb;
    }
    public void setEspb(int espb) {
        this.espb = espb;
    }
    public String getImeProfesora() {
        return imeProfesora;
    }
    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public String toString(){
        return "Naziv predmeta: " + naziv + " (ESPB: " + espb + ") - ime profesora: " + imeProfesora;
    }
}
