# ✅ TEMA 4. Métodos en Java : Definición, Tipos y Uso 
## 1. 🖥️ ¿Qué es un método?
Un método es un bloque de código que realiza una acción. Sirve para reutilizar, organizar y estructurar el programa.

Ejemplo simple:
```java
public void saludar() {
    System.out.println("Hola");
}
```

## 2. Tipos de Métodos
### 🔹2.1 Métodos Estáticos (de clase)
No requieren un objeto, se llaman usando el nombre de la clase.

```java
public class Utilidades {
    public static void mostrar() {
        System.out.println("Soy estático");
    }
}

// Llamada directa
Utilidades.mostrar();
```

<br>

Uno de estos métodos estáticos es:
<br>

`main`:
<br>
Punto de entrada de un programa

```java
public static void main(String[] args) { }
```

### 🔹2.2 Métodos Dinámicos (de instancia)
Se usan sobre un objeto concreto. Necesitan crear una instancia de la clase

```java
public class Persona {
    public void hablar() {
        System.out.println("Hablo desde un objeto");
    }
}

// creas objeto
Persona p = new Persona();

p.hablar(); // Llamada dinámica
```

<br>

Uno de estos métodos dinámicos es:
<br>

`constructores`:
<br>
Método especial que crea objetos

```java
public class Punto {
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
```
<br>

Otro método sería:
<br>

`De instancia`:
<br>
Se invoca sobre una instancia específica de una clase y opera sobre los datos propios de ese objeto.

```java
// void: no devuelve ningun valor, solo ejecuta
public class Ejemplo {
    public void saludar() {
        System.out.println("Hola, soy un método void");
    }
}

// double
public class Operaciones {
    public double sumar(double a, double b) {
        return a + b;
    }
}
```
<br>

---

## 3. Estructura básica de un método
```java
[modificador] [static] tipoRetorno nombre(parámetros) {
    // cuerpo
    return valor; // si no es void
}
```

Ejemplo:
```java
public int sumar(int a, int b) {
    return a + b;
}
```
<br>

---

## 4. Uso de `this`
Es una referencia al objeto actual.
<br>

Se usa para diferenciar atributos y parámetros

```java
public class Coche {
    private String marca;

    public Coche(String marca) {
        this.marca = marca; // sin this causaría ambigüedad
    }
}
```
<br>

También sirve para llamar a otro conductor:
```java
public Coche() {
    this("Sin marca");
}
```

<br>

---

```java
public class EjemploIntegerBoolean {
    public static void main(String[] args) {
        Integer x = 15;
        Integer y = 10;

        boolean resultado1 = x.compareTo(y) > 0;  // ¿x mayor que y?
        boolean resultado2 = x.compareTo(y) < 0;  // ¿x menor que y?
        boolean resultado3 = x.compareTo(15) == 0; // ¿son iguales?

        System.out.println(resultado1); // true
        System.out.println(resultado2); // false
        System.out.println(resultado3); // true
    }
}
```