# ✅ TEMA 1. Recursión
## 1. 🖥️ ¿Que es la recursión?

Un proceso es **recursivo** cuando se define en función de sí mismo.
<br>

En programación:

`función recursiva` =>
<br>
es aquella que se llama a sí misma.

`algoritmo recursivo` => 
<br>
resuelve un problema reduciéndolo a versiones más pequeñas del mismo problema.


### Idea Fundamental
Para que exista recursión debe existir siempre:

1. `Caso base:` 
<br>
El problema es trivial y se puede resolver directamente.

2. `Caso general (recusivo):` 
<br>
El problema se reduce a un o más pequeño. 

<br>

Si no hay caso base ➡️ **recursión infinita** ➡️ **StackOverflowError**

<br>

💡 **Ejemplo básico: Factorial**  

Definición matemática:

```math
n! =
\begin{cases}
1 & \text{si } n = 0 \\
n \cdot (n-1)! & \text{si } n > 0
\end{cases}
```

Implementación en Java:
```java
/** PRECONDICIÓN: n >= 0 */
public static int factorial(int n) {
    if (n == 0) {
        return 1;  // Caso base
    } else {
        return n * factorial(n - 1);  // Caso general
    }
}
```

<br>

### ¿Qué está pasando realmente?
Llamada: `factorial(3)`

```scss
factorial(3)
= 3 * factorial(2)
= 3 * (2 * factorial(1))
= 3 * (2 * (1 * factorial(0)))
= 3 * 2 * 1 * 1
= 6
```

<br>

---

## 2. Cómo diseñar un método recursivo
Paso 1: ***Definir el problema***
<br>
- cabecera del método
- Precondiciones
- Qué debe devolver

^^^^^^^^^^^^^^^^^^^^^^

Paso 2: ***Separar casos***
<br>
- caso base
- caso general
<br>

Deben ser:
- Complementarios
- Exhaustivos 

^^^^^^^^^^^^^^^^^^^^^^

Paso 3: ***Garantizar terminación***
<br>

Cada llamada recursiva debe acercarse al caso base.

^^^^^^^^^^^^^^^^^^^^^^

Paso 4: ***Validar correción***
<br>

- ¿Siempre se cumple la precondición?
- ¿El subproblema es más pequeño? 
- ¿Se llega al caso base?

<br>

---

## 3. Tipos de Recursión
### 3.1 Recursión lineal
Solo hay una llamada recursiva por ejecución.

Puede ser:

🔹 Lineal no final
<br>
El resultado de la llamada recursiva se usa para construir el resultado.


💡 **Ejemplo básico: Factorial**  

```java
return n * factorial(n - 1);
```

Se multiplica después ➡️ no es final.

<br>

🔹 Lineal final (tail recursión)
<br>
El resultado de la llamada recursiva es directamente el resultado.


💡 **Ejemplo básico: Factorial**  

```java
public static int residu(int a, int b) {
    if (a < b) {
        return a;
    } else {
        return residu(a - b, b);
    }
}
```

Aquí no se hace nada después de la llamada.

### 3.1 Recursión múltiple
Hay más de una llamada recursiva.


💡 **Ejemplo: Fibonacci**  

```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```

Se generan árboles de llamadas.

⚠ `Problema:` Muchísimas llamadas repetidas → ineficiente.

<br>

---

## 4. Recursión y pila de llamadas

Cada llamada recursiva crea:
- Un registro de **activación**
- Se guarda en la **pila (stack)**

Ejemplo con `factorial(3)`:

```scss
main
 └─ factorial(3)
     └─ factorial(2)
         └─ factorial(1)
             └─ factorial(0)
```

Cuando termina `factorial(0)`, se empiezan a desapilar.

---

### ¿Por qué puede fallar ?
Si nunca se llega al caso base. 
- la pila crece sin límite
- se produce `StackOverflowError`.

<br>

### Comparación con versión iterativa
Versión iterativa:

```java
public static int factorialIter(int n) {
    int r = 1;
    for (int i = 1; i <= n; i++) {
        r *= i;
    }
    return r;
}
```

