package bingoProjekat;

import java.util.Scanner;

public class Bingo_Projekat {
    public static void main(String[] args) {

        int[] odabraniBrojevi = new int[6];
        tiket(odabraniBrojevi);

        int[] randomBrojevi;
        randomBrojevi = izvlacenjeBrojeva();

        bingo(odabraniBrojevi, randomBrojevi);

        /*Ovaj vec definisan niz od 1 do 30 sam dodala samo da testiram kako se ispisuje Bingo poruka
        i kako se ispisuje poruka da nema pogodaka jer preko random te dve situacije se tesko dese.
        Ovako preko skenera unesem da se poklopi svih 6 brojeva sa ovim nizom ili unesem 6 brojeva razlicitih od
        ovog niza ili unesem da bude samo jedan pogodak da potvrdim da se u konzoli jasno ispisuje poruka. */
        System.out.println("\nRezultat za probni niz:");
        int[] nizZaTestiranje = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        bingo(odabraniBrojevi, nizZaTestiranje);
    }

    public static void tiket(int[] niz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi razlicite brojeve od 1 do 100:");
        for (int i = 0; i < niz.length; i++) {
            while (true) {
                niz[i] = scanner.nextInt();
                if (niz[i] >= 1 && niz[i] <= 100) {
                    boolean daLiJeDuplikat = false;
                    for (int j = 0; j < i; j++) {
                        if (niz[i] == niz[j]) {
                            daLiJeDuplikat = true;
                            break;
                        }
                    }
                    if (daLiJeDuplikat) {
                        System.out.println("Broj je vec unet. Unesite neki drugi broj.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Broj mora biti od 1 do 100. Pokusajte ponovo:");
                }
            }
        }
    }

    public static int[] izvlacenjeBrojeva() {
        int[] niz = new int[30];
        for (int i = 0; i < niz.length; i++) {
            boolean daLiJeVecGenerisan;
            do {
                niz[i] = (int) (Math.random() * 100) + 1;
                daLiJeVecGenerisan = false;
                for (int j = 0; j < i; j++) {
                    if (niz[i] == niz[j]) {
                        daLiJeVecGenerisan = true;
                        break;
                    }
                }
            } while (daLiJeVecGenerisan);
        }
        //dodala sam stampanje cisto da pregledam niz da li je bez duplikata
        for (int broj : niz) {
            System.out.print(broj + " ");
        }
        //a ovo je da bih lakse citala output u konzoli, da mi poruka bude ispod generisanog niza, a ne pored njega
        System.out.println("\n");

        return niz;
    }

    public static void bingo(int[] niz1, int[] niz2) {
        int brojac = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    brojac++;
                    break;
                }
            }
        }
        if (brojac == 0) {
            System.out.println("Nema pogodaka.");
        } else if (brojac == 1) {
            System.out.println("Pogodjeno je " + brojac + " put.");
        } else if (brojac > 1){
            System.out.println("Pogodjeno je " + brojac + " puta.");
            if (brojac == 6) {
                System.out.println("Bingo.");
            }
        }
    }
}
