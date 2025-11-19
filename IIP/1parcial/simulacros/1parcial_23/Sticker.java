import java.sql.Date;
import java.time.LocalDate;

public class Sticker {

    // a)
    public static final int GOALKEEPER = 1,
            DEFENDER = 2,
            MIDFIELDER = 3,
            FORWARD = 4;

    // b)
    private String name, team;
    private int role;
    private double height;
    private double weight;
    private Date birthDate;

    // c) Constructor
    public Sticker(String name, String team, int role, double height, double weight, int d, int m, int y) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.height = height;
        this.weight = weight;
        this.birthDate = Date.valueOf(LocalDate.of(y, m, d));
    }

    // d) Default constructor
    public Sticker() {
        name = "Olga Carmona";
        team = "Real Madrid C.F.";
        role = DEFENDER;
        height = 159;
        weight = 51.5;
        birthDate = Date.valueOf(LocalDate.of(2000, 1, 1));
    }

    // e) método equals que sobreescribe el de Object y comprueba si un Sticker es
    // iguala otro

    // instanceof: comprobar si un objeto es instancia de una clase
    public boolean equals(Object o) {
        return o instanceof Sticker
                && name.equals(((Sticker) o).name)
                && team.equals(((Sticker) o).team)
                && role == ((Sticker) o).role;
    }

    // f) boolean
    public boolean isIMCNormal() {
        double imc = weight / Math.pow(height / 100, 2);
        return 18.5 <= imc && imc <= 24.9;
    }

    // g)
    // estoy comparando si birthDate es mayor que el birthDate de other
    public boolean isYounger(Sticker other) {
        return birthDate.compareTo(other.birthDate) > 0;
    }

    // h)
    // toString = mostrar en consola
    public String toString() {
        String res = name + " (" + team + "). ";
        res += "Birth date: " + birthDate.toString() + ". ";

        // ej. 68,456
        // multiplica por 10: 684,56
        // round: 685
        // divide por 10.0: vuelve a su unidad

        // compara fecha de nacimiento, si es mayor es más joven
        res += "Weight: " + Math.round(weight * 10) / 10.0 + " kg. ";
        res += "Height: " + height + " cm.";
        return res;
    }
}
