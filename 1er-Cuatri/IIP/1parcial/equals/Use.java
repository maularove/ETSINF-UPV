package IIP.equals;

public class Use {

    public static void main(String[] args) {

        Clasee eq1 = new Clasee("Messi", "Inter Miami", "Delantero");
        Clasee eq2 = new Clasee("Messi", "Inter Miami", "Delantero");
        Clasee eq3 = new Clasee("Ronaldo", "AL Nassr", "Delantero");

        Clasee dani = new Clasee("Daniel", "Gamer", "Chupapo");
        Clasee guijarro = new Clasee("guijarro", "FFI", "fortnite lababayi");

        // System.out.println(eq1.equals(dani));
        // System.out.println(eq1.equals(eq3));

        System.out.println(dani.equals(guijarro));
    }
}