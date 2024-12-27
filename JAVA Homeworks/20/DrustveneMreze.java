package sestaSedmica.Cetvrtak.Mreze;

public class DrustveneMreze {

    private int brojKorisnika;
    private int brojReklama;

    //konstruktor
    public DrustveneMreze(int brojKorisnika, int brojReklama){
        this.brojKorisnika = brojKorisnika;
        this.brojReklama = brojReklama;
    }

    //METODE
    //zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
    public double zarada(){
        double zarada;
        zarada = (2 * getBrojKorisnika()) + (5 * getBrojReklama());
        return zarada;
    }

    //upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika (manje od 200)
    public void upozorenje(){
        if (getBrojKorisnika() < 200){
            System.out.println("Nema dovoljno korisnika.");
        }else {
            System.out.println("Ima dovoljno korisnika.");
        }
    }

    //geteri i seteri
    public int getBrojKorisnika(){
        return brojKorisnika;
    }
    public void setBrojKorisnika(int brojKorisnika){
        this.brojKorisnika = brojKorisnika;
    }
    public int getBrojReklama(){
        return brojReklama;
    }
    public void setBrojReklama(int brojReklama){
        this.brojReklama = brojReklama;
    }

    public String toString(){
        return brojKorisnika + " " + brojReklama;
    }
}
