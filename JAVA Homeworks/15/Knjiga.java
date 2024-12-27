package sestaSedmica.Utorak.Biblioteka;

public class Knjiga {

    private String naziv;
    private int brojStrana;
    private int godinaIzdanja;
    private double cena;

    public Knjiga(String naziv, int brojStrana, int godinaIzdanja, double cena){
        this.naziv = naziv;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        this.cena = cena;
    }

    //popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
    public void popust(){
        if (getBrojStrana() > 300){
            setCena(getCena() * 0.8);
        }
    }

    //oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
    public void oldTimer(){
        if (2024 - getGodinaIzdanja() > 20){
            System.out.println("Stara knjiga.");
        }else {
            System.out.println("Novije izdanje.");
        }
    }

    //geteri i seteri
    private String getNaziv(){
        return naziv;
    }
    private void setNaziv(String noviNaziv){
        this.naziv = noviNaziv;
    }
    public int getBrojStrana(){
        return brojStrana;
    }
    public void setBrojStrana(int noviBrojStrana){
        this.brojStrana = noviBrojStrana;
    }
    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int novaGodinaIzdanja){
        this.godinaIzdanja = novaGodinaIzdanja;
    }
    public double getCena(){
        return cena;
    }
    public void setCena(double novaCena){
        this.cena = novaCena;
    }

    public String toString(){
        return naziv + " " + brojStrana + " " + godinaIzdanja + " " + cena;
    }
}
