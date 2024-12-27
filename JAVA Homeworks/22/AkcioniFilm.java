package sestaSedmica.Cetvrtak.Filmovi;

public class AkcioniFilm extends Film{

    public AkcioniFilm(int godinaObjavljivanja, double zarada, Glumac glumac) {
        super(godinaObjavljivanja, zarada, glumac);
    }

    @Override
    public double troskovi() {
        return getZarada() * 0.4;
    }
}
