package sestaSedmica.Cetvrtak.DomaciZadatak;

public class Main {
    public static void main(String[] args) {

        Dolar dolar = new Dolar("Dolar", "USD", 104.96);
        Euro eur = new Euro("Euro", "EUR", 117.08);

        System.out.println(dolar.konvertujUdinare(10)); //1049.6
        System.out.println(eur.konvertujUdinare(10)); //1170.8

        dolar.postaviKursNovi(105);
        System.out.println(dolar.konvertujUdinare(10)); //1050

        eur.postaviKursNovi(118);
        System.out.println(eur.konvertujUdinare(10)); //1180.0
    }
}
