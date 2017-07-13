package Rekursion;

import java.util.Arrays;

/**
 * 
 * @author link
 * Lösung durch Iterativ Array 
 * 
 */
public class FibonacciIterativArray {
    
    
    public static void main(String[]arg){
    
        // Laenge definieren
        int n = 10;

        // Array initialisieren
        int[] array = new int[n];

        // Fuege zwei Werte dem Array hinzu: f1 = f2 = 1
        array[0] = 1;
        array[1] = 1;

        // Fuelle das restliche Array nach: fn = fn-1 + fn-2 für n > 2
        for(int i = 2; i < n;i++){
            array[i] = array[i-1] + array[i-2];
        }

        System.out.println("Fibonacci - Länge der Zahlen durch n gegeben.\n");
        System.out.println (Arrays.toString(array));

    }
}
