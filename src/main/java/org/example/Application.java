package org.example;

import classi.GeneriVideogiochi;
import classi.Giochi;
import classi.GiochiDaTavolo;
import classi.Videogiochi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
                    

                    break;
                case 2:
                    System.out.println("inserisci un ID:");
                    int ricercaId = scanner.nextInt();
                    List<Giochi> filtraId = giochi.stream().filter(giochi1 -> giochi1.getId() == ricercaId).collect(Collectors.toList());
                    filtraId.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("inserisci un prezzo:");
                    int ricercaPrezzo = scanner.nextInt();
                    List<Giochi> filtraPrezzo = giochi.stream().filter(giochi1 -> giochi1.getPrezzo() < ricercaPrezzo).collect(Collectors.toList());
                    filtraPrezzo.forEach(System.out::println);
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

