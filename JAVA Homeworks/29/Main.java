package sedmaSedmica.Ponedeljak.Mobile;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //kreiranje liste app
        ArrayList<Aplikacija> listaApp = new ArrayList<>();
        Aplikacija facebook = new Aplikacija("Facebook", 100, 200);
        Aplikacija instagram = new Aplikacija("Instagram", 200, 300);
        Aplikacija tikTok = new Aplikacija("Tik Tok", 300, 400);
        Aplikacija youtube = new Aplikacija("YouTube", 50, 50);
        listaApp.add(facebook);
        listaApp.add(instagram);
        listaApp.add(tikTok);
        listaApp.add(youtube);

        Android android = new Android("Samsung", listaApp);
        IPhone iPhone = new IPhone("iPhone 16", listaApp);

        Telefon telefon = new Telefon("Telefon", listaApp);
        telefon.delete(listaApp, "facebook");
        //moze i ovako da pozovem naziv po indexu
        //telefon.delete(listaApp, listaApp.get(0).getNaziv());
        telefon.stampanjeListeApp(); //e sad ovde nema facbook-a u listi jer je obrisan

        System.out.println(android.najkoriscenija());
        System.out.println(android.netWorth());
        System.out.println(iPhone.netWorth());
        System.out.println(iPhone.najkoriscenijaIphoneApp());

    }
}
