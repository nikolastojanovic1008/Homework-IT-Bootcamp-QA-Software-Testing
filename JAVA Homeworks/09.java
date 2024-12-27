package cetvrtaSedmica.Cetvrtak_Nizovi;

import java.util.Scanner;

public class Domaci_1_SumaSvihElemenataNiza {
    public static void main(String[] args) {

        /*1. Napisati program koji trazi od korisnika da unese niz celih brojeva i
        vraca sumu svih elemenata niza. */

        Scanner scanner = new Scanner(System.in);

        int[] nizBrojeva = new int[3];

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println("Unesi broj za niz:");
            nizBrojeva[i] = scanner.nextInt();
        }

        int sumaNizaBrojeva = 0;
        for (int i = 0; i < nizBrojeva.length; i++){
            sumaNizaBrojeva += nizBrojeva[i];
        }
        System.out.println("Suma niza brojeva iznosi " + sumaNizaBrojeva);


        //enhanced
        int sumaNizaBrojeva2 = 0;
        for (int broj : nizBrojeva) {
            sumaNizaBrojeva2 += broj;
        }
        System.out.println("Suma svih brojeva u nizu iznosi: " + sumaNizaBrojeva2);
    }
}
