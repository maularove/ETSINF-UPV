package IIP.equals;

public class Clasee {

    private String name;
    private String team;
    private String role;

    public Clasee(String n, String team, String role) {
        this.name = n;
        this.team = team;
        this.role = role;
    }

    // sobreescribir equals para comparar el contenido
    @Override
    public boolean equals(Object o) {
        return o instanceof Clasee
                && name.equals(((Clasee) o).name)
                && team.equals(((Clasee) o).team)
                && role.equals(((Clasee) o).role);
    }
}