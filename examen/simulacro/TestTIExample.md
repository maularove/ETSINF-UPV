```java
package examExample;

import java.util.Scanner;
import assist.TimeInstant;
/**
 * Clase TestTIExample: clase programa que usa la clase TimeInstant 
 * del paquete assist, idéntica a tu clase TimeInstant con el metodo 
 * toMinutes() correcto.  
 * 
 * @author IIP
 * @version Curso 2025-26
 */
public class TestTIExample {
    
    /* NO OBJETOS DE ESTA CLASE */
    private TestTIExample() { }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = sc.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = sc.nextInt();
        
        /* -------------------------------------------------------------------------------- */

        /* TIME INSTANT CON LOS VALORES DE CONSOLA */
        TimeInstant ti = new TimeInstant(h,m);
        
        /* -------------------------------------------------------------------------------- */

        // b) Muestra por pantalla ti (en el formato "hh:mm") 
        System.out.println("La hora es: " + ti + ", lo cual son " + ti.toMinutes() + " minutos");
        //    y su equivalente en minutos
        /* COMPLETAR */      
    }
}
```