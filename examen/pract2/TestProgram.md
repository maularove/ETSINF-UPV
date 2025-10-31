```java
package pract2;

public class TestProgram {

    /* NO OBJETOS DE ESTA CLASE */
    private TestProgram() { }
    
    public static void main(String[] args) {
        
        /* INICIA PIZARRA */
        Blackboard miPizarra = new Blackboard("UNA VENTANA AL MUNDO", 500, 300);
                
        /* OBJETO CIRCULO */
        Circle c = new Circle(50, "yellow", 100, 100);        
        miPizarra.add(c);

        System.out.println("El perímetro del círculo es " + c.perimeter());
     
        /* -------------------------------------------------------------------------------- */
        /* OBJETO RECTANGULO */
        Rectangle r = new Rectangle(100, 10, "red", 50, 155);
        miPizarra.add(r);  
        
        /* -------------------------------------------------------------------------------- */
        /* OBJETO TRISOSCELES */
        TrIsosceles t = new TrIsosceles(30, 60, "black", 210, 60 );
        miPizarra.add(t);          
    }
}
```