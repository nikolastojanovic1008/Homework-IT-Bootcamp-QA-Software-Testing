package sestaSedmica.Petak.Muzika;

public class Muzicar {
    // ime, godinu pocetka karijere I jedan album
    private String ime;
    private int godinaPocetkaKarijere;
    private Album album;

    //konstruktor
    public Muzicar(String ime, int godinaPocetkaKarijere, Album album){
        this.ime = ime;
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
        this.album = album;
    }

    // METODE
    //prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku da mu je to prvi hit
    public void prviHit(){
        if (getAlbum().getGodinaObjavljivanja() == getGodinaPocetkaKarijere()){
            System.out.println("Prvi hit.");
        }else {
            System.out.println("Nije prvi hit.");
        }
    }

    //zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi
    public int zarada(){
        return getAlbum().getBrojPesama() * 1000;
    }

    //geteri i seteri
    public int getGodinaPocetkaKarijere() {
        return godinaPocetkaKarijere;
    }
    public void setGodinaPocetkaKarijere(int godinaPocetkaKarijere) {
        this.godinaPocetkaKarijere = godinaPocetkaKarijere;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    public String toString(){
        return ime + godinaPocetkaKarijere + album;
    }
}
