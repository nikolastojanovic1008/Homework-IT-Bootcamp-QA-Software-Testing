package sestaSedmica.Petak.Health;

public class Pedijatar extends Doktor{

    public Pedijatar(String ime, int brojPacijenta, int godinaZaposlenja){
        super(ime, brojPacijenta, godinaZaposlenja);
    }

    @Override
    public double plata() {
        return getBrojPacijenata() * 150;
    }
}
