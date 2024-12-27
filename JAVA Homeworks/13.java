package petaSedmica.Ponedeljak;

import java.util.Scanner;

public class Domaci_1 {
    public static void main(String[] args) {

        int[] nizBrojeva = new int[5];

        unosNiza(nizBrojeva);

        stampanjeNiza(nizBrojeva);

        int srednjaVrednost = srednjaVrednostNiza(nizBrojeva);
        System.out.println("Srednja vrednost niza brojeva iznosi " + srednjaVrednost + ".");

        String zbirDvocifrenihBrojeva = zbirDvocifrenihBrojevaNiza(nizBrojeva);
        System.out.println(zbirDvocifrenihBrojeva);

        int razlika = razlikaMaxiMinBrojaUNizu(nizBrojeva);
        System.out.println("Razlika najveceg i najmanjeg broja u nizu iznosi " + razlika + ".");

    }
    //matoda za unos niza
    public static void unosNiza(int[] niz){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi niz brojeva:");
        for (int i = 0; i < niz.length; i++){
            niz[i] = scanner.nextInt();
        }
    }

    //metoda za stampanje niza
    public static void stampanjeNiza(int[] niz){
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }
    }

    //Metoda za racunanje srednje vrednosti brojeva u nizu
    public static int srednjaVrednostNiza(int[] niz){
        int zbirSvihBrojeva = 0;
        int srednjaVrednost = 0;
        for (int i = 0; i < niz.length; i++){
            zbirSvihBrojeva += niz[i];
        }
        srednjaVrednost = zbirSvihBrojeva / niz.length;
        return srednjaVrednost;
    }

    //Metoda za sabiranje svih dvocifrenih brojeva

    public static String zbirDvocifrenihBrojevaNiza(int[] niz){
        int zbirDvocifrenihBrojeva = 0;
        boolean daLiImaDvocifrenihBrojeva = false;
        int brojac = 0;

        for (int i = 0; i < niz.length; i++){
            if (niz[i] > 9 && niz[i] <100){
                brojac++;
                zbirDvocifrenihBrojeva += niz[i];
                daLiImaDvocifrenihBrojeva = true;
            }
        }
        if (daLiImaDvocifrenihBrojeva && brojac == 1){
            return "U nizu je samo jedan dvocifren broj " + zbirDvocifrenihBrojeva + ". Mora biti vise od jednog da bismo mogli da ih saberemo." ;
        }else if (daLiImaDvocifrenihBrojeva && brojac > 1){
            return "Zbir dvocifrenih brojeva iznosi " + zbirDvocifrenihBrojeva + ".";
        }else {
            return "U nizu nema dvocifrenih brojeva za sabiranje.";
        }
    }

    //Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
    public static int razlikaMaxiMinBrojaUNizu(int[] niz){
        int maxBroj = niz[0];
        int minBroj = niz[0];
        int razlika;

        for (int i = 0; i < niz.length; i++){
            if (niz[i] > maxBroj){
                maxBroj = niz[i];
            }
        }
        for (int i = 0; i < niz.length; i++){
            if (niz[i] < minBroj){
                minBroj = niz[i];
            }
        }
        razlika = maxBroj - minBroj;
        return razlika;
    }
}
