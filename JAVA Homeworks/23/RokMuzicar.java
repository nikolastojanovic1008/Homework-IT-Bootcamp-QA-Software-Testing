package sestaSedmica.Petak.Muzika;

public class RokMuzicar extends Muzicar{

    public RokMuzicar(String ime, int godinaPocetkaKarijere, Album album) {
        super(ime, godinaPocetkaKarijere, album);
    }

    @Override
    public int zarada() {
        return getAlbum().getBrojPesama() * 750;
    }
}
