package Fakultätsfunktion;

public class Fakultätsfunktion {

    int zaehltNachOben = 1;
    int fakuEingabe = 0;
    double faku = 1;

    public Fakultätsfunktion() {
    }

    public void fakultaet(int fakultaet) {

        
        while (zaehltNachOben <= fakultaet) {

            faku = faku * zaehltNachOben;
            zaehltNachOben += 1;
        }
        
        
        System.out.printf("n!: %f", faku);
        System.out.printf("%d = ", fakultaet);

        for (int i = 1; i < fakultaet + 1; i++) {
            System.out.print(i);

            if (i < fakultaet) {
                System.out.print(" * ");
            }
        }

        System.out.printf("\t= %f!", faku);

    }

    
    
    
    
    public static void main(String[] args) {
    
        // Objekt Erzeugung der Klasse Fakultätsfunktion
        Fakultätsfunktion f = new Fakultätsfunktion();
        
        // Aufruf der Methode fakultaet
        f.fakultaet(6);
        
    }
}
