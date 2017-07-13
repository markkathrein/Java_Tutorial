package EratosthenesSieb;

/**
 * Primzahlberechnung mit dem Algorithmus Sieb des Eratosthenes
 *
 * @author Prof. Solymosi
 * @version 3.6.2013
 */
public class EratosthenesSieb {

    
    /**
     * Algorithmus:
     *
     * @param Obergrenze
     */
    static int[] eratosthenes(int max) {

        final int maxprim = (int) Math.sqrt(max) + 2;

        // alle Zahlen bis max
        boolean[] zahlen = new boolean[max];

        // Initialisierungsschleife
        for (int i = 0; i < max; i++) {
            zahlen[i] = i % 2 == 1; // ungerade Zahlen noch nicht gestrichen
        }

        // der eigentliche Algorithmus:
        for (int prim = 3; prim < maxprim; prim += 2) { // nur die ungeraden Zahlen
            // (die geraden Zahlen wurden schon gestrichen)

            if (zahlen[prim]) { // noch nicht gestrichen, d.h. prim

                for (int i = prim; i <= max / prim; i++) {
                    final int zahl = i * prim;

                    if (zahl < max) // Überlauf verhindern
                    {
                        zahlen[zahl] = false; // streichen
                    }
                }
            }
        }

        // Anzahl der gefundenen Primzahlen ermitteln:
        int anzahl = 0;
        for (boolean istPrim : zahlen) {
            if (istPrim) {
                anzahl++;
            }
        }

        // Ergebnis einsammeln:
        int[] primzahlen = new int[anzahl];
        int index = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i]) {
                primzahlen[index++] = i;
            }
        }

        primzahlen[0] = 2; // Anfang korrigieren
        return primzahlen;
    }
}
