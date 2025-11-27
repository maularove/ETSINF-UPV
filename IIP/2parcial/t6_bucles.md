# 6. Estructura de control: Iteración

## 🟦 ¿Qué es un bucle?
Un bucle ejecuta un bloque de código repetidamente.
<br>

Tipos:
- `for` → cuando sabes cuántas veces quieres repetir.
- `while` → cuando no sabes cuántas veces, depende de una condición.

## 6.1. 🟦 Bucle `for`
## ⭐ ¿Qué es?
Una estructura compacta que permite:
- inicializar un contador
- evaluar una condición
- actualizar el contador

## 6.1.1. 🟦 Sintaxis del `for`
```java
for (inicializacion; condicion; actualizacion) {
    instrucciones;
}
```

## 6.1.2. 🟦 Errores comunes con `for`
❌ Condición mal escrita → bucle infinito
<br>

❌ Olvidar actualizar el contador
<br>

❌ Usar <= cuando debe ser < al recorrer arrays
<br>

## 6.1.3. 🟦 Usos típicos del `for`
✔️ Recorrer arrays
<br>

✔️ Repetir N veces
<br>

✔️ Ejecutar algoritmos con pasos definidos
<br>

✔️ Control estricto del número de iteraciones
<br>

✔️ Evitar bucles infinitos (muy seguro)
<br>

### 🧪 ejemplo básico: contar del 1 al 5
```java
 for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
``` 

Salida:
```java
1
2
3
4
5
```

### 🧪 recorrer un array con `for`
```java
int[] numeros = {5, 10, 15};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

## 6.1.4. 🟦 Bucles `for` más avanzados
### 🔹 Decrementar:
```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

### 🔹 Saltar de 2 en 2:
```java
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
```

<br>

---

## 6.2. Bucle `while`
## ⭐ ¿Qué es?
Un bucle que repite instrucciones mientras la condición sea verdadera.
<br>

Ideal cuando **no conoces por adelantado cuántas veces se repetirá**.

## 6.2.1. 🟦 Sintaxis del `for`
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### ✔️ Funcionamiento
1. Evalúa la condición.
2. Si es `true`, ejecuta el bloque.
3. Repite.
4. Si la condición es `false`, sale del bucle.

### 🧪 ejemplo básico: contar del 1 al 5
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## 6.1.3. 🟦 Usos típicos del `while`
✔️ Validación de datos del usuario
<br>

✔️ Leer valores hasta que llegue un “fin”
<br>

✔️ Esperar eventos (teclas, sockets, archivos)
<br>

✔️ Bucle sin número fijo de iteraciones
<br>

✔️ Situaciones donde la condición puede cambiar por factores externos
<br>

