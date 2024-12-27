package sedmaSedmica.Ponedeljak.Mobile;

import java.util.ArrayList;

public class Telefon {
    //naziv i listu aplikacija
    private String naziv;
    private ArrayList<Aplikacija> listaApp;

    public Telefon(String naziv, ArrayList<Aplikacija> listaApp) {
        this.naziv = naziv;
        this.listaApp = listaApp;
    }

    //METODE
    //najkoriscenija() -> vraca aplikaciju koja se najvise koristi prema provedenom vremenu
    public String najkoriscenija(){
        int vremeKoriscenja = listaApp.get(0).getVremeProvedenoNaApp();
        String najkoriscenijaApp = listaApp.get(0).getNaziv();
        for (Aplikacija app: listaApp){
            //pozivamo attribute nad samim objektom A NE NAD LISTOM POSTO JE OVO ENHANCED PETLjA
            if (vremeKoriscenja < app.getVremeProvedenoNaApp()){
                vremeKoriscenja = app.getVremeProvedenoNaApp();
                najkoriscenijaApp = app.getNaziv();
            }
        }
        return najkoriscenijaApp;
    }

    //netWorth() -> vraca ukupnu zaradu svih aplikacija koje telefon ima
    public double netWorth(){
        double ukupnaZarada = 0;
        for (Aplikacija app : listaApp){
            ukupnaZarada += (app.getBrojKorisnika() * 10);
        }
        return ukupnaZarada;
    }

    //delete(Aplikacija a) -> brise aplikaciju iz liste
    public void delete(ArrayList<Aplikacija> listaApp, String naziv){
        for (int i = 0; i < listaApp.size(); i++){
            if (listaApp.get(i).getNaziv().equalsIgnoreCase(naziv)){
                listaApp.remove(i);
            }
        }
    }

    //stampanjeListeApp
    public void stampanjeListeApp(){
        for (Aplikacija app : listaApp){
            System.out.println(app);
        }
    }

    //geteri i seteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public ArrayList<Aplikacija> getListaApp() {
        return listaApp;
    }
    public void setListaApp(ArrayList<Aplikacija> listaApp) {
        this.listaApp = listaApp;
    }

    public String toString(){
        return naziv;
    }
}
