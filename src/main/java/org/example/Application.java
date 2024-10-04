package org.example;

import classi.GeneriVideogiochi;
import classi.Giochi;
import classi.GiochiDaTavolo;
import classi.Videogiochi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        System.out.println("Progetto Settimana 13");

        List<Videogiochi> videogiochi = new ArrayList<>(Arrays.asList(
                new Videogiochi("Pokemon Scarlatto", LocalDateTime.of(2004, 03, 21, 0, 0), 20, 203, "Nintendo DS", 3, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Pokemon Violetto", LocalDateTime.of(2022, 11, 10, 0, 0), 45, 435, "Nintendo DS", 10, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Professor Layton", LocalDateTime.of(2009, 05, 14, 0, 0), 15, 454, "Xbox", 2, GeneriVideogiochi.MISTERY),
                new Videogiochi("Super Smash Bros", LocalDateTime.of(2005, 12, 9, 0, 0), 32, 275, "PS", 1, GeneriVideogiochi.AZIONE),
                new Videogiochi("Crash", LocalDateTime.of(2012, 8, 31, 0, 0), 54, 768, "Xbob", 5, GeneriVideogiochi.ARCADE),
                new Videogiochi("Sonic", LocalDateTime.of(2015, 9, 10, 0, 0), 12, 986, "PS", 7, GeneriVideogiochi.ARCADE)

        ));

        List<GiochiDaTavolo> giocoDaTavolo = new ArrayList<>(Arrays.asList(
                new GiochiDaTavolo("Monopoly", LocalDateTime.of(2004, 05, 04, 0, 0), 40, 345, 8, 9),
                new GiochiDaTavolo("Risiko", LocalDateTime.of(2002, 03, 21, 0, 0), 21, 478, 2, 1),
                new GiochiDaTavolo("Scacchi", LocalDateTime.of(1900, 11, 02, 0, 0), 8, 9, 3, 2),
                new GiochiDaTavolo("Dama", LocalDateTime.of(1980, 07, 23, 0, 0), 23, 645, 5, 3),
                new GiochiDaTavolo("Puzzle", LocalDateTime.of(2003, 06, 12, 0, 0), 60, 543, 10, 23)
        ));

        List<Giochi> giochi = new ArrayList<>();
        giochi.addAll(videogiochi);
        giochi.addAll(giocoDaTavolo);
        giochi.forEach(giochi1 -> System.out.println(giochi1));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli cosa vuoi fare:");
            System.out.println("1 - Aggiungi Gioco");
            System.out.println("2 - Cerca Giochi per id");
            System.out.println("3 - Ricerca per prezzo");
            System.out.println("4 - Ricerca per numero di giocatori");
            System.out.println("5 - Rimuovi Elemento");
            System.out.println("6 - Statistiche");
            System.out.println("7 - Modifica Elemento");
            System.out.println("0 - Esci");

            System.out.print("Inserisci la tua scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Scegli cosa vuoi modificare");
                    System.out.println("1 Videogiochi;");
                    System.out.println("2 Giochi Da Tavola;");
                    System.out.print("Inserisci la tua scelta: ");
                    int scelta2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (scelta2) {
                        case 1:
                            System.out.println("inserisci Titolo");
                            String titolo = scanner.next();
                            System.out.println("inserisci Prezzo");
                            double prezzo = scanner.nextInt();
                            System.out.println("inserisci la Durata");
                            int durata = scanner.nextInt();
                            System.out.println("inserisci il genere: AVVENTURA,ARCADE,MISTERY,AZIONE");
                            GeneriVideogiochi genere = GeneriVideogiochi.valueOf(scanner.next().toUpperCase());
                            System.out.println("inserisci la Piattaforma");
                            String piattaforma = scanner.next();
                            System.out.println("inserisci la Data ANNO-MESE-GIORNO-0-0");
                            LocalDate annoPubblicazione = LocalDate.parse(scanner.next());
                            System.out.println("Inserisci l'id");
                            int id = scanner.nextInt();

                            Videogiochi nuovoVideogioco = new Videogiochi(titolo, annoPubblicazione.atStartOfDay(), prezzo, id, piattaforma, durata, genere);
                            videogiochi.add(nuovoVideogioco);
                            videogiochi.forEach(videogiochi1 -> System.out.println(videogiochi1));


                            break;

                        case 2:
                            System.out.println("inserisci Titolo");
                            String titolo1 = scanner.next();
                            System.out.println("inserisci Prezzo");
                            double prezzo1 = scanner.nextInt();
                            System.out.println("inserisci la Durata");
                            int durata1 = scanner.nextInt();
                            System.out.println("inserisci il numero di giocatori:");
                            int numeroGiocatori = scanner.nextInt();
                            System.out.println("inserisci la Data ANNO-MESE-GIORNO");
                            LocalDate annoPubblicazione1 = LocalDate.parse(scanner.next());
                            System.out.println("Inserisci l'id");
                            int id1 = scanner.nextInt();

                            GiochiDaTavolo nuovoGiocoDaTavola = new GiochiDaTavolo(titolo1, annoPubblicazione1.atStartOfDay(), prezzo1, id1, numeroGiocatori, durata1);
                            giocoDaTavolo.add(nuovoGiocoDaTavola);
                            giocoDaTavolo.forEach(giochiDaTavolo -> System.out.println(giochiDaTavolo));
                            break;

                    }
                    break;
                case 3:
                    System.out.println("inserisci un prezzo:");
                    int ricercaPrezzo = scanner.nextInt();
                    try {
                        List<Giochi> filtraPrezzo = giochi.stream().filter(giochi1 -> giochi1.getPrezzo() < ricercaPrezzo).collect(Collectors.toList());
                        filtraPrezzo.forEach(System.out::println);
                    } catch (Exception e) {
                        System.out.println("Ricerca fallita, riprova più tardi");
                        scanner.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("inserisci il numero di giocatori:");
                    int ricercaGiocatori = scanner.nextInt();
                    try {
                        List<GiochiDaTavolo> filtraGiocatori = giocoDaTavolo.stream().filter(giochiDaTavolo -> giochiDaTavolo.getNumeroGiocatori() <= ricercaGiocatori).collect(Collectors.toList());
                        System.out.println("Ecco una lista di giochi:");
                        filtraGiocatori.forEach(System.out::println);
                    } catch (Exception e) {
                        System.out.println("Ricerca fallita, riprova più tardi");
                        scanner.nextInt();
                    }

                    break;
                case 5:
                    System.out.println("inserisci un ID:");
                    int rimuoviId = scanner.nextInt();
                    // List<Giochi> rimozioneId = giochi.stream().filter(giochi1 -> giochi1.getId() == rimuoviId).collect(Collectors.toList());

                    try {
                        boolean rimozioneId = giochi.removeIf(giochi1 -> giochi1.getId() == rimuoviId);
                        if (rimozioneId) {
                            System.out.println("Gioco rimosso con successo :) , ecco una lista dei giochi aggiornata:");
                            giochi.forEach(giochi1 -> System.out.println(giochi1));
                        } else {
                            System.out.println("Id non valido :(");
                        }

                    } catch (Exception e) {
                        System.out.println("Rimozione fallita,:(");
                        scanner.nextInt();
                    }


                    break;
                case 6:
                    System.out.println("Ecco le tue statistiche:");
                    try {
                        int totaleGiochi = giochi.size();
                        int totaleVideogiochi = videogiochi.size();
                        int totaleGiochidatavolo = giocoDaTavolo.size();
                        System.out.println("Totale Giochi:" + totaleGiochi + " di cui " + totaleVideogiochi + " sono videogiochi e " + totaleGiochidatavolo + " sono giochi da tavolo.");
                        OptionalDouble piuCostoso = giochi.stream().mapToDouble(giochi1 -> giochi1.getPrezzo()).max();
                        if (piuCostoso.isPresent())
                            System.out.println("Il prezzo più alto è di : $" + piuCostoso.getAsDouble());
                        else System.out.println("Non è possibile trovare il prodotto più costoso");
                        OptionalDouble mediaPrezzi = giochi.stream().mapToDouble(giochi1 -> giochi1.getPrezzo()).average();
                        if (mediaPrezzi.isPresent())
                            System.out.println("La media è: $" + mediaPrezzi.getAsDouble());
                    } catch (Exception e) {
                        System.out.println("Errore, non è stato possibile scaricare le statistiche");
                        e.printStackTrace();
                    }

                    break;
                case 7:
                    System.out.println("Scegli cosa vuoi modificare");
                    System.out.println("1 Videogiochi;");
                    System.out.println("2 Giochi Da Tavola;");
                    System.out.print("Inserisci la tua scelta: ");
                    int scelta1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (scelta1) {
                        case 1:
                            try {
                                System.out.println("inserisci un ID:");
                                int modifica = scanner.nextInt();


                                List<Videogiochi> modificaGiochi = videogiochi.stream().filter(giochi1 -> giochi1.getId() == modifica).map(videogiochi1 -> {
                                    System.out.println("Modifica Titolo");
                                    String modificaTitolo = scanner.next();
                                    System.out.println("Modifica Prezzo");
                                    int modificaPrezzo = scanner.nextInt();
                                    System.out.println("Modifica la Durata");
                                    int modificaDurata = scanner.nextInt();
                                    System.out.println("Modifica il genere: AVVENTURA,ARCADE,MISTERY,AZIONE");
                                    String modificaGenere = String.valueOf(GeneriVideogiochi.valueOf(scanner.next().toUpperCase()));
                                    System.out.println("Modifica la Piattaforma");
                                    String modificaPiattaforma = scanner.next().toUpperCase();


                                    videogiochi1.setTitolo(modificaTitolo);
                                    videogiochi1.setPrezzo(modificaPrezzo);
                                    videogiochi1.setDurata(modificaDurata);
                                    videogiochi1.setGenere(GeneriVideogiochi.valueOf(modificaGenere));
                                    videogiochi1.setPiattaforma(modificaPiattaforma);

                                    return videogiochi1;
                                }).toList();
                                modificaGiochi.forEach(videogiochi1 -> System.out.println(videogiochi1));
                            } catch (Exception e) {
                                System.out.println("Errore nella modifica");
                                e.printStackTrace();

                            }
                            break;

                        case 2:
                            try {
                                System.out.println("inserisci un ID:");
                                int modifica1 = scanner.nextInt();


                                List<GiochiDaTavolo> modificaGiochiDaTavolo = giocoDaTavolo.stream().filter(giochi1 -> giochi1.getId() == modifica1).map(giochiDaTavolo -> {
                                    System.out.println("Modifica Titolo");
                                    String modificaTitolo = scanner.next();
                                    System.out.println("Modifica Prezzo");
                                    int modificaPrezzo = scanner.nextInt();
                                    System.out.println("Modifica la Durata");
                                    int modificaDurata = scanner.nextInt();
                                    System.out.println("Modifica il numero di giocatori:");
                                    int modificaGiocatori = scanner.nextInt();


                                    giochiDaTavolo.setTitolo(modificaTitolo);
                                    giochiDaTavolo.setPrezzo(modificaPrezzo);
                                    giochiDaTavolo.setDurataPartita(modificaDurata);
                                    giochiDaTavolo.setNumeroGiocatori(modificaGiocatori);

                                    return giochiDaTavolo;
                                }).toList();
                                modificaGiochiDaTavolo.forEach(giochiDaTavolo -> System.out.println(giochiDaTavolo));
                            } catch (Exception e) {
                                System.out.println("Errore nella modifica");
                                e.printStackTrace();

                            }
                            break;

                    }

                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }


    }

}
