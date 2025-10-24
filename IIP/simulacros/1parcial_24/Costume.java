import java.sql.Date;

public class Costume {

    public static int MONSTER = 1,
            GHOST = 2,
            WITCH = 3,
            VAMPIRE = 4;

    public String name, size;
    public int type;
    public double weight, price;
    public Date releaseDate;

    public Costume(String n, int t, String s, double w, double p, int d, int m, int y) {
        name = n;
        type = t;
        size = s;
        weight = w;
        price = p;
        // releaseDate = new Date(d, m ,y);
    }

    public Costume() {
        name = "Classic Ghost";
        type = GHOST;
        size = "M";
        weight = 0.5;
        price = 20.99;
        // releaseDate = new Date(31, 10, 2022);
    }

    public double getPrice() {
        return price;
    }
}
