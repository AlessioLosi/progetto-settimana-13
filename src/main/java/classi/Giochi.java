package classi;

import java.time.LocalDateTime;

public class Giochi {
    protected String titolo;
    protected LocalDateTime annoPubblicazione;
    protected double prezzo;
    protected int id;

    public Giochi(String titolo, LocalDateTime annoPubblicazione, double prezzo, int id) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
        this.id = id;

    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDateTime getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                ", id=" + id;
    }
}
