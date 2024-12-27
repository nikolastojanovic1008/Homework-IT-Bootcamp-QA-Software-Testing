package sestaSedmica.DodatniZadaci.Ishrana;

import java.util.ArrayList;

public class Hrana {

    private String naziv;
    private double kcal;
    private ArrayList<NutritivneVrednosti> nutrijenti;

    //konstruktor
    public Hrana(String naziv, double kcal, ArrayList<NutritivneVrednosti> nutrijenti){
        this.naziv = naziv;
        this.kcal = kcal;
        this.nutrijenti = nutrijenti;
    }

    //metode
    public boolean daLiJeNiskoKaloricno(){
        if (getKcal() < 50){
            return true;
        }
        return false;
    }

    public String nutrijentSaNajvecimProcentom(){
        double nutrijentProcenat = getNutrijenti().get(0).getProcenatNutrijentaUHrani();
        String nazivNutrijentaSaNajvecimProcentom = getNutrijenti().get(0).getNaziv();

        for (int i = 1; i < getNutrijenti().size(); i++){
            if (nutrijentProcenat < getNutrijenti().get(i).getProcenatNutrijentaUHrani()){
                nutrijentProcenat = getNutrijenti().get(i).getProcenatNutrijentaUHrani();
                nazivNutrijentaSaNajvecimProcentom = getNutrijenti().get(i).getNaziv();
            }
        }
        return nazivNutrijentaSaNajvecimProcentom;
    }

    //stampanje nutritivnih vrednosti
    public void stampanjeNutritivnihVrednosti(){
        for (NutritivneVrednosti nutrijent: nutrijenti){
            System.out.println(nutrijent);
        }
    }

   //geteri i seteri
    public double getKcal() {
        return kcal;
    }
    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public ArrayList<NutritivneVrednosti> getNutrijenti() {
        return nutrijenti;
    }
    public void setNutrijenti(ArrayList<NutritivneVrednosti> nutrijenti) {
        this.nutrijenti = nutrijenti;
    }

    public String toString(){
        return naziv + " " + kcal;
    }
}
