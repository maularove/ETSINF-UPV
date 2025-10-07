public class stringg {
    public static void main(String[] args) {

        // inputs
        String name = "string";
        String name2 = " es una clase";
        String espacios = " string ";
        String frase = "estudiando la clase string";

        // RESULTADOS:
        // devuelve numero de caracteres
        System.out.println(name.length());

        // devuelve sin espacios antes y despues del string
        System.out.println(espacios.trim());

        // devuelve posición de caracter indicada (t)
        System.out.println(name.charAt(1));

        // extrae parte del texto
        System.out.println(frase.substring(0, 10));

        // convierte en mayusculas
        System.out.println(name.toUpperCase());

        // convierte en minusculas
        System.out.println(name.toLowerCase());

        // devuelve posicion de la primera coincidencia
        System.out.println(frase.indexOf("a"));

        // devuelve posicion de la ultima coincidencia
        System.out.println(frase.lastIndexOf("a"));

        // Comprueba si empieza con la cadena indicada
        System.out.println(frase.startsWith("es"));

        // Comprueba si termina con la cadena indicada
        System.out.println(frase.endsWith("ing"));

        // une dos cadenas
        System.out.println(name.concat(name2));

        // comprueba si incluye la cadena indicada
        System.out.println(frase.contains(name));
    }
}
