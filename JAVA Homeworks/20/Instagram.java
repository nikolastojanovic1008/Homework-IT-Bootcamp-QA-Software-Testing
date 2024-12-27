package sestaSedmica.Cetvrtak.Mreze;

public class Instagram extends DrustveneMreze{

    //Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku I 10 po reklami.

    public Instagram (int brojKorisnika, int brojReklama){
        super(brojKorisnika, brojReklama);
    }

    @Override
    public double zarada() {
        double zarada;
        zarada = (1 * getBrojKorisnika()) + (10 * getBrojReklama());
        return zarada;
    }
}
