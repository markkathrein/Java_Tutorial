package ggT;

/**
 * 
 * @author link
 */
public class ggTRekursive {

    public ggTRekursive() {
    }

    public int ggtRekursive(int zahl1, int zahl2) {

        if (zahl2 == 0) {
   
            return zahl1;
        } 
        else {
            return ggtRekursive(zahl2, zahl1 % zahl2);
        }

    }

    public static void main(String[] args) {
        
        ggTRekursive g = new ggTRekursive();

        System.out.println(g.ggtRekursive(120, 55));
    }

}
