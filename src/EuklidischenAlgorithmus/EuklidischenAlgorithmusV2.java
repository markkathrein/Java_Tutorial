package EuklidischenAlgorithmus;

import java.util.Scanner;

public class EuklidischenAlgorithmusV2 {

    public static void main(String[] args) {
        
        
        System.out.println("Eingabe von a:");
        Scanner eingabe = new Scanner(System.in);
        int a = eingabe.nextInt();

        System.out.println("Eingabe von b:");
        int b = eingabe.nextInt();

        
        while (b != 0) {
            if (a > b) {
                a = a - b;
                System.out.println("Ausgabe a: " + a);
            } 
            else {
                b = b - a;
            }
        }
        
        
    }
}
