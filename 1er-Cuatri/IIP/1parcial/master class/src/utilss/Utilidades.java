package utilss;

public class Utilidades {

    // método estatico (no necesita objetos)
    public static void mostrarTitulo(String titulo) {
        System.out.println("\n=======================");
        System.out.println("  " + titulo);
        System.out.println("\n=======================");
    }

    public static void intercambiarValores() {
        int a = 5;
        int b = 10;
        int aux;

        aux = a;
        a = b;
        b = aux;

        System.out.println("Despus del cambio: a = " + a + ", b = " + b);
    }

    // Método estático con operador aritmético
    public static int sumar(int x, int y) {
        return x + y;
    }
}