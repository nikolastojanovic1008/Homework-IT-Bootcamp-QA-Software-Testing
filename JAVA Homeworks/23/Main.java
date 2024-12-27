package sestaSedmica.Petak.Muzika;

public class Main {
    public static void main(String[] args) {

        Album oneMoreTime = new Album("Baby one more time", 1999, 15);
        PopMuzicar pop = new PopMuzicar("Britney", 1999, oneMoreTime);

        System.out.println(pop.zarada());
        pop.prviHit();

        Album reperAlbum = new Album("Reper", 2020, 9);
        Reper reper = new Reper("Eminem", 2000, reperAlbum);

        System.out.println(reper.zarada());
        reper.prviHit();
    }
}
