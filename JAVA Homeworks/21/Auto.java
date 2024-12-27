package sestaSedmica.Cetvrtak.Garaza;

public class Auto extends Vozilo{

    public Auto(double cena, int kilometraza, int godinaProizvodnje){
        super(cena, kilometraza, godinaProizvodnje);
    }

    @Override
    public double izracunajCenu(){
        return getCena() * 0.8;
    }
}
