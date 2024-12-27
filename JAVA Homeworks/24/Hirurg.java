package sestaSedmica.Petak.Health;

public class Hirurg extends Doktor{

    public Hirurg(String ime, int brojPacijenta, int godinaZaposlenja){
        super(ime, brojPacijenta, godinaZaposlenja);
    }

    @Override
    public double plata() {
        return getBrojPacijenata() * 230;
    }
}
