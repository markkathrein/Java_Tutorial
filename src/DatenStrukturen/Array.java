package DatenStrukturen;

import java.util.ArrayList;




public class Array {


    public static void main(String[] args) {
        
        ArrayList<String> liste = new ArrayList<>();
        
        // Titel Ausgabe
        System.out.println("\n"
                + "Array Basis Funktionen: \n"
                + "***********************\n");
        
        
        // Liste Hinzufuegen
        liste.add("Hammer");
        liste.add("Nagel");
        liste.add("Seil");
        
        
        // Liste mit Index Nummer
        System.out.println("Ausgabe Indes 0: " + liste.get(0) );
        System.out.println("Ausgabe Indes 1: " + liste.get(1) );
        System.out.println("Ausgabe Indes 2: " + liste.get(2) );
        System.out.println("\n\n");
        
        
        
        // Schleifen Ausgabe - Variante 1
        System.out.println(""
                + "Ausgabe der Liste mit einer for Schleife:\n"
                + "*******************************************\n");
        for(int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }

        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
