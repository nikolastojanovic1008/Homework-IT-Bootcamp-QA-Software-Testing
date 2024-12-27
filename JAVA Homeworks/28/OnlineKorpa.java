package sedmaSedmica.Ponedeljak.Kupovina;

public class OnlineKorpa extends Korpa{

    public OnlineKorpa(Stavka stavka, KreditnaKartica kreditnaKartica) {
        super(stavka, kreditnaKartica);
    }

    //prilikom placanja daje popust od 10%
    @Override
    public void plati() {
        double ostatakNakonPlacanja;
        //racunali smo popust 10% prvo na cenu pa onda isli na placanje, jer ako imamo knap da kupimo s popustom onda je to to
        ostatakNakonPlacanja = getKreditnaKartica().getStanjeNaRacunu() - (getStavka().getCena() * 0.9);

        if (getKreditnaKartica().getStanjeNaRacunu() >= getStavka().getCena()){
            getKreditnaKartica().setStanjeNaRacunu(ostatakNakonPlacanja); //ovde sam def popust 10%
        }else {
            System.out.println("Nema dovoljno novca na racunu.");
        }
    }
}
