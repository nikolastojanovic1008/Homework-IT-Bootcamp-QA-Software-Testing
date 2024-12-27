package sestaSedmica.Utorak.Biblioteka;

public class Autor {
    //ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu
    private String ime;
    private int godinaRodjenja;
    private int brojProdanihDela;
    private Knjiga knjiga;

    public Autor(String ime, int godinaRodjenja, int brojProdanihDela, Knjiga knjiga){
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.brojProdanihDela = brojProdanihDela;
        this.knjiga = knjiga;
    }

    //metoda ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
    public void ranaObjava(){
        if (getKnjiga().getGodinaIzdanja() - getGodinaRodjenja() <= 25){
            System.out.println("Autor je objavio knjigu pre svoje 25 godine.");
        }else {
            System.out.println("Autor je objavio knjigu posle svoje 25 godine.");
        }
    }

    //zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju istu cenu kao ta jedna knjiga
    public double zarada(){
        return getBrojProdanihDela() * getKnjiga().getCena();
    }

    //geteri i seteri
    public String getIme(){
        return ime;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public int getBrojProdanihDela() {
        return brojProdanihDela;
    }
    public void setBrojProdanihDela(int novBrojProdanihDela) {
        this.brojProdanihDela = novBrojProdanihDela;
    }
    public Knjiga getKnjiga() {
        return knjiga;
    }
    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public String toString(){
        return ime + " " + godinaRodjenja +  " " + brojProdanihDela +  " " + knjiga;
    }
}
