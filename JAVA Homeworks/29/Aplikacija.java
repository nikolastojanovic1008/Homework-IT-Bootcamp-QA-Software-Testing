package sedmaSedmica.Ponedeljak.Mobile;

public class Aplikacija {
    //naziv, broj korisnika i ukupno vremena provedeno na toj aplikaciji.
    private String naziv;
    private int brojKorisnika;
    private int vremeProvedenoNaApp;

    public Aplikacija(String naziv, int brojKorisnika, int vremeProvedenoNaApp) {
        this.naziv = naziv;
        this.brojKorisnika = brojKorisnika;
        this.vremeProvedenoNaApp = vremeProvedenoNaApp;
    }

    //METODE
    //zarada() -> zaradjuje 10 po korisniku
    public double zarada(){
        return getBrojKorisnika() * 10;
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getBrojKorisnika() {
        return brojKorisnika;
    }
    public void setBrojKorisnika(int brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }
    public int getVremeProvedenoNaApp() {
        return vremeProvedenoNaApp;
    }
    public void setVremeProvedenoNaApp(int vremeProvedenoNaApp) {
        this.vremeProvedenoNaApp = vremeProvedenoNaApp;
    }

    @Override
    public String toString() {
        return "naziv='" + naziv + "', brojKorisnika=" + brojKorisnika + ", vremeProvedenoNaApp=" + vremeProvedenoNaApp;
    }
}
