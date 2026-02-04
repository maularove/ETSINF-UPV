package modelos;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    // metodo propio
    public void ladrar() {
        System.out.println(nombre + " (" + raza + ") está ladrando");
    }

    // sobreescritura del método
    @Override
    public void comer() {
        System.out.println(nombre + " come su croqueta favorita");
    }

    // consultor
    public String getRaza() {
        return raza;
    }
}
