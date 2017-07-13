package Rekursion;


/**
 * 
 * @author link
 * Lösung Rekrusive durch erneuten aufruf der statischen methode fib()
 * 
 */
public class FibonacciRekrusive {    
    
    
    public static void main(String[] args){
        
        for(int x = 0; x <= 10; x++){
            
            int aufzähler= 1;
            System.out.println(aufzähler + ": " + fib(x));
            
            aufzähler++;
        }
    }
    
    
    public static long fib(int i){
        
        if (i == 0) {
            return 0;
        }
        if (i<= 2) {
            return 1;
        }

        long a = fib(i - 1) + fib(i - 2);
        
        return a;
    }
    
    
}



