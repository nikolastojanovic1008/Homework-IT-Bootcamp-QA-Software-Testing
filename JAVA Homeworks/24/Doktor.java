package sestaSedmica.Petak.Health;

public abstract class Doktor {

    private String ime;
    private int brojPacijenata;
    private int godinaZaposlenja;

    //konstruktor
    public Doktor(String ime, int brojPacijenata, int godinaZaposlenja){
        this.ime = ime;
        this.brojPacijenata = brojPacijenata;
        this.godinaZaposlenja = godinaZaposlenja;
    }

    //metoda
    public int godineStaza(){
        int godine = 2024 - godinaZaposlenja;
        return godine;
    }

    //ukoliko imamo metodu cija implementacija je drugacija u drugim klasama definisemo je kao abstraktnu
    //abstract medota
    public abstract double plata();

    //geteri i seteri
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getBrojPacijenata() {
        return brojPacijenata;
    }
    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }
    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int godinaZaposlenja) {
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public String toString(){
        return ime + " " + brojPacijenata + " " + godinaZaposlenja;
    }

}
