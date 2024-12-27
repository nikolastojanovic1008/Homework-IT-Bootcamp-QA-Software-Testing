package sestaSedmica.Cetvrtak.Filmovi;

public class Film {

    private int godinaObjavljivanja;
    private double zarada;
    private Glumac glumac;

    //konstruktor
    public Film(int godinaObjavljivanja, double zarada, Glumac glumac){
        this.godinaObjavljivanja = godinaObjavljivanja;
        this.zarada = zarada;
        this.glumac = glumac;
    }

    //METODE
    //godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
    public int godineGlavnogGlumca(){
        return getGodinaObjavljivanja() - getGlumac().getGodinaRodjenja();
    }

    //troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma
    public double troskovi(){
        return getZarada() * 0.2;
    }

    //geteri i seteri
    public int getGodinaObjavljivanja(){
        return godinaObjavljivanja;
    }
    public double getZarada(){
        return zarada;
    }
    public Glumac getGlumac(){
        return glumac;
    }
    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }
    public void setZarada(double zarada) {
        this.zarada = zarada;
    }
    public void setGlumac(Glumac glumac) {
        this.glumac = glumac;
    }
}
