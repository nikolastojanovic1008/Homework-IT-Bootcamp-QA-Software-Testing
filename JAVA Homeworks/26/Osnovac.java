package sestaSedmica.Petak.Skola;

import java.util.ArrayList;

public class Osnovac extends Ucenik{

    public Osnovac(String ime, double cenaSkolovanja, ArrayList<Integer> ocene, int brojNeopravdanih){
        super(ime, cenaSkolovanja, ocene, brojNeopravdanih);
    }

    @Override
    public double cenaSkolovanja() {
        //return getCenaSkolovanja() + (getCenaSkolovanja() * 0.15);
        return getCenaSkolovanja() * 1.15;
    }
}
