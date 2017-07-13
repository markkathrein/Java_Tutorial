package ggT;

public class ggT {

    public ggT() {
    }

    //Algorithmus für nichtnegative ganze Zahlen a und b
    public int euklidischerAlgorithmus(int zahl, int teiler) {
        if (zahl == 0) {
            return teiler;
        }
        while (teiler != 0) {
            if (zahl > teiler) {
                zahl = zahl - teiler;
            } else {
                teiler = teiler - zahl;
            }
        }
        return zahl;
    }

    public static void main(String[] args) {

        ggT t = new ggT();

        int zahl1 = 800;
        int zahl2 = 9;
        int ergebnis = t.euklidischerAlgorithmus(zahl1, zahl2);

        System.out.println("Der ggT von " + zahl1 + " und " + zahl2 + " ist: " + ergebnis);
    }
}
