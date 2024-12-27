package sedmaSedmica.Utorak;

import java.util.ArrayList;

public class Prodavnica {

    private int brojZaposlenih;
    private ArrayList<Artikl> listaArtikla;

    public Prodavnica(int brojZaposlenih, ArrayList<Artikl> listaArtikla) {
        this.brojZaposlenih = brojZaposlenih;
        this.listaArtikla = listaArtikla;
    }

    //METODE
    //blackFriday() -> sve artikle iz liste spusta za 50%
    public void blackFriday(){
        double popust = 0;
        for (Artikl artikl : getListaArtikla()){
            popust = artikl.getCena() / 2;
            artikl.setCena(popust);
        }
    }

    //pronadji(String a) -> trazi prosledjeni naziv u listi artikala
    public boolean pronadji(String nazivArtikla) {
        boolean daLiImaArtikla = false;
        for (Artikl artikl : getListaArtikla()) {
            if (artikl.getNaziv().equalsIgnoreCase(nazivArtikla)) {
                daLiImaArtikla = true;
            } //ovde je znaci else totalno suvisan
        }
        if (daLiImaArtikla) {
            return true;
        } else {
            return false;
        }
    }
    //jednostavnije da se utvrdi
    public boolean pronadji2(String nazivArtikla) {
        for (Artikl artikl : getListaArtikla()) {
            if (artikl.getNaziv().equalsIgnoreCase(nazivArtikla)) {
                return true;
            }
        }
        return false;
    }

    //triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
    public ArrayList<Artikl> triftKolekcija(){
        ArrayList<Artikl> trift = new ArrayList<>();

        for (Artikl artikl : getListaArtikla()){
            if (2024 - artikl.getGodinaProizvodnje() > 20){
                trift.add(artikl);
            }
        }
        return trift;
    }

    //ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
    //NAPOMENA: kod ove metode treba uslov da se ne bi uslo u minus
    public double ukupnaZarada(){
        double zarada = 0;

        for (Artikl artikl : getListaArtikla()){
            zarada += artikl.getCena();
        }
        return zarada - (getBrojZaposlenih() * 100);
    }

    //izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
    public void izbaciPrestaro(){
        for (int i = getListaArtikla().size() - 1; i >= 0; i--){
            if (2024 - getListaArtikla().get(i).getGodinaProizvodnje() > 30){
                getListaArtikla().remove(i);
            }
        }
    }

    //geteri i seteri

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }
    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }
    public ArrayList<Artikl> getListaArtikla() {
        return listaArtikla;
    }
    public void setListaArtikla(ArrayList<Artikl> listaArtikla) {
        this.listaArtikla = listaArtikla;
    }

    public String toString(){
        return brojZaposlenih + " " + listaArtikla;
    }
}
