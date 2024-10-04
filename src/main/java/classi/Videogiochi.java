package classi;

import java.time.LocalDateTime;

public class Videogiochi extends Giochi {
    protected String piattaforma;
    protected int durata;
    protected GeneriVideogiochi genere;

    public Videogiochi(String titolo, LocalDateTime annoPubblicazione, double prezzo, int id, String piattaforma, int durata, GeneriVideogiochi genere) {
        super(titolo, annoPubblicazione, prezzo, id);
        this.piattaforma = piattaforma;
        this.durata = durata;
        this.genere = genere;

    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setGenere(GeneriVideogiochi genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return super.toString() +
                "piattaforma='" + piattaforma + '\'' +
                ", durata=" + durata +
                ", genere=" + genere;
    }
}
