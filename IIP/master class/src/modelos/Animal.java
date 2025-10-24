package modelos;

// Clase padre (superclase)
public class Animal {
    // Atributos (variables de instancia)
    public String nombre;
    public int edad;
    public static int contador = 0; // variable de clase

    // Constructor (método especial)
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contador++;
    }

    // Método dinámico (de instancia)
    public void comer() {
        System.out.println(nombre + " está comiendo 🐾");
    }

    public void follar() {
        System.out.println(nombre + "esta follando con la de mad");
    }

    // Método consultor (getter)
    public int getEdad() {
        return edad;
    }

    // Método modificador (setter)
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    // Método estático (de clase)
    public static int getContador() {
        return contador;
    }
}
