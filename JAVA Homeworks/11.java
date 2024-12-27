package cetvrtaSedmica.Petak_Metode;

import java.util.Scanner;

public class Domaci_1_Kvadrat_i_Koren_metode {
    public static void main(String[] args) {

        /* Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi neki broj:");
        double broj = scanner.nextDouble();

        kvadrat(broj);
        koren(broj);
    }

    public static void kvadrat(double broj){
        broj = Math.pow(broj, 2);
        System.out.println("Kvadrat unetog broja iznosi: " + broj);
    }

    public static void koren(double broj){
        broj = Math.sqrt(broj);
        System.out.println("Koren unetog broja iznosi: " + broj);
    }


    public static void koren2(double broj){
        boolean validanBroj = true;
        if (broj>=0){
            broj = Math.sqrt(broj);
        } else {
            System.out.println("Nevalidan unos. Morate uneti pozitivan broj ili nulu.");
            validanBroj = false;
        }
        if (validanBroj){
            System.out.println("Koren unetog broja iznosi: " + broj);
        }
    }

}

