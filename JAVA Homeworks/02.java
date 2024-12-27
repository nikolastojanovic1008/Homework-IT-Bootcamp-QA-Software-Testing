package trecaSedmica.Petak;

public class DomaciZadatakPetak_1 {

    public static void main(String[] args) {

        //1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)

        int r = 5;
        double pi = Math.PI;

        double povrsinaKruga = Math.pow(r,2) * pi;
        System.out.println("Krug ciji je poluprecnik " + r + " ima povrsinu: " + Math.round(povrsinaKruga*100)/100.0 + ".");

        double obimKruga = 2 * r * pi;
        System.out.println("Krug ciji je poluprecnik " + r + " ima obim: " + Math.round(obimKruga*100)/100.0 + ".");



    }
}
