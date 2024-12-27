package cetvrtaSedmica.Ponedeljak_For_Switch;

import java.util.Scanner;

public class Domaci_1_Ocene12345_Switch {
    public static void main(String[] args) {

        /*1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
                Ako je ocena 5, slovna ocena je "Odlican".
                Ako je ocena 4, slovna ocena je "Vrlo dobar".
                Ako je ocena 3, slovna ocena je "Dobar".
                Ako je ocena 2, slovna ocena je "Dovoljan".
                Ako je ocena 1, slovna ocena je "Nedovoljan".*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite ocenu od 1 do 5:");
        int ocena = scanner.nextInt();

        switch (ocena) {
            case 1:
                System.out.println("Nedovoljan.");
                break;
            case 2:
                System.out.println("Dovoljan.");
                break;
            case 3:
                System.out.println("Dobar.");
                break;
            case 4:
                System.out.println("Vrlo dobar.");
                break;
            case 5:
                System.out.println("Odlican.");
                break;
            default:
                System.out.println("Morate uneti ocenu od 1 do 5.");
        }


    }
}
