# 5. Estructura de control: Selección

## Condicional `if`
## 5.1. 🟦 ¿Qué es una instrucción `if`?
La instrucción `if` permite tomar decisiones en un programa.
<br>
Sirve para ejecutar unas instrucciones u otras dependiendo de si una condición booleana es verdadera o falsa.

<br>

En vida real:
>"Si llueve, llevo paraguas. Si no, salgo normal"

<br>
En Java:

```java
if(llueve) {
    llevarParaguas();
} else {
    salirNormal();
}
```

<br>

## 5.2. 🟦 Sintaxis básica de `if`
### `if` simple

```java
if(condiciones) {
    instrucciones
}
```

### Funcionamiento

1. Se **evalúa** la condición *(expresión booleana)*
2. Si es **true**, se ejecuta bloque `{}`
3. Si es **false**, se ignora el bloque.

### 🧪 Ejemplo

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
}
```

### `if` ... `else`
Sirve para decidir entre dos alternativas posibles.

```java
if (condicion) {
    instruccionesSiVerdadero;
} else {
    instruccionesSiFalso;
}
```

### 🧪 Ejemplo

```java
int x = 7, y = 3;
int max;

if (x > y) {
    max = x;
} else {
    max = y;
}

System.out.println("El máximo es: " + max);
```

## 5.3. 🟦 Condiciones (`boolean`): ¿qué puedo poner dentro del `if`?

### ✔️ Operadores relacionales

- `==` igual
- `!=` distinto 
- `<` menor 
- `<=` meno o igual 
- `>` mayor 
- `>=` mayor o igual 

### ✔️ Operadores lógicos

- `&&` (AND, y) 
- **||** (OR, o) 
- `!` (NOT) 

### ✔️ Comparación de caracteres y String

```java
if (genero == 'F') { }        // char
if (nombre.equals("Juan")) { } // String
```

<br>

## 5.4. 🟦 Buenas prácticas en `if`
✔️ Siempre usa llaves {}, aunque sea una sola línea (Checkstyle lo exige).
<br>

✔️ Evita condiciones confusas o demasiado largas.
<br>

✔️ En condiciones múltiples, pon el caso más probable arriba para mejorar eficiencia.
<br>

✔️ Utiliza variables auxiliares si ayuda a la lectura.

<br>

## 5.5. 🟦 `if` anidados (nested if)
Un if dentro de otro. Muy útil en análisis por casos.

```java
if (x == 0) {
    if (y == 0) {
        System.out.println("Origen");
    } else {
        System.out.println("Eje Y");
    }
} else {
    if (y == 0) {
        System.out.println("Eje X");
    } else {
        System.out.println("Cuadrante");
    }
}
```

## 5.6. 🟦 `if` múltiple (`if` - `else if` - `else`)
Útil cuando hay más de dos opciones excluyentes.

```java
if (condicion1) {
    instrucciones1;
} else if (condicion2) {
    instrucciones2;
} else if (condicion3) {
    instrucciones3;
} else {
    instruccionesPorDefecto;
}
```
## 5.7. 🟦 Ejemplos con `if`:
### 🧪 (convertir número a nota en letra)

```java
if (nota < 0 || nota > 10) {
    System.out.println("Error");
} else if (nota < 5) {
    System.out.println("Suspenso");
} else if (nota < 7) {
    System.out.println("Aprobado");
} else if (nota < 9) {
    System.out.println("Notable");
} else if (nota < 10) {
    System.out.println("Excelente");
} else {
    System.out.println("Matrícula de Honor");
}
```

### 🧪 de examen

```java
if (hor >= 0 && hor < 24 && min >= 0 && min < 60) {
    TimeInstant h = new TimeInstant(hor, min);
} else {
    System.out.println("Hora no válida.");
}
```

### 🧪 Bono Renfe 
```java
// Si quedan viajes, cuando se aplica el método (pase la tarjeta) 
// le bajará un valor 
public String picar() {
    if (numTiquets > 0) {
        numTiquets--;
        return "Bono con " + numTiquets + " viajes";
    } else {
        return "Bono agotado. ¡Recárgalo!";
    }
}
```

---

## Condicional `switch`
## 5.8. 🟦 ¿Qué es una instrucción `switch`?
Es una estructura de selección múltiple que permite decidir entre varias opciones basándose en el valor de una expresión.

## 5.9. 🟦 Funcionamiento
1. Se evalúa la expresión del `switch`.
2. Se compara con los valores de cada `case`.
3. Si hay coincidencia:
    - Se ejecuta ese bloque y todos los que le siguen (a menos que haya `break`).
4. Si no coincide ninguno, se ejecuta `default`.
5. Se continúa con el resto del programa.

## 5.10. 🟦 Sintaxis básica de `switch`
### `switch` simple

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día desconocido");
        break;
}
```

### `switch` compuesto
```java
int mes = 4;
String estacion;

switch (mes) {
    case 3: case 4: case 5:
        estacion = "Primavera";
        break;

    case 6: case 7: case 8:
        estacion = "Verano";
        break;

    case 9: case 10: case 11:
        estacion = "Otoño";
        break;

    case 12: case 1: case 2:
        estacion = "Invierno";
        break;

    default:
        estacion = "Error";
        break;
}
```

## 5.11. 🟦 Errores comunes (¡muy importantes!)
❌ Falta de break → ejecuta los siguientes casos sin querer
<br>

❌ Usar variables en un case (solo se permiten constantes)
<br>

❌ Usar double o float en la expresión
<br>

❌ Falta del default (penaliza en estilo) 