```java

package pract6;

import graph2D.Graph2D; 
import java.awt.Color;  
import java.util.Locale;

public class TestIIPMath {
    
    private TestIIPMath() { }

    public static void table() {      
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("  x           Math.sin(x)             IIPMath.sin(x)             |dif|");
        System.out.println("-----------------------------------------------------------------------------");
        
        double xMin = 0.0;
        double xMax = 20.0;
        double delta = 1.0;
        for (double x = xMin; x <= xMax; x = x + delta){
            double yMath = Math.sin(x);
            double y = IIPMath.sin(x);
            double dif = Math.abs(yMath - y);
            System.out.printf(Locale.US,"%4.1f %23.15f %23.15f %23.15f\n", x,yMath, y, dif);
        }
    }
    
    /* Obtiene el gráfico de la función IIPMath.sin(x) en el intervalo [-20, 20]. */
    public static void graph() {

        // Definir intervalo de valores para x e y
        double xMin = -20.0;
        double xMax = 20.0;
        double yMin = -2.0;
        double yMax = 2.0;
        
        // Crear el espacio de dibujo con las dimensiones deseadas
        Graph2D gd = new Graph2D(xMin, xMax, yMin, yMax, 800, 250);
        gd.setTitle("IIPMath");        
        // Calcular el incremento en cada paso de x (delta)
        double delta = (xMax - xMin) / Graph2D.INI_WIDTH; //Ini_width amplitud del grafico
        
        
        for(double x = xMin; x <= xMax; x = x + delta) {
             double y = IIPMath.sin(x);
             gd.drawPoint(x, y, Color.BLUE, 2);
            // Recorrer cada punto en x, calcular f(x) y dibujar (x, f(x))
        }
    }
}
```