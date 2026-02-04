import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Costume costume1 = new Costume();
        System.out.println("Standard costume: " + costume1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe nombre de nuevo disfraz: ");
        String name = sc.nextLine();
        System.out.println("Escribe el año del lanzamiento: ");
        int year = sc.nextInt();
        System.out.println("Escribe el mes del lanzamiento: ");
        int month = sc.nextInt();
        System.out.println("Escribe el dia del lanzamiento: ");
        int day = sc.nextInt();

        double newPrice = 5 + Math.random() * 30.9;
        double newWeight = 0.5 + Math.random() * 2.4;

        Costume costume2 = new Costume(name, Costume.VAMPIRE, "M", newWeight, newPrice, day, month, year);
        System.out.println("New Costume: " + costume2);

        System.out.println("Is costume2 light?" + costume2.isLightWeight());

        // System.out.println("Is costume2 released before costume1" +
        // costume2.isReleasedBefore());
        sc.close();
    }
}