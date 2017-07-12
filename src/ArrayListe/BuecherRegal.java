package ArrayListe;


import java.util.ArrayList;
import java.util.Collection;


public class BuecherRegal {

    private ArrayList<String> listeBuecher;
    
    
    public BuecherRegal() {
        this.listeBuecher = new ArrayList<>();
    }

    
    
    
    
    public void addBuch(String text){
    
        this.listeBuecher.add(text);
    }
    
    public boolean addPositionBuch(int index, String text){
        try {
            this.listeBuecher.add(index, text);
            return true;
        
        } 
        catch (Exception e) {
            return false;
        }
    
    }
    
    public boolean addBuecherListe(Collection c){
    
        try {
            this.listeBuecher.addAll(c);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
        
    }

    public void clearRegal(){
        this.listeBuecher.clear();
    }
    
    public ArrayList cloneRegal(){
        
        // clone arrayList and Cast to ArrayList
        return (ArrayList) this.listeBuecher.clone();
        
    }
    
    public boolean suche(Object o){
        
        if(this.listeBuecher.contains(o) ){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public void erhoeheRegalKapazitaet(int minCapacity){
        
        this.listeBuecher.ensureCapacity(minCapacity);
    }
    
    public Object getBuch(int index){
        return this.listeBuecher.get(index);
    }
    
    public int positionBuch(Object o){
        return this.listeBuecher.indexOf(o);
    }
    
    public int letzePosition(Object o){
        return this.listeBuecher.lastIndexOf(o);
    }
    
    public void entferne(int index){
        this.listeBuecher.remove(index);
    }
    
    public void ersetzeBuch(int index, Object element){
        this.listeBuecher.set(index, (String) element);
    }
    
    public int regalGroeße(){
        return this.listeBuecher.size();
    }
    
    public Object RegalToArray(){
        return this.listeBuecher.toArray();
    }
    
    public Object RegalToArray(Object[] a){
        return this.listeBuecher.toArray(a);
    }
    
    public void trimRegale(){
        this.listeBuecher.trimToSize();
    }
    
    
    
    
    public ArrayList<String> getArrayListe() {
        return listeBuecher;
    }

    public void setArrayListe(ArrayList<String> listeBuecher) {
        this.listeBuecher = listeBuecher;
    }
    
    
    
    @Override
    public String toString() {
        return "ArrayListe{" + "listeBuecher=" + listeBuecher + '}';
    }
    
    
}


