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

    public Costume(String name, int type, String size, double weight, double price, int day, int month, int year) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.price = price;
        // this.releaseDate = new Date(day, month, year);
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

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public boolean isLightWeight() {
        return weight > 0.1 && weight < 1.0;
    }

    /* ----------------------------------------------------------- */

    // public boolean isRealeasedBefore(Costume other) {
    // return this.releaseDate.compareTo(other.releaseDate) < 0;
    // }

    /* ----------------------------------------------------------- */

    // Metodo equals, que sobrescribe el de Object y
    // comprueba si un Costume (this) es igual a otro, en concreto,
    // si ambos disfraces tienen el mismo nombre y el mismo tipo

    public boolean equals(Object o) {
        return o instanceof Costume
                && this.name.equals(((Costume) o).name)
                && this.type == (((Costume) o).type);
    }

    /* ----------------------------------------------------------- */

    public String toString(String answer) {
        double priceRounded = Math.round(price);
        return answer = this.name + ". " + "Release date: "
                + releaseDate + ". Price: " + priceRounded;
    }
}