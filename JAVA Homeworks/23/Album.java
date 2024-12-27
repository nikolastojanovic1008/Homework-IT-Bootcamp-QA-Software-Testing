package sestaSedmica.Petak.Muzika;

public class Album {
    //naziv, godinu objavljivanja i broj pesama
    private String naziv;
    private int godinaObjavljivanja;
    private int brojPesama;

    //konstruktor
    public Album(String naziv, int godinaObjavljivanja, int brojPesama){
        this.naziv = naziv;
        this.godinaObjavljivanja = godinaObjavljivanja;
        this.brojPesama = brojPesama;
    }

    //geteri i seteri
    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }
    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getBrojPesama() {
        return brojPesama;
    }
    public void setBrojPesama(int brojPesama) {
        this.brojPesama = brojPesama;
    }

    public String toString(){
        return naziv + godinaObjavljivanja + brojPesama;
    }

}
