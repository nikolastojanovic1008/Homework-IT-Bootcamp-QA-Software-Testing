package sestaSedmica.Cetvrtak.Filmovi;

public class Main {
    public static void main(String[] args) {

        Glumac glumac = new Glumac(1990, "Milos");

        Film horor = new Horor(2000, 100, glumac);
        System.out.println(horor.troskovi());
        Film ackija = new AkcioniFilm(2001, 100, glumac);
        System.out.println(ackija.troskovi());
        Film romatnika = new Romantika(2007, 100, glumac);
        System.out.println(romatnika.troskovi());

        System.out.println(romatnika.godineGlavnogGlumca());
    }
}
