
// for(initialisierung; bedigung; inkrement-schritt)

// for(bedingung) {...}

// do {...} while (bedingung);

public class Aufgabe03 {
    public static void main(String[] args) {
        // Schleife für Zahlen zwischen 1 und 10, die durch 3 teilbar sind
        System.out.println("Zahlen zwischen 1 und 10, die durch 3 teilbar sind:");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Ende der for Schleife" + i);
            }
        }

        // Schleife für Zahlen zwischen 10 und 20, die durch 3 teilbar sind
        System.out.println("Zahlen zwischen 10 und 20, die durch 3 teilbar sind:");
        for (int i = 10; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println("Ende der for Schleife" +i);
            }
        }

        // Schleife für Zahlen zwischen 20 und 30, die durch 3 teilbar sind
        System.out.println("Zahlen zwischen 20 und 30, die durch 3 teilbar sind:");
        for (int i = 20; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("Ende der for Schleife" +i);
            }
        }
    }
}

