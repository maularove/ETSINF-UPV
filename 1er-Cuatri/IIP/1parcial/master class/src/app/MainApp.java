package app;

import modelos.Animal;
import modelos.Perro;
import utilss.Utilidades;

public class MainApp {

    // Método principal (main)
    public static void main(String[] args) {

        Utilidades.mostrarTitulo("🐾 DEMO DE PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA");

        // Variables locales (Tema 3)
        int numeroPerros = 0;
        boolean activo = true;

        // Creación de objetos (instancias)
        Perro p1 = new Perro("Toby", 3, "Labrador");
        Perro p2 = new Perro("Luna", 2, "Poodle");

        Animal danigamer = new Animal("dani", 1);

        numeroPerros = Perro.getContador();

        // Uso de métodos dinámicos
        p1.ladrar();
        p2.comer();

        danigamer.comer();
        danigamer.follar();
        danigamer.setEdad(14);

        // Uso de métodos modificadores y consultores
        p1.setEdad(4);
        System.out.println(p1.getEdad() + " años (nueva edad de Toby)");

        // Llamada a método estático
        Utilidades.mostrarTitulo("🔧 USO DE MÉTODOS ESTÁTICOS");
        int suma = Utilidades.sumar(7, 5);
        System.out.println("La suma es: " + suma);

        Utilidades.intercambiarValores();

        // Operadores lógicos y condicionales
        if (numeroPerros > 1 && activo) {
            System.out.println("Hay más de un perro registrado 🐕‍🦺🐕");
        }

        // Demostración de desbordamiento (Tema 3)
        int max = Integer.MAX_VALUE;
        System.out.println("\nValor máximo de int: " + max);
        System.out.println("Desbordamiento: " + (max + 1));

        // Fin del programa
        Utilidades.mostrarTitulo("FIN DEL PROGRAMA");
        System.out.println("Total de animales creados: " + numeroPerros);
    }
}
