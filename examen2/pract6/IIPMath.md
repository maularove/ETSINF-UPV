```java

package pract6;

public class IIPMath {

    /* NO OBJECTS INITIALIZED */
    private IIPMath() { }    
    
    /** Devuelve el seno del ángulo x, con un error máximo epsilon.
     *  Precondición: x en radianes, 0 < epsilon.
     */
    public static double sin(double x, double epsilon) {
        x = reducFirstCirc(x);
        int k = 0;           // índice del último término calculado
        double term = x;     // último término calculado     
        double sumTerm = x;  // suma de los términos calculados
        
        while(Math.abs(term) > epsilon){
            k++;
            term = -term * x * x / (2 * k * (2 * k + 1));
            sumTerm += term; 
        }
        return sumTerm;
    }
    
    /** Devuelve el seno del ángulo x, con un error máximo 1e-15.
     *  Precondición: x en radianes.
     */
    public static double sin(double x) {
        return sin(x, 1e-15);
    }
    
    /** Devuelve la reducción del ángulo x a la primera circunferencia.
     *  Precondición: x en radianes.
     */
    private static double reducFirstCirc(double x) {
        return x % (2 * Math.PI);
    }  
}
```