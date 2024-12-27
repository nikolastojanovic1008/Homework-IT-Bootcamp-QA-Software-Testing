package sestaSedmica.Ponedeljak.DomaciZadatak;

public class Main {
    public static void main(String[] args) {

        /*stavila sam pocetno stanje nula, moze se radi testiranja staviti negativan ili pozitivan broj isto
        da se testira da li je racun u minusu, da li ima novca. */
        BankovniRacun racun = new BankovniRacun(1234567, "Ana Gasic", 0);
        System.out.println(racun);
        racun.stanjeNaRacunuProvera();

        //dodavanje novca na racun
        racun.uplata(100);
        racun.stanjeNaRacunuProvera(); //stanje 100
        racun.uplata(50);
        racun.stanjeNaRacunuProvera(); //sada je stanje 150 zajedno sa prethodnom uplatom
        racun.uplata(-100); //pokusaj uplate negativnim brojem

        //skidanje novca sa racuna
        racun.skidanje(20);
        racun.stanjeNaRacunuProvera(); //stanje 130
        racun.skidanje(5);
        racun.stanjeNaRacunuProvera(); //stanje 125

        //testiranje nevalidnih unosa za placanje
        racun.skidanje(150); //pokusaj da izvrsim placanje kad nema dovoljno novca
        racun.skidanje(-50); //iznos za placanje negativan
        racun.skidanje(0); //iznos za placanje nula

        //na kraju svega proveravam stanje
        racun.stanjeNaRacunuProvera(); //stanje 125
    }
}
