```java
package pract2;
 
public class Circle {

    private double radius; 
    private String color;
    private int centerX, centerY;   
    
    /* CIRCULO POR DEFECTO */
    public Circle() {
        radius = 50;
        color = "black"; 
        centerX = 100;  
        centerY = 100; 
    }

    /* CONSTRUCTOR */
    public Circle(double r, String col, int cx, int cy) {
        radius = r;  
        color = col; 
        centerX = cx; 
        centerY = cy;         
    }
 
    /* -------------------------------------------------------------------------------- */

    /* GETTERS */
    public double getRadius() {
        return radius; 
    }    

    public String getColor() { 
        return color; 
    }  

    public int getCenterX() { 
        return centerX; 
    }  

    public int getCenterY() { 
        return centerY; 
    }

    /* -------------------------------------------------------------------------------- */

    /* SETTERS */
    public void setRadius(double nuevoRadio) { 
        radius = nuevoRadio; 
    }   

    public void setColor(String nuevoColor) { 
        color = nuevoColor; 
    }   
 
    public void setCenter(int cx, int cy) { 
        centerX = cx; centerY = cy; 
    }
    
    /* -------------------------------------------------------------------------------- */
    /* METODOS */
    public double area() { 
        return Math.PI * radius * radius; 
    }
    
    public double perimeter() { 
        return 2 * Math.PI * radius; 
    }
    
    /* -------------------------------------------------------------------------------- */
    /* COMO SE IMPRIME */
    public String toString() { 
        String res = "Círculo de radio " + radius;
        res += ", color " + color;
        res += " y centro (" + centerX + "," + centerY + ")";
        return res; 
    }
}

```