package sestaSedmica.Cetvrtak.Mreze;

public class TikTok extends DrustveneMreze{

    //TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko ima manje od 500 korisnika.

    public TikTok(int brojKorisnika, int brojReklama){
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void upozorenje() {
        if (getBrojKorisnika() < 500){
            System.out.println("Nema dovoljno korisnika.");
        }else {
            System.out.println("Ima dovoljno korisnika.");
        }
    }
}
