package sestaSedmica.Cetvrtak.DodatniZadatak;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Predmet predmet1 = new Predmet("Matematika", 1, "Profesor Peric");
        Predmet predmet2 = new Predmet("Programiranje", 2, "Profesor Markovic");

        ArrayList<Predmet> listaPredmeta = new ArrayList<>();
        ArrayList<Integer> listaOcena = new ArrayList<>(Arrays.asList(6,7,8,9));
        listaOcena.add(10);

        Student student = new Student("Ana", "Gasic", 1989, listaPredmeta, 77, listaOcena);
        student.dodavanjePredmeta(predmet1);
        student.dodavanjePredmeta(predmet2);

        System.out.println(student);
        student.predstaviSe();
        student.prikaziPredmete();
        System.out.println(student.prosekOcena());
    }
}
