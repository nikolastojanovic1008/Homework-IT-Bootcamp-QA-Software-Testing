package cetvrtaSedmica.Utorak_While_Do_While;

import java.util.Scanner;

public class Domaci1_Do_While_lozinka {
    public static void main(String[] args) {

        /*1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
        unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalizovana.*/

        Scanner scanner = new Scanner(System.in);

        String lozinka = "ana123";
        String inputLozinka;

        do {
            System.out.println("Unesi lozinku:");
            inputLozinka = scanner.nextLine();
            if (inputLozinka.equals(lozinka)){
                System.out.println("Uneli ste ispravnu lozinku.");
            } else {
                System.out.println("Lozinka nije ispravna. Pokusajte ponovo.");
            }
        } while (!(inputLozinka.equals(lozinka)));

        System.out.println("Program je zavrsen.");
    }
}
