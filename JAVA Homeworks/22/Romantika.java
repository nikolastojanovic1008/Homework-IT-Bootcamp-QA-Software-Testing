package sestaSedmica.Cetvrtak.Filmovi;

public class Romantika extends Film{

    public Romantika(int godinaObjavljivanja, double zarada, Glumac glumac) {
        super(godinaObjavljivanja, zarada, glumac);
    }

    @Override
    public double troskovi() {
        return getZarada() * 0.1;
    }
}
