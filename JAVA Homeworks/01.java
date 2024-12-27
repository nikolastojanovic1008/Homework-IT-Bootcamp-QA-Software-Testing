package trecaSedmica;


public class DomaciZadatakCetvrtak {
    public static void main(String[] args) {

        /*1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama:
        a = 5 i b = 13 (dužine stranica) */

        int a = 5;
        int b = 13;

        int povrsinaPravougaonika = a*b;
        System.out.println("Povrsina pravougaonika iznosi: " + povrsinaPravougaonika + ".");

        int obimPravougaonika = 2 * (a + b);
        System.out.println("Obim pravougaonika iznosi: " + obimPravougaonika + ".");



        /*2. String s1 = "bootcamp qa" i s2 = "xx generacija" spojiti u novi string
        i ispisati ga u konzoli tako da sva slova budu velika.*/

        String s1 = "bootcamp qa";
        String s2 = "xx generacija";

        String s3 = s1 + " " + s2;
        System.out.println(s3.toUpperCase());

        //moze i ovako:
        //String s3 = (s1 + " " + s2).toUpperCase();
        //System.out.println(s3);



        /*3. Inicijalizovati promenljive broj1 i broj2 sa proizvoljnim vrednostima,
        zatim ispisati rezultate njihovog zbira, proizvoda i ostatka pri deljenju.*/

        int broj1 = 9;
        int broj2 = 2;

        int zbir = broj1 + broj2;
        System.out.println("Zbir brojeva " + broj1 + " i " + broj2 + " iznosi: " + zbir + ".");

        int proizvod = broj1 * broj2;
        System.out.println("Proizvod brojeva " + broj1 + " i " + broj2 + " iznosi: " + proizvod + ".");

        int ostatakPriDeljenju = broj1 % broj2;
        System.out.println("Ostatak pri deljenju brojeva " + broj1 + " i " + broj2 + " iznosi: " + ostatakPriDeljenju + ".");
    }
}
