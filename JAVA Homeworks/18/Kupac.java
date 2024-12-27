package sestaSedmica.DodatniZadaci.Prodavnica;

public class Kupac {

    private String ime;
    private String email;

    public Kupac(String ime, String email){
        this.ime = ime;
        this.email = email;
    }

    //geteri i seteri
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return ime;
    }
}
