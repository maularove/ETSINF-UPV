```java

package pract5;
import pract4.TimeInstant;

public class DateTime { 
    
    private TimeInstant instant;
    private int day;  
    private int month;
    private int year;
       
    /* constructor */
    public DateTime(int hour, int min, int d, int m, int y) {
        instant = new TimeInstant(hour, min);
        day = d;
        month = m;
        year = y;
    }
    
    /* constructor 2 | Time Instant default*/
    public DateTime(int d, int m, int y) {
        instant = new TimeInstant();
        day = d;
        month = m;
        year = y;
    }
    
   /* ------------------------------------------------------------------------ */
   /* GETTERS Y SETTERS */
    public TimeInstant getInstant() { return instant; }    
    public int getDay() { return day; }   
    public int getMonth() { return month; }   
    public int getYear() { return year; }

    public void setInstant(int h, int m) { 
        instant.setHours(h);
        instant.setMinutes(m);
    }

    public void setDay(int d) { day = d; } 
    public void setMonth(int m) { month = m; }   
    public void setYear(int y) { year = y; }  

    /* ------------------------------------------------------------------------ */
    /* MÉTODO TO STRING */
    public String toString() {
        // Versión 1:
        /*
            * String dd = "0" + day; //aquí se está nombrando la variable dd.
            * dd = dd.substring(dd.length() - 2); //si el largo de la cifra es <2, entonces se pone el substring.
            * String mm = "0" + month;
            * mm = mm.substring(mm.length() - 2);
            * String yyyy = "000" + year;
            * yyyy = yyyy.substring(yyyy.length() - 4);
        */

        // Versión 2:
        /*
            * if(year < 1000) { yyyy = "0" + yyyy; }
            * if(year < 100) { yyyy = "00" + yyyy;}
            * 
            * String dd = day / 10 + "" + day % 10;
            * String mm = month / 10 + "" + month % 10;
            * String yyyy = year / 1000 + "" 
                        * + (year % 1000) / 100 + ""
                        * + ((year % 1000) % 100) / 10 + ""
                        * + ((year % 1000) % 100) % 10;
        */

        // Versión 3:   
        String dd = "" + day;
        if(day < 10) { dd = "0" + dd;}
        String mm = "" + month;
        if(month < 10) { mm = "0" + mm;}
        String yyyy = "" + year;
        if(year < 10) { yyyy = "000" + yyyy;}
        else if (year < 100) { yyyy = "00" + yyyy;}
        else if(year < 1000) { yyyy = "0" + yyyy; }
        return instant + " " + dd + "/" + mm + "/" + yyyy;        
    } 
   
    public boolean equals(Object o) {
        return o instanceof DateTime
            && this.instant.equals(((DateTime)o).instant)
            && this.day == ((DateTime)o).day
            && this.month == ((DateTime)o).month
            && this.year == ((DateTime)o).year;        
    }
    
    /* ------------------------------------------------------------------------ */
    /* Compara cronológicamente el DateTime en curso con un DateTime dado. */
    public int compareTo(DateTime d) {
        // Versión 1:
        // int res = 1;
        // if (year < d.year) { res = -1; }
        // else if (year == d.year) {
            // if (month < d.month) { res = -1; }
            // else if (month == d.month) {
                // if (day < d.day) { res = -1; }
                // else if (day == d.day) {
                    // res = instant.compareTo(d.instant);
                // }
            // }
        // }
        // return res;
        
        // Versión 2:
        int res = this.year - d.year;
        if(res == 0) {
            res = this.month - d.month;
            if(res == 0){
                res = this.day - d.day;
                if(res == 0){
                    res = this.instant.compareTo(d.instant);
                    
                }
            }       
        }    
        return res;
    }

    /* ------------------------------------------------------------------------ */   
    /* COMPROBAR SI AÑO ES BISIESTO */
    public static boolean isLeap(int year) { 
        // Anyo bisiesto es el divisible entre 4, a menos que sea 
        // anyo secular -último de cada siglo, acabado en "00"-,  
        // en cuyo caso también ha de ser divisible entre 400.
        // Wikipedia, consulta 06/07/2022
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
    }    
   
    /* ------------------------------------------------------------------------ */
    /* Devuelve la duración en días de un mes de un anyo dado. */
    public static int lengthOfMonth(int month, int year) {
        int numberOfDays = 31;
        if (month == 2) { 
            numberOfDays = 28;
            if (isLeap(year)) { numberOfDays = 29; }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) { numberOfDays = 30; }
        return numberOfDays;
    }
    
    /* ------------------------------------------------------------------------ */
    /* 
     * Comprueba si los datos de horas, minutos, día, mes y año dados 
     * corresponden a un instante y una fecha correctos.
     */
    public static boolean isCorrect(int hours, int min, int day, int month, int year) {
        boolean correct = false;
        if (0 <= hours && hours <= 23 && 0 <= min && min <= 59) {
            if (year > 0 && (month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
                int numberOfDays = lengthOfMonth(month, year);
                if (day <= numberOfDays) { correct = true; }
            }
        }
        return correct;
    }
}
```