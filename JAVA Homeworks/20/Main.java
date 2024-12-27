package sestaSedmica.Cetvrtak.Mreze;

public class Main {
    public static void main(String[] args) {

        DrustveneMreze facebook = new Facebook(1000, 10000);
        DrustveneMreze instagram = new Instagram(200, 400);
        DrustveneMreze tikTok = new TikTok(500, 567678);

        //facebook
        System.out.println(facebook.zarada());
        facebook.upozorenje();

        //instagram
        System.out.println(instagram.zarada());
        instagram.upozorenje();

        //tiktok
        System.out.println(tikTok.zarada());
        tikTok.upozorenje();

        //koliko su recimo svi zaradili zajedno
        double ukupnaZarada = 0;
        ukupnaZarada = facebook.zarada() + instagram.zarada() + tikTok.zarada();
        System.out.println(ukupnaZarada);

    }
}
