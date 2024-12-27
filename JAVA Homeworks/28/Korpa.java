package sedmaSedmica.Ponedeljak.Kupovina;

public class Korpa {

    private Stavka stavka;
    private KreditnaKartica kreditnaKartica;

    //konstruktor
    public Korpa(Stavka stavka, KreditnaKartica kreditnaKartica){
        this.stavka = stavka;
        this.kreditnaKartica = kreditnaKartica;
    }

    //METODE
    //plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
    public void plati(){
        double ostatakNakonPlacanja;
        ostatakNakonPlacanja = getKreditnaKartica().getStanjeNaRacunu() - getStavka().getCena();

        if (getKreditnaKartica().getStanjeNaRacunu() >= getStavka().getCena()){
            getKreditnaKartica().setStanjeNaRacunu(ostatakNakonPlacanja);
        }else {
            System.out.println("Nema dovoljno novca na racunu.");
        }
    }

    //viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
    public double kolikoPutaMozemoKupitiStavku(){
        double brojPuta;
        brojPuta = getKreditnaKartica().getStanjeNaRacunu() / getStavka().getCena();
        return (int)brojPuta; //stavljeno je castovanje da bi vratio ceo broj, jer ne mozemo kupiti .nesto od artikla
    }

    //geteri i seteri
    public Stavka getStavka() {
        return stavka;
    }
    public void setStavka(Stavka stavka) {
        this.stavka = stavka;
    }
    public KreditnaKartica getKreditnaKartica() {
        return kreditnaKartica;
    }
    public void setKreditnaKartica(KreditnaKartica kreditnaKartica) {
        this.kreditnaKartica = kreditnaKartica;
    }

    @Override
    public String toString() {
        return "Stavka: " + stavka + ", kreditna kartica:" + kreditnaKartica;
    }
}
