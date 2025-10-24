import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Sticker st1 = new Sticker();
        System.out.println(st1.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre de una nueva defensa del Real Madrid C.F.: ");
        String nombre = sc.nextLine();
        System.out.println("Escribe el año de nacimiento: ");
        int y = sc.nextInt();
        System.out.println("Escribe el mes de nacimiento: ");
        int m = sc.nextInt();
        System.out.println("Escribe el dia de nacimiento: ");
        int d = sc.nextInt();

        // numero random del 160 al 175
        // 16: numeros desde el 160 al 175
        // 160, desde donde parte
        int h = (int) (Math.random() * 16) + 160;
        double w = Math.random() * (70 - 45) + 45;

        // d)
        Sticker st2 = new Sticker(nombre, "Real Madrid C.F.", Sticker.DEFENDER, h, w, d, m, y);
        System.out.println(st2.toString());

        // e)
        System.out.println("¿Su imc tiene valores normales?" + st2.isIMCNormal());
        System.out.println("¿Es más joven que Olga?" + st2.isYounger(st1));
    }
}