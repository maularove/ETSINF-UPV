import java.util.Scanner;

public class math {
    public static void main(String[] args) {

        // Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Introducir datos
        System.out.println("Ingrese un numero: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double b = sc.nextDouble();

        // potencia
        double potencia = Math.pow(a, b);

        // raíz cuadrada
        double raiz = Math.sqrt(a);

        // máximo y mínimo
        double maximo = Math.max(a, b);
        double minimo = Math.min(a, b);
        double redondeo = Math.round(1.6);

        // redondea hacia abajo
        double redondeoBajo = Math.floor(1.6);

        // redondea hacia abajo
        double redondeoAlto = Math.ceil(1.2);

        // numero random
        double random = Math.random();

        // valor absoluto
        double absoluto = Math.abs(-5);

        // número pi
        double pi = Math.PI;

        // numero de Euler
        double e = Math.E;

        // mostrar resultados
        System.out.println("La potencia es: " + potencia);
        System.out.println("La raíz cuadrada es: " + raiz);
        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El numero mas cercano es: " + redondeo);
        System.out.println("El numero redondeado hacia abajo es: " + redondeoBajo);
        System.out.println("El numero redondeado hacia arriba es: " + redondeoAlto);
        System.out.println("El numero random es: " + random);
        System.out.println("El valor absoluto es: " + absoluto);
        System.out.println("El numero pi es: " + pi);
        System.out.println("El numero euler es: " + e);
        sc.close();
    }
}