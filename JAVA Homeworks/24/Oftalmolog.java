package sestaSedmica.Petak.Health;

public class Oftalmolog extends Doktor{

    public Oftalmolog(String ime, int brojPacijenta, int godinaZaposlenja){
        super(ime, brojPacijenta, godinaZaposlenja);
    }

    @Override
    public double plata() {
        return getBrojPacijenata() * 100;
    }

}
