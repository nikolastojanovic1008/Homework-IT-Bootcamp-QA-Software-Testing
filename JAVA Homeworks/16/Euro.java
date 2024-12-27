package sestaSedmica.Cetvrtak.DomaciZadatak;

public class Euro extends Valuta{

    public Euro(String naziv, String simbol, double kurs) {
        super("Euro", "EUR", kurs);
    }

    public void postaviKursNovi(double kurs){
        setKurs(kurs);
    }
}
