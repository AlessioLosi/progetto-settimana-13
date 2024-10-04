package org.example;

import classi.GeneriVideogiochi;
import classi.Giochi;
import classi.GiochiDaTavolo;
import classi.Videogiochi;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        System.out.println("Progetto Settimana 13");

      /*  List<Videogiochi> videogiochi = Arrays.asList(
                new Videogiochi("Pokemon Scarlatto", LocalDateTime.of(2004, 03, 21, 0, 0), 20, 203, "Nintendo DS", 3, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Pokemon Violetto", LocalDateTime.of(2022, 11, 10, 0, 0), 45, 435, "Nintendo DS", 10, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Professor Layton", LocalDateTime.of(2009, 05, 14, 0, 0), 15, 454, "Xbox", 2, GeneriVideogiochi.MISTERY),
                new Videogiochi("Super Smash Bros", LocalDateTime.of(2005, 12, 9, 0, 0), 32, 275, "PS", 1, GeneriVideogiochi.AZIONE),
                new Videogiochi("Crash", LocalDateTime.of(2012, 8, 31, 0, 0), 54, 768, "Xbob", 5, GeneriVideogiochi.ARCADE),
                new Videogiochi("Sonic", LocalDateTime.of(2015, 9, 10, 0, 0), 12, 986, "PS", 7, GeneriVideogiochi.ARCADE)

        );

        List<GiochiDaTavolo> giocoDaTavolo = Arrays.asList(
                new GiochiDaTavolo("Monopoly", LocalDateTime.of(2004, 05, 04, 0, 0), 40, 345, 8, 9),
                new GiochiDaTavolo("Risiko", LocalDateTime.of(2002, 03, 21, 0, 0), 21, 478, 2, 1),
                new GiochiDaTavolo("Scacchi", LocalDateTime.of(1900, 11, 02, 0, 0), 8, 934, 2, 2),
                new GiochiDaTavolo("Dama", LocalDateTime.of(1980, 07, 23, 0, 0), 23, 645, 2, 3),
                new GiochiDaTavolo("Puzzle", LocalDateTime.of(2003, 06, 12, 0, 0), 60, 543, 10, 23)
        );*/
        List<Giochi> giochi = Arrays.asList(
                new Videogiochi("Pokemon Scarlatto", LocalDateTime.of(2004, 03, 21, 0, 0), 20, 203, "Nintendo DS", 3, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Pokemon Violetto", LocalDateTime.of(2022, 11, 10, 0, 0), 45, 435, "Nintendo DS", 10, GeneriVideogiochi.AVVENTURA),
                new Videogiochi("Professor Layton", LocalDateTime.of(2009, 05, 14, 0, 0), 15, 454, "Xbox", 2, GeneriVideogiochi.MISTERY),
                new Videogiochi("Super Smash Bros", LocalDateTime.of(2005, 12, 9, 0, 0), 32, 275, "PS", 1, GeneriVideogiochi.AZIONE),
                new Videogiochi("Crash", LocalDateTime.of(2012, 8, 31, 0, 0), 54, 768, "Xbob", 5, GeneriVideogiochi.ARCADE),
                new Videogiochi("Sonic", LocalDateTime.of(2015, 9, 10, 0, 0), 12, 986, "PS", 7, GeneriVideogiochi.ARCADE),
                new GiochiDaTavolo("Monopoly", LocalDateTime.of(2004, 05, 04, 0, 0), 40, 345, 8, 9),
                new GiochiDaTavolo("Risiko", LocalDateTime.of(2002, 03, 21, 0, 0), 21, 478, 2, 1),
                new GiochiDaTavolo("Scacchi", LocalDateTime.of(1900, 11, 02, 0, 0), 8, 934, 2, 2),
                new GiochiDaTavolo("Dama", LocalDateTime.of(1980, 07, 23, 0, 0), 23, 645, 2, 3),
                new GiochiDaTavolo("Puzzle", LocalDateTime.of(2003, 06, 12, 0, 0), 60, 543, 10, 23)

        );
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli cosa vuoi fare:");
            System.out.println("1 - Aggiungi Gioco");
            System.out.println("2 - Cerca Giochi per id");
            System.out.println("3 - Ricerca per prezzo");
            System.out.println("4 - Ricerca per numero di giocatori");
            System.out.println("5 - Modifica Elemento");
            System.out.println("6 - Statistiche");
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

                    break;
                case 4:

                    break;
                case 5:

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

