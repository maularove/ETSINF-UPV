```java
package pract4;
import java.util.Scanner;
/**
 *  Clase Test4.
 *  Clase de prueba de TimeInstat.
 *  @author IIP - ETSINF - UPV  
 *  @version Curso 2025-26
 */
public class Test4 {
    
    /** NO OBJETOS DE ESTA CLASE */
    private Test4() { }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = sc.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = sc.nextInt();
        
        /* OBJETO TIME INSTANT CON VALORES DE CONSOLA */
        TimeInstant userHour = new TimeInstant(h,m);
        TimeInstant realHour = new TimeInstant();
        
        System.out.println("Hora introducida: " + userHour);
        System.out.println("Hora actual: "+ realHour + "(temps UTC)");
       
        /* -------------------------------------------------------------------------------- */

        // DIFERENCIA DE MINUTOS ENTRE LA HORA DEL USUARIO Y LA REAL
        int diferenciaMinutos = userHour.toMinutes() - realHour.toMinutes();
        // VALOR ABSOLUTO DE LA DIFERENCIA ENTRE MINUTOS
        int difEnPositivo = Math.abs(diferenciaMinutos);

        /* -------------------------------------------------------------------------------- */

        System.out.println("Diferencia en minuts enntre ambdues hores: " + difEnPositivo + " (" + difEnPositivo/ 60 + "hor. i" + difEnPositivo % 60 + " min.)");
        System.out.println("Es anterior la hora introducida a la hora actual? " + (userHour.compareTo(realHour) < 0));
    }    
}   
```