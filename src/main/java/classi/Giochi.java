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

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDateTime getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(LocalDateTime annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                ", id=" + id;
    }
}
