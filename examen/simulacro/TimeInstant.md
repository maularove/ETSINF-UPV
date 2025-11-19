```java
package examExample;

/**
 * Clase TimeInstant: permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Así, esta clase representa 
 * el momento que define un instante de tiempo, en este caso, las horas y 
 * los minutos de un día cualquiera.
 */
public class TimeInstant {
    
    private int hours;
    private int minutes;
    
    /*  CONSTRUCTOR */
    public TimeInstant(int iniHours, int iniMinutes) {
        this.hours = iniHours;
        this.minutes = iniMinutes;
    }
    
    /* -------------------------------------------------------------------------------- */
    /* FORMATO PARA LA HORA "hh:mm". */
    public String toString() {
        String hh = "0" + hours;
        hh = hh.substring(hh.length() - 2);

        String mm = "0" + minutes;
        mm = mm.substring(mm.length() - 2);
        
        return hh + ":" + mm;
    }
    
    /* -------------------------------------------------------------------------------- */
    /* GETTER: DEVUELVE LA HORA EN MINUTOS */
    public int toMinutes() {
        return hours * 60 + minutes;
    }
}
```