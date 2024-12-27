package cetvrtaSedmica.Ponedeljak_For_Switch;

import java.util.Scanner;

public class Domaci_2_Prost_Broj {
    public static void main(String[] args) {

        /*2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom.
        Ispiši odgovarajuću poruku.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi neki broj:");
        int broj = scanner.nextInt();

        boolean daLiJeBrojProst = true;

       for (int i = 2; i < broj; i++) { 
           if (broj % i == 0) {
               daLiJeBrojProst = false;
               break;
           }
        }
        if (daLiJeBrojProst && broj > 1) {
            System.out.println("Uneti broj je prost.");
        } else {
            System.out.println("Uneti broj nije prost.");
        }


    }

}

