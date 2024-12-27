package sestaSedmica.Cetvrtak.Filmovi;

public class Glumac {

    private int godinaRodjenja;
    private String ime;

    //konstruktor
    public Glumac(int godinaRodjenja, String ime){
        this.godinaRodjenja = godinaRodjenja;
        this.ime = ime;
    }

    //geteri i seteri
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public String getIme(){
        return ime;
    }

    public String toString(){
        return godinaRodjenja + " " + ime;
    }
}
