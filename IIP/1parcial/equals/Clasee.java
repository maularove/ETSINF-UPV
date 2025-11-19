package IIP.equals;

public class Clasee {

    private String name;
    private String team;
    private String role;

    public Clasee(String n, String t, String r) {
        name = n;
        team = t;
        role = r;
    }

    // sobreescribir equals para comparar el contenido
    @Override
    public boolean equals(Object o) {
        return o instanceof Clasee
                && this.name.equals(((Clasee) o).name)
                && this.team == (((Clasee) o).team)
                && this.role == (((Clasee) o).role);
    }
}