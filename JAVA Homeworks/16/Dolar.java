package sestaSedmica.Cetvrtak.DomaciZadatak;

public class Dolar extends Valuta{

    public Dolar(String naziv, String simbol, double kurs) {
        super(naziv, simbol, kurs);
       }

    public void postaviKursNovi(double kurs){
        setKurs(kurs);
    }
}
