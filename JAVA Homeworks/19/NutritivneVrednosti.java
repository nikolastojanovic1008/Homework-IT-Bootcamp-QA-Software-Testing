package sestaSedmica.DodatniZadaci.Ishrana;

public class NutritivneVrednosti {

    private String nutrijent;
    private double procenatNutrijentaUHrani;

    //konstruktor
    public NutritivneVrednosti(String nutrijent, double procenatNutrijentaUHrani){
        this.nutrijent = nutrijent;
        this.procenatNutrijentaUHrani = procenatNutrijentaUHrani;
    }


    //geteri i seteri
    public String getNaziv() {
        return nutrijent;
    }
    public void setNaziv(String naziv) {
        this.nutrijent = naziv;
    }
    public double getProcenatNutrijentaUHrani() {
        return procenatNutrijentaUHrani;
    }
    public void setProcenatNutrijentaUHrani(double procenatNutrijentaUHrani) {
        this.procenatNutrijentaUHrani = procenatNutrijentaUHrani;
    }

    public String toString(){
        return nutrijent + " - procenat: " + procenatNutrijentaUHrani;
    }
}
