package sestaSedmica.Ponedeljak.DomaciZadatak;

public class BankovniRacun {

    private int brojRacuna;
    private String vlasnik;
    private double stanjeNaRacunu;

    public BankovniRacun(int brojRacuna, String vlasnik, double stanjeNaRacunu){
        this.brojRacuna = brojRacuna;
        this.vlasnik = vlasnik;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public void uplata(double uplacenNovac) {
        if (uplacenNovac > 0) {
            setStanjeNaRacunu(getStanjeNaRacunu() + uplacenNovac);
        }else {
            System.out.println("Morate uneti neki iznos novca veci od nule.");
        }
    }

    public void skidanje(double iznosZaPlacanje){
        if (iznosZaPlacanje <= 0) {
            System.out.println("Iznos za placanje mora biti veci od nule.");
            return;
        }
        if (getStanjeNaRacunu() >= iznosZaPlacanje) {
            setStanjeNaRacunu(getStanjeNaRacunu() - iznosZaPlacanje);
        }else{
            System.out.println("Nemate dovoljno novca da izvrsite placanje.");
        }
    }

    public void stanjeNaRacunuProvera(){
        if (getStanjeNaRacunu() == 0) {
            System.out.println("Nemate novca na racunu.");
        } else if (getStanjeNaRacunu() > 0) {
            System.out.println("Trenutno stanje na racunu: " + getStanjeNaRacunu() + ".");
        } else {
            System.out.println("U minusu ste.");
        }
    }

    public int getBrojRacuna(){
        return brojRacuna;
    }
    public void setBrojRacuna(int noviBrojRacuna){
        this.brojRacuna = noviBrojRacuna;
    }
    public String getVlasnik(){
        return vlasnik;
    }
    public void setVlasnik(String noviVlasnik){
        this.vlasnik = noviVlasnik;
    }
    public double getStanjeNaRacunu(){
        return stanjeNaRacunu;
    }
    public void setStanjeNaRacunu(double novoStanjeNaRacunu){
        this.stanjeNaRacunu = novoStanjeNaRacunu;
    }

    public String toString(){
        return "Broj racuna: " + brojRacuna + " | Ime:  " + vlasnik + " | Stanje na racunu: " + stanjeNaRacunu;
    }
}
