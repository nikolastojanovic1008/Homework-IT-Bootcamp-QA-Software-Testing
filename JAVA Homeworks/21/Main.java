package sestaSedmica.Cetvrtak.Garaza;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Brod b = new Brod(100, 1000, 2000, 100);

        Auto a = new Auto(100, 1000, 2000);

        System.out.println(b.izracunajCenu());
        System.out.println(a.izracunajCenu());

        Vozilo brod = new Brod(100, 1000, 2000, 100);
        Vozilo auto = new Auto(100, 1000, 2000);

        ArrayList<Vozilo> lista = new ArrayList<>();
        lista.add(brod);
        lista.add(auto);

    }
}
