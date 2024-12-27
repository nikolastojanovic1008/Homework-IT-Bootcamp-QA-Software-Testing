package sedmaSedmica.Ponedeljak.Kupovina;

public class KreditnaKartica {

    private double stanjeNaRacunu;

    public KreditnaKartica(double stanjeNaRacunu){
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String toString(){
        return stanjeNaRacunu + " ";
    }
}
