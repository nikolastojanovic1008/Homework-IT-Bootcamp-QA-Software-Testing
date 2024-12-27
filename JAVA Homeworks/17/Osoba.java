package sestaSedmica.Cetvrtak.DodatniZadatak;

public class Osoba {

    private String ime;
    private String prezime;
    private int godinaRodjenja;

    //konstruktor
    public Osoba(String ime, String prezime, int godinaRodjenja){
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    //metoda za predstavljanje
    public void predstaviSe(){
        System.out.println("Zdravo. Zovem se " + getIme() + " " + getPrezime() + "." + "\nRodjena sam: " + getGodinaRodjenja() + ".");
    }

    //geteri i seteri
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public String toString(){
        return ime + " " + prezime + " - god rodjenja: " + godinaRodjenja;
    }

}
