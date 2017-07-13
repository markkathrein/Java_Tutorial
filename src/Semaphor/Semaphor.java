package Semaphor;

import java.util.ArrayList;

/**
 * Aufgabe: 
 * Puffer Situation von Prozess 
 * 2 Zustände mit booleaschen Variablen 1
 * Prozess der den Prozessor fuellt 
 * Wartezeit 1sek 
 * Wenn ander gefüllt kann der ander leeren
 * 
 * 
 */
public class Semaphor {

    ArrayList<Integer> liste;

    public Semaphor() {
        
        liste = new ArrayList<>();
    }

    
    public void getArray() {
        
        if (liste.isEmpty()) {
            System.out.println("Array ist leer.");
        } 
        else {
            for (int i = 0; i < liste.size(); i++) {
        
                System.out.println(liste.get(i));
            }
        }
    }

    
    public void füllen() {
    
        if (liste.isEmpty()) {
            
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    liste.add(i);
                    System.out.print("Der Index " + i + " ist gefüllt.");
                }
            } 
            catch (InterruptedException e) {
            }
        }
    }

    
    public void leeren() {
        if (liste.isEmpty()) {
            System.out.println("Die Liste ist leer");
        } 
        else {
            try {
                for (int i = 0; i < liste.size(); i++) {
                    Thread.sleep(1000);
                    liste.remove(i);
                    System.out.println("Die Liste wurde geleert.");
                }
            } 
            catch (InterruptedException e) {
            }
        }

    }

    public static void main(String[] arg) {
        try {        
            for (int i = 0; i < 100; i++) {
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
        }
    }
    

}
