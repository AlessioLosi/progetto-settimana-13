package classi;

import java.time.LocalDateTime;

public class GiochiDaTavolo extends Giochi {
    protected int numeroGiocatori;
    protected int durataPartita;

    public GiochiDaTavolo(String titolo, LocalDateTime annoPubblicazione, double prezzo, int id, int numeroGioctori, int durataPartita) {
        super(titolo, annoPubblicazione, prezzo, id);
        this.numeroGiocatori = numeroGioctori;
        this.durataPartita = durataPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataPartita() {
        return durataPartita;
    }

    public void setDurataPartita(int durataPartita) {
        this.durataPartita = durataPartita;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroGioctori=" + numeroGiocatori +
                ", durataPartita=" + durataPartita;
    }
}