`Iterativa` => memoria constante
<br>

`Recursiva` => memoria depende de n

<br>

---

## 5. Ejemplos importantes
### 5.1 Potencia n-ésima
Definición:

```math
a^n =
\begin{cases}
1 & \text{si } n = 0 \\
a \cdot a^{n-1} & \text{si } n > 0
\end{cases}
```

```java
public static double potencia(double a, int n) {
    if (n == 0) {
        return 1;
    } else {
        return potencia(a, n - 1) * a;
    }
}
```

<br>

### 5.2 Máximo Común Divisor (Euclides)
Versión eficiente:

```java
public static int euclides(int a, int b) {
    if (a % b == 0) {
        return b;
    } else {
        return euclides(b, a % b);
    }
}
```

Cada llamada reduce el problema drásticamente.

<br>

---

## 6. Recursión con Arrays

La idea clave:
<br>

Un array puede verse como:
```css
a[0] + subarray a[1..n-1]
```

o

```css
subarray a[0..n-2] + a[n-1]
```

<br>

### 6.1 Recorrido recursivo ascendente
Sumar elementos:
```java
public static int sumaRecAsc(int[] a, int pos) {
    if (pos == a.length) {
        return 0;
    } else {
        return a[pos] + sumaRecAsc(a, pos + 1);
    }
}
```

Llamada inicial:
```java
int suma = sumaRecAsc(a, 0);
```

<br>

### 6.2 Recorrido descendente
Sumar elementos:
```java
public static int sumaRecDesc(int[] a, int pos) {
    if (pos == -1) {
        return 0;
    } else {
        return a[pos] + sumaRecDesc(a, pos - 1);
    }
}
```

<br>

---

## 7. Búsqueda Recursiva
### 7.1 Búsqueda lineal

```java
public static int trobarRecAsc(int[] a, int pos) {
    if (pos == a.length) {
        return -1;
    } else if (a[pos] != 0) {
        return pos;
    } else {
        return trobarRecAsc(a, pos + 1);
    }
}
```

### 7.2 Búsqueda binaria (array ordenado)
Versión recursiva

```java
public static int cercaBinRec(int[] a, int x, int ini, int fi) {
    if (ini > fi) {
        return -1;
    } else {
        int meitat = (ini + fi) / 2;

        if (a[meitat] == x) {
            return meitat;
        } else if (a[meitat] > x) {
            return cercaBinRec(a, x, ini, meitat - 1);
        } else {
            return cercaBinRec(a, x, meitat + 1, fi);
        }
    }
}
```

Cada llamada divide el problema entre 2 →
<br>
Complejidad: **O(log n)**

<br>

---

## 8. Recursión con Strings
Las Strings se pueden tratar como:
- `s.charAt(pos)`
- `s.substring(...)`

### 7.2 Invertir una cadena

```java
public static String inversa(String s) {
    if (s.length() == 0) {
        return "";
    } else {
        return s.charAt(s.length() - 1) 
               + inversa(s.substring(0, s.length() - 1));
    }
}
```

### Palíndromo

```java
public static boolean esPalindromo(String s, int i, int j) {
    if (i >= j) {
        return true;
    } else if (s.charAt(i) != s.charAt(j)) {
        return false;
    } else {
        return esPalindromo(s, i + 1, j - 1);
    }
}
```

<br>

---

## 9. Recursión vs Iteración

| Aspecto | Recursión | Iteración |
|----------|------------|------------|
| Estructura principal | Llamadas a sí misma | Bucles (`for`, `while`) |
| Mecanismo de control | Condicional + caso base | Condición del bucle |
| Terminación | Se alcanza el caso base | La condición del bucle deja de cumplirse |
| Uso de memoria | Usa la pila de llamadas (stack) | Memoria constante (normalmente) |
| Riesgo de error | Puede provocar `StackOve

---

### Idea importante
Recursión e iteración son equivalentes en poder computacional
<br>

Pero:
- A veces la recursión es más clara
- A veces la iteración es más eficiente

Son alternativas y complementarias