package sestaSedmica.Petak.Skola;

import java.util.ArrayList;

public class SrednjoSkolac extends Ucenik{

    public SrednjoSkolac(String ime, double cenaSkolovanja, ArrayList<Integer> ocene, int brojNeopravdanih){
        super(ime, cenaSkolovanja, ocene, brojNeopravdanih);
    }

    @Override
    //on ima 25% dodatnih troskova.
    public double cenaSkolovanja() {
        //return getCenaSkolovanja() + (getCenaSkolovanja() * 0.25);
        return getCenaSkolovanja() * 1.25;
    }
}
