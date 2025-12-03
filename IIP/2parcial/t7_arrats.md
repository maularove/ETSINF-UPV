# 7. Arrays
## 1. ¿Qué es un array?
Un array es una colección ordenada y homogénea:
- **"Ordenada"** → los elementos tienen un índice.
- **"Homogénea"** → todos los valores son del mismo tipo.

```java
índices:   0   1   2   3   4
valores:  10  20  15  12  99
```

## 🟦 2. Declaración y creación de arrays
### 📌 Declarar un array:
```java
int[] numeros;       // recomendada
```

### 📌 Crear un array:
```java
numeros = new int[5];   // tamaño fijo: 5 elementos
```

### 📌 Declaración + creación:
```java
int[] numeros = new int[5];
```

### 📌 Crear y rellenar directamente:
```java
int[] valores = { 3, 7, 1, 9 };
```

## 🟦 3. Acceso a elementos `[]`
```java
numeros[0] = 10;   // Asignar
int x = numeros[2]; // Leer
```

## 🟦 4. Arrays y memoria
- La variable `numeros` **no contiene los valores**, sino la dirección del array.
- Por eso:
```java
int[] a = {1,2,3};
int[] b = a;      // b y a apuntan al MISMO array
```
Modificar b también modifica a.

## 🟩 5. Copiar arrays correctamente
```java
int[] b = new int[a.length];
for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

## 🟦 6. Arrays en métodos
### 🔹 Como parámetro:
```java
public static void ejemplo(int[] v) { ... }
```
Se pasa la referencia, no una copia → si modificas `v`, modificas el array original.

### 🔹 Como retorno:
```java
public static int[] crearArray() {
    int[] x = new int[4];
    return x;      // OK
}
```

## 🟦 6. Recorrer arrays
La operación más típica: recorrer un array con un for.

### 🔹 Recorrido ascendente:

```java
for (int i = 0; i < v.length; i++) {
    System.out.println(v[i]);
}
```

### 🔹 Recorrido descendente:

```java
for (int i = v.length - 1; i >= 0; i--) {
    System.out.println(v[i]);
}
```

## 🟦 7. Ejemplos típicos de recorridos
### ➤ Obtener la suma
```java
int suma = 0;
for (int i = 0; i < v.length; i++) {
    suma += v[i];
}
```

### ➤ Obtener el máximo
```java
int max = v[0];
for (int i = 1; i < v.length; i++) {
    if (v[i] > max) max = v[i];
}
```

### ➤ Obtener la posición del mayor String (orden alfabético)
```java
int pos = 0;
for (int i = 1; i < a.length; i++) {
    if (a[i].compareTo(a[pos]) > 0)
        pos = i;
}
```

## 8. Uso de arrays en representaciones reales
### ✔️ Contadores (ej. frecuencia de dados)
```java
int[] cont = new int[10];
cont[tirada]++;
```

### ✔️ Conjuntos de enteros (boolean[])
```java
boolean[] conjunto = new boolean[N+1];
conjunto[i] = true; // pertenece
```

### ✔️ Lista de objetos (ej. alumnos, contactos)
```java
Contacto[] agenda = new Contacto[250];
agenda[pos] = new Contacto(nombre, telefono);
```