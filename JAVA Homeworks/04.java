package trecaSedmica.Petak;

import java.util.Scanner;

public class DomaciZadatakPetak_3_resenjeSaDouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj:");
        double broj1 = scanner.nextDouble();

        System.out.println("Unesite + ili - kao znak za zeljenu racunsku operaciju");
        char operacija = scanner.next().charAt(0);

        System.out.println("Unesite jos neki broj:");
        double broj2 = scanner.nextDouble();

        double rezultat;

        if (operacija == '+') {
            rezultat = broj1 + broj2;
            if (rezultat == (int) rezultat) {
                System.out.println("Rezultat: " + (int) rezultat);
            } else {
                System.out.println("Rezultat: " + rezultat);
            }
        } else if (operacija == '-') {
            rezultat = broj1 - broj2;
            if (rezultat == (int) rezultat) {
                System.out.println("Rezultat: " + (int) rezultat);
            } else {
                System.out.println("Rezultat: " + rezultat);
            }
        } else {
            System.out.println("Mozete uneti samo + ili - kao znak za racunsku operaciju.");
        }


    }
}
