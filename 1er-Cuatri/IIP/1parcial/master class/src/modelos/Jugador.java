package modelos;

public class Jugador {

    public String name;
    public String team;

    public Jugador(String name, String team) {
        this.name = name;
        this.team = team;
        contador++;
    }
}
