public class CostumeStore {

    /* ------------------------------------------------------------ */
    // apartado a) (propiedades)
    public static final String[] SIZES = { "S", "M", "L" };
    private String storeName;
    private int available;

    // atributo de instancia de tipo array Costume llamado stock
    private Costume[] stock;
    private double sales;

    /* ------------------------------------------------------------ */
    // apartado b) (constructor)
    public CostumeStore(String storeName, int maxCostumes) {
        this.storeName = storeName;
        stock = new Costume[maxCostumes];
        available = 0;
        sales = 0;
    }

    /* ------------------------------------------------------------ */
    // apartado c) (metodo)
    // metodo perfil PUBLIC BOOLEAN
    // añadir disfraz c dado a la lista de disfraces del almacen (array stock)
    // si no cabe, return falsd
    // si cabe, se añade detrás del último
    // actualiza atributos que corresponda y devuelve true
    public boolean addStock(Costume c) {
        if (available == stock.length) {
            return false;
        } else {
            stock[available] = c;
            available++;
            return true;
        }
    }

    /* ------------------------------------------------------------ */
    // apartado d) (metodo)
    // metodo perfil PUBLIC INT searchPos(Costume c)
    // uso método equals clase Costume
    // devuelve disfraz del último disfraz igual que c en el array stock
    // devuelve -1 si todos los disfraces son diferentes de c
    public int searchPos(Costume c) {
        int pos = available - 1;
        while (pos >= 0 && !stock[pos].equals(c)) {
            pos--;
        }
        return pos;
    }

    /* ------------------------------------------------------------ */
    // apartado e) (metodo)
    // metodo perfil PUBLIC DOUBLE sellCostume(Costume c)
    // SI encuentra disfraz c (searchPos) ->
    // lo elimina desplazando posi a la izquierda todos los disfraces en
    // posiciones posteriores del array stock
    // actualiza los atributos que corresponda y devuelve el total de las ventas
    // si no lo encuentra devuelve -1
    public double sellCostume(Costume c) {
        double res = -1;
        int pos = searchPos(c);
        if (pos != -1) {
            for (int i = pos; i < available - 1; i++) {
                stock[i] = stock[i + 1];
            }
            stock[available - 1] = null;
            available--;
            sales = sales + c.getPrice();
            res = sales;
        }
        return res;
    }

    /* ------------------------------------------------------------ */
    // apartado f) (metodo)
    // metodo perfil PUBLIC INT[] countSizes()
    // devuelve un array int tamaño 3
    // cada componente indica nº disfraces de cada talla disponibles en almacen
    // 0=S 1=M 2=L

    public int[] countSizes() {
        int[] result = new int[SIZES.length];
    }
}
