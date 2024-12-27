package sestaSedmica.Petak.Muzika;

public class Reper extends Muzicar{

    public Reper(String ime, int godinaPocetkaKarijere, Album album) {
        super(ime, godinaPocetkaKarijere, album);
    }

    @Override
    public int zarada() {
        return getAlbum().getBrojPesama() * 500;
    }
}
