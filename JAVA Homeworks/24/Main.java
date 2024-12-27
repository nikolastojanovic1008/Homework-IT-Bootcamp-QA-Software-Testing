package sestaSedmica.Petak.Health;

public class Main {
    public static void main(String[] args) {

        Doktor pedijatar = new Pedijatar("Milos", 10, 1990);
        Doktor hirurg = new Hirurg("Milan", 11, 1980);
        Doktor oftalmlog = new Oftalmolog("Jelena", 7, 2000);

        System.out.println(pedijatar.godineStaza());
        System.out.println(hirurg.godineStaza());
        System.out.println(oftalmlog.godineStaza());

        System.out.println(pedijatar.plata());
        System.out.println(hirurg.plata());
        System.out.println(oftalmlog.plata());
    }
}
