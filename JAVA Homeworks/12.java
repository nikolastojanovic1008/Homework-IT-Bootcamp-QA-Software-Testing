package cetvrtaSedmica.Petak_Metode;

import java.util.Scanner;

public class Domaci_2_Faktorijel_medota {
    public static void main(String[] args) {

        //Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj ciji faktorijel zelite da izracunate:");
        int broj = scanner.nextInt();

        faktorijel(broj);

    }

    public static void faktorijel(int broj){
        int i = 1;
        int faktorijel = 1;
        while (i <= broj){
            faktorijel *= i;
            i++;
        }
        System.out.println("Faktorijel unetog broja iznosi: " + faktorijel);
    }
}
