package sestaSedmica.Petak.Skola;

import java.util.ArrayList;

public class Student extends Ucenik{

    public Student (String ime, double cenaSkolovanja, ArrayList<Integer> ocene, int brojNeopravdanih){
        super(ime, cenaSkolovanja, ocene, brojNeopravdanih);
    }

    @Override
    //on ima 30% dodatnih troskova.
    public double cenaSkolovanja() {
        //return getCenaSkolovanja() + (getCenaSkolovanja() * 0.3);
        return getCenaSkolovanja() * 1.3;
    }
}

