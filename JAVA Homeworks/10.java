package cetvrtaSedmica.Cetvrtak_Nizovi;

import java.util.Scanner;

public class Domaci_2_MaxBroj_uNizu {
    public static void main(String[] args) {

        /*2. Napisati program koji trazi od korisnika da unese niz celih brojeva i
        vraca maksimalni element u nizu. */

        Scanner scanner = new Scanner(System.in);

        int[] nizBrojeva = new int[3];

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println("Unesi broj za niz:");
            nizBrojeva[i] = scanner.nextInt();
        }

        int maxBroj = nizBrojeva[0];

        for (int broj : nizBrojeva){
            if (broj > maxBroj){
                maxBroj = broj;
            }
        }
        System.out.println("Najveci broj u nizu je: " + maxBroj);

    }
}
