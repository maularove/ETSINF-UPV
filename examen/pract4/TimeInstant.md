```java
package pract4;

/**
 * Clase TimeInstant.
 */
public class TimeInstant {
    
    // ATRIBUTOS:
    private int hours;
    private int minutes;

    // CONSTRUCTORES:
    public TimeInstant(int iniHours, int iniMinutes) {
        hours = iniHours;
        minutes = iniMinutes;
    }

    public TimeInstant() {
        long tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        hours = tMinCurrent / 60;
        minutes = tMinCurrent % 60;
    }

    // GETTERS Y SETTERS:
    /** GET HOURS */
    public int getHours() {
        return hours;
    }

    /* -------------------------------------------------------------------------------- */

    /** GET MINUTES */
    public int getMinutes() {
        return minutes;
    }

    /* -------------------------------------------------------------------------------- */

    /** SET HOURS */
    public void setHours(int h) {
        hours = h;
    }

    /* -------------------------------------------------------------------------------- */

    /** SET MINUTES */
    public void setMinutes(int m) {
        minutes = m;
    }

    /* -------------------------------------------------------------------------------- */

    // FORMATO SOUT
    public String toString() {
        String hh = "0" + hours;
        hh = hh.substring(hh.length() - 2);
        String mm = "0" + minutes;
        String hUser = hh + ":" + mm;
        return hUser;
    }

    /* -------------------------------------------------------------------------------- */

    // EQUALS COMPARACION
    public boolean equals(Object o) {
        return o instanceof TimeInstant
                && this.hours == ((TimeInstant) o).hours
                && this.minutes == ((TimeInstant) o).minutes;
    }

    /* -------------------------------------------------------------------------------- */

    /* TODO EN MINUTOS */
    public int toMinutes() {
        return hours * 60 + minutes;
    }

    /* COMPARA SI PRIMERO ES MENOR QUE SEGUNDO */
    public int compareTo(TimeInstant tInstant) {
        return this.toMinutes() - tInstant.toMinutes();
    }
}
```