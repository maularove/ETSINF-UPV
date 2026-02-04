```java

package pract5;
import java.util.Scanner;

public class Test5 {
    /* NO OBJECTS INITIALIZED */
    private Test5() { }
    
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.print("Horas? ");
        int hours = kbd.nextInt();
        System.out.print("Minutos? ");
        int minutes = kbd.nextInt();
        System.out.print("Día? ");
        int day = kbd.nextInt();
        System.out.print("Mes? ");
        int month = kbd.nextInt();
        System.out.print("Anyo? ");
        int year = kbd.nextInt();
        
        /* ------------------------------------------------------------------------ */        
        /* SI DATOS NO CORRECTOS, MOSTRAR MENSAJE */
        if (DateTime.isCorrect(hours, minutes, day, month, year) == false) {
            System.out.println("Los datos son incorrectos");
        }
        else {
            /* Crear un DateTime dT con estos datos. */
            DateTime dT = new DateTime(hours, minutes, day, month, year);

            /* Crear un DateTime now con la fecha y el instante UTC actuales. */
            DateTime now = new DateTime(14, 11, 2025);
            int comp = dT.compareTo(now);
            if(comp < 0) {
                System.out.println("\n" + dT + " es anterior a " + now);
            }
            else if (comp > 0) {
                System.out.println("\n" + dT + "es posterior a " + now);
            }
            else {
                System.out.println("\n" + dT + "es igual a " + now);
            }
        }
    }
}
```