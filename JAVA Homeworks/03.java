package trecaSedmica.Petak;

import java.util.Scanner;

public class DomaciZadatakPetak_2 {
    public static void main(String[] args) {

        /*2. Napisati program koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10)
        prema sledecem rangiranju:
            51-60
            61-70
            71-80
            81-90
            91-100
        Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje ispita.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite Vas broj poena na testu:");
        int brojPoena = scanner.nextInt();

        if(brojPoena>=51 && brojPoena<=60){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " dobili ste ocenu 6.");
        } else if(brojPoena>=61 && brojPoena<=70){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " dobili ste ocenu 7.");
        } else if(brojPoena>=71 && brojPoena<=80){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " dobili ste ocenu 8.");
        } else if(brojPoena>=81 && brojPoena<=90){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " dobili ste ocenu 9.");
        } else if(brojPoena>=91 && brojPoena<=100){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " dobili ste ocenu 10.");
        } else if(brojPoena>=0 && brojPoena<51){
            System.out.println("Za broj poena koji iznosi " + brojPoena + " niste polozili ispit.");
        } else {
            System.out.println("Molimo unesite broj poena od 0 do 100.");
        }

    }
}
