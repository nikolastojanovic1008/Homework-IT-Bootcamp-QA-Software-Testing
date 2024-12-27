package sestaSedmica.Petak.Skola;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> osnovacOcene = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1));
        osnovacOcene.add(2);
        Osnovac osnovac = new Osnovac("Ana", 100, osnovacOcene, 0);

        ArrayList<Integer> srednjoSkolacOcene = new ArrayList<>();
        System.out.println(srednjoSkolacOcene.size());

        SrednjoSkolac srednjoSkolac = new SrednjoSkolac("Marina", 100, srednjoSkolacOcene, 0);

        ArrayList<Integer> studentOcene = new ArrayList<>();
        Student student = new Student("Jelena", 100, studentOcene, 10);

        System.out.println(osnovac.cenaSkolovanja());
        System.out.println(osnovacOcene);
        System.out.println(osnovac.ukor()); //dobijamo true jer ima vise od 10 jedinica
    }
}
