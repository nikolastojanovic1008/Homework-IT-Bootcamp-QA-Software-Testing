package sedmaSedmica.Cetvrtak_Test;

import java.util.ArrayList;

public class Planinar {

    private ArrayList<Planina> listaPlanina;
    private double maxUspon;

    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
    }

    //METODE
    //dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
    public void dodaj(Planina p){
        if (p.getVisina() <= getMaxUspon()){
            getListaPlanina().add(p);
        }
    }

    //opasne() -> metoda vraca listu planina koje su opasne za penjanje
    public ArrayList<Planina> opasne(){
        ArrayList<Planina> opasneZaPenjanje = new ArrayList<>();
        for (Planina planina : getListaPlanina()){
            if (planina.isOpasnost()){
                opasneZaPenjanje.add(planina);
            }
        }
        return opasneZaPenjanje;
    }

    //izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
    public void izbaci(){
        for (int i = getListaPlanina().size() - 1; i >= 0; i--){
            if (getListaPlanina().get(i).getVisina() > getMaxUspon() || getListaPlanina().get(i).isOpasnost()){
                getListaPlanina().remove(i);
            }
        }
    }

    //najveca()-> vraca najvecu planinu iz planinarove liste
    public String najvecaPlanina(){
        String najvecaPlanina = "";
        double visina = getListaPlanina().get(0).getVisina();
        for (Planina planina : getListaPlanina()){
            if (visina < planina.getVisina()){
                visina = planina.getVisina();
                najvecaPlanina = planina.getNaziv();
            }
        }

        return najvecaPlanina;
    }

    //geteri i seteri

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }
    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }
    public double getMaxUspon() {
        return maxUspon;
    }
    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public String toString(){
        return listaPlanina + " " + maxUspon;
    }
}
