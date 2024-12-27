package sedmaSedmica.Ponedeljak.Mobile;

import java.util.ArrayList;

public class IPhone extends Telefon{

    public IPhone(String naziv, ArrayList<Aplikacija> listaApp) {
        super(naziv, listaApp);
    }

    //najvise koristi aplikaciju koja najvise zaradjuje
    //ovde moram reci getListaApp() umesto listaApp kao sto je u Telefon klasi
    public String najkoriscenijaIphoneApp(){
        int najvecaZarada = getListaApp().get(0).getVremeProvedenoNaApp();
        String appKojaNajviseZaradjuje = getListaApp().get(0).getNaziv();
        for (Aplikacija app: getListaApp()){
            //pozivamo attribute nad samim objektom A NE NAD LISTOM POSTO JE OVO ENHANCED PETLjA
            if (najvecaZarada < (app.getBrojKorisnika() * 10)){
                appKojaNajviseZaradjuje = app.getNaziv();
            }
        }
        return appKojaNajviseZaradjuje;
    }
}
