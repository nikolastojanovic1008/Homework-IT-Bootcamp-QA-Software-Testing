package cetvrtaSedmica.Utorak_While_Do_While;

import java.util.Scanner;

public class Domaci_2_DelilacNeMozeBitiNula_While {
    public static void main(String[] args) {

        /*2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
        treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
        da je drugi broj jednak nuli.*/

        Scanner scanner = new Scanner(System.in);

        double deljenik, delilac, kolicnik;

        System.out.println("Unesite neki broj:");
        deljenik = scanner.nextDouble();
        System.out.println("Unesite jos neki broj:");
        delilac = scanner.nextDouble();

        while (delilac == 0){
            System.out.println("Delilac ne sme biti nula. Unesite neki broj razlicit od nule:");
            delilac = scanner.nextDouble();
        }
        kolicnik = deljenik / delilac;

        System.out.println("Rezultat deljenja brojeva " + deljenik + " i " + delilac + " je: " + kolicnik + ".");
    
    }
}
