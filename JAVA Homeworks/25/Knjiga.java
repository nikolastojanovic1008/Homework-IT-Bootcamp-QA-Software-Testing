package sestaSedmica.Petak.DomaciZadatak;

public class Knjiga {

    private String naslov;
    private int brojStrana;
    private int godinaIzdavanja;

    //konstruktor
    public Knjiga(String naslov, int brojStrana, int godinaIzdavanja){
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.godinaIzdavanja = godinaIzdavanja;
    }

    //geteri i seteri
    public int getBrojStrana() {
        return brojStrana;
    }
    public String getNaslov() {
        return naslov;
    }
    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public String toString(){
        return naslov + " (broj strana: " + brojStrana + " i godina izdanja: " + godinaIzdavanja + ").";
    }
}
