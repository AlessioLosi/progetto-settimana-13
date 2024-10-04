package classi;

import java.time.LocalDateTime;

public class GiochiDaTavolo extends Giochi {
    protected int numeroGioctori;
    protected int durataPartita;

    public GiochiDaTavolo(String titolo, LocalDateTime annoPubblicazione, double prezzo, int id, int numeroGioctori, int durataPartita) {
        super(titolo, annoPubblicazione, prezzo, id);
        this.numeroGioctori = numeroGioctori;
        this.durataPartita = durataPartita;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroGioctori=" + numeroGioctori +
                ", durataPartita=" + durataPartita;
    }
}
