package EuklidischenAlgorithmus;

import java.util.Scanner;

public class EuklidischenAlgorithmus {

    
    public static void main(String[] args) {

        System.out.println("Eingabe a");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Eingabe b");
        int b = scan.nextInt();

        int b1 = 0, a2, b2;

        if (b > a) {
            b2 = b;
            a2 = a;
            b = a2;
            a = b2;
        }

        while (b != 0) {

            b1 = b;
            b = a % b;
            a = b1;

        }

        System.out.printf("Größter gemeinsamer Teiler: %d", b1);

    }

}
