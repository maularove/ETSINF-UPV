```java

package pract7;
import pract5.DateTime;

public class Calendar {

    public static final int MAX_EVENTS = 30;
    private int numEvents;

    /* CLASS EVENT */
    private Event[] program; 
    private int[] numPerType;
    
    /* EMPTY CONSTRUCTOR */
    public Calendar() {      
        program = new Event[MAX_EVENTS];
        numEvents = 0;
        numPerType = new int[4];
    }
    
    /* ------------------------------------------------------------------------ */
    /* GETTERS Y SETTERS */
    public int getNumEvents() { return numEvents;}
    public int getNumType(int type) { return numPerType[type]; }
    
    /* ------------------------------------------------------------------------ */
    /* TO STRING METHOD */
    public String toString() {
        String res = "";
        for(int i = 0; i < numEvents ; i++){
            res += program[i].toString() + "\n";
        }
        return res;
    }
    
    /* ------------------------------------------------------------------------ */
    /* Devuelve true si un Event e dado se solapa con cualquier otro Event */
    private boolean overlaps(Event e) {
    //versión 1:
        // boolean exists = false;
        // int i = 0;
        // while(i < numEvents && !exists){
            // exists = program[i].compareTo(e) == 0;
            // i++;
        // }
        // return exists;
    
    //Versión 2: tenemos en cuenta que al array program los eventos están 
    //ordenados cronológicamente  por fecha de inicio.
        int compare = -1, i = 0;
        while(i < numEvents && compare < 0){
            compare = program[i].compareTo(e);
            i++;
        }
        return compare == 0;
    }
    
    /* ------------------------------------------------------------------------ */
    /* Dado un Event e, si cabe y no se solapa con ningún otro del calendario, lo añade en orden cronológico, 
       y devuelve true. Si no cabe o hay solapamiento, no lo añade y devuelve false. */    
    public boolean add(Event e) { 

        // SI NO CABE, DEVUELVE FALSE
        if(numEvents == MAX_EVENTS || overlaps(e)){return false;}

        int i = numEvents - 1;
        while(i >= 0 && program[i].compareTo(e)>0){
            program[i + 1] = program[i];
            i--;
        }
            
        // SITUAR e en la posición de program que corresponde 
        // INCREMENTAR en uno el nombre de eventos en el.
        program[i+1] = e;
        numEvents++;
        numPerType[e.getType()]++;
        return false;
    }
        
    
    /* ------------------------------------------------------------------------ */
    /* Devuelve la posición que ocupa en el array program un evento de título dado 
       o -1 si no existe. */
    private int searchTitle(String title) {
        int i = numEvents -1;
        while(i>=0 && !program[i].getTitle().equals(title)){i--;}
        return -1;  
    }
    
    /* ------------------------------------------------------------------------ */
    /* Elimina del calendario el evento de título dado, si existe, y devuelve true. 
     *  Si no existe, no elimina nada y devuelve false. */
    public boolean delete(String title) {
        int pos = searchTitle(title) ;
        if(pos == -1){ return false; }
        
        numPerType[program[pos].getType()]--;
        
        for(int i =pos + 1;i < numEvents ; i++) {
            program[i-1] = program[i];            
        }
        numEvents--;
        program[numEvents] = null;
        return true;
    }
    
    /* ------------------------------------------------------------------------ */
    /* DEVUELVE evento con mayor número de entradas a la venta del calendario. 
     * Precondición: al menos un evento. */
    public Event getTopEvent() { 
        int pmax = 0;
        int max = program[0].getTicketsOnSale();
        
        for(int i = 1; i < numEvents - 1; i++){
            int aux = program[i].getTicketsOnSale();
            if(aux > max){
                max = aux;
                pmax = i;
            }
        }
        return program[pmax]; 
    }

    /* ------------------------------------------------------------------------ */
    /* Devuelve un array con todos los eventos de tipo type del calendario, siendo 1 <= type <= 3. 
     * El tamaño del array devuelto ha de ser igual al número de eventos de tipo type, 
     * siendo 0 si no hay ningún evento de dicho tipo. */
    public Event[] filterByType(int type) {
        int n = numPerType[type];
        Event[]res = new Event[n];
         
        for (int i = 0, j = 0; i<numEvents ; i++){
        if(program[i].getType()==type     ){res[j]=program[i]; j++;}
        }
        return null;
    }   
}
```