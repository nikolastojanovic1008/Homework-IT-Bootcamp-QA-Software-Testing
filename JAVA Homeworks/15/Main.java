package sestaSedmica.Utorak.Biblioteka;

public class Main {
    public static void main(String[] args) {

        Knjiga k = new Knjiga("Knjiga", 400, 2020, 50);
        Autor a = new Autor("Neki autor", 1980, 5, k);

        k.popust();
        System.out.println("Cena knjige: " + k.getCena());

        k.oldTimer();

        a.ranaObjava();

        System.out.println(a.zarada());


    }
}
