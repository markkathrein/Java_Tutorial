package TowersOfHanoi;


import java.util.Scanner;

/**
 * 
 * @author link
 */
public class TowersOfHanoi
{
    
    public static void main(String[]args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Wieviele disks?"); //es wird nach denn platten gefragt
        int disk = scan.nextInt();
        
        doTowers(disk,'A','B','C'); //die methode doTowers wird aufgerufen 
    }
    
    
    public static void doTowers(int disk, char von, char inter, char zu){
    
        if (disk == 1){
            
            System.out.println("Disk 1 von " + von + " zu " + zu); 
        }
        else{
            
            doTowers(disk - 1, von, zu, inter); //wenn disk nicht eins, soll er disk -1, von (A), zu (B), inter(C)
            System.out.println("Disk " + disk + " von " + von + " zu " + zu); //das soll er hier dann ausgeben
            doTowers(disk -1, inter, von, zu);  
        }
    }
    
    
}

