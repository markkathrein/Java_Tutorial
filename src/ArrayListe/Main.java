
package ArrayListe;


public class Main {

    public static void main(String[] args) {
        BuecherRegal regal = new BuecherRegal();
        
        regal.addBuch("Eintrag von Index 0");
        regal.addBuch("Eintrag von Index 1");
        regal.addBuch("Eintrag von Index 2");
        
        
        // Variante 1. Ausgabe ForSchleife
        for(String a : regal.getArrayListe() ){
            System.out.println(a);
        }
        
        // Vairante 2. toString Methode
        System.out.println("\n" + regal.toString() );
        
    }
    
    
}
