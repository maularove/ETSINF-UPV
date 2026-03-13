# Resolución de Sistemas Lineales; Métodos Iterativos

## 🔹 Introducción a Scilab
Cuando abras `Scilab`, verás una ventana con algo como:

```pwd
-->
```

Eso es la consola. Ahí es donde escribes los comandos.

## Cosas básicas que debes saber:
- Para ejecutar algo → pulsa Enter

- Para crear una matriz → se usan corchetes `[ ]`

- Las filas se separan con `;`

Las columnas se separan con espacios

💡 **Ejemplo:** 

```scilab
A = [1 2 3; 4 5 6]
```

Esto crea la matriz:
```math
A = \begin{pmatrix}
1 & 2 & 3 \\
4 & 5 & 6
\end{pmatrix}
```

---

## 🔹1. Operaciones elementales por filas
Según la práctica, hay tres tipos:

**1.** Intercambiar filas

**2.** Multiplicar una fila por un número

**3.** Sumar a una fila un múltiplo de otra

Comenzaremos con un ejemplo sencillo.

---

### ✅ 1.1 — Crear la matriz

Escribe esto es Scilab:

```scilab
A = [0 -2 3 9; -4 6 0 -4; 2 -5 5 17]
```

Pulsa Enter.

Debería aparecer la matriz en pantalla.

---

### ✅ 1.2 — Intercambiar filas 1 y 3

Escribe:

```scilab
B = A
B([1,3],:) = B([3,1],:)
```

### ¿Qúe significa esto?
- `[1,3]` → filas 1 y 3
- `:` → todas las columnas 
- Estamos diciendo: intercambia fila 1 con fila 3

---

### ✅ 1.3 — Multiplicar la fila 2 por 1/2

Escribe:

```scilab
C = B
C(2,:) = (1/2)*C(2,:)
```

Significa:
- Fila 2
- Todas las columnas
- Multiplida por 1/2

---

### ✅ 1.4 — Sumar fila 1 a fila 2

```scilab
D = C
D(2,:) = D(2,:) + D(1,:)
```

Esto hace:

Fila 2 = fila 2 + fila 1

---

### ✅ 1.5 — Comprobar si dos matrices son iguales

Ejemplo:

```scilab
A = [1 2; 3 4];
B = [1 2; 3 4];
```

Para comprobar si son iguales:

```scilab
A == B
```

Te devolverá una matriz de 1s y 0s:

- 1 → iguales

- 0 → distintos

Si quieres comprobar si son completamente iguales:

```scilab
and(A == B)
```

<br>

---

## 🔹 2. Forma escalonada reducida (rref) 

Scilab tiene una función automática:

```scilab
rref(A)
```

Vamos a hacerlo con la matriz del ejemplo.

Vamos a practicar con un ejemplo.

---

### ✅ 2.1 — Crear la matriz

Escribe esto en Scilab:

```scilab
A = [0 -2 3 9; -4 6 0 -4; 2 -5 5 17]
```

---

### ✅ 2.2 — Calcular forma escalonada reducida

```scilab
rref(A)
```

Debería salir:

```scilab
1 0 0 1
0 1 0 0
0 0 1 3
```

### 🔎 ¿Qué significa esto?

La matriz corresponde a:

```math
\begin{aligned}
x &= 1 \\
y &= 0 \\
z &= 3
\end{aligned}
```

La última columna es el resultado.

<br>

---

## 🔹 3. Resolver sistemas con `\`

Este es el método más importante.

Un sitema:

```math
Ax=b
```

En Scilab se escribe:

```scilab
x = A\b
```

---

### ✅ 3.1 — Compatible determinado

Escribe:

```scilab
A = [0 -2 3; -4 6 0; 2 -5 5];
b = [9; -4; 17];

x = A\b
```

Te dará la solución.

### Comprobar si es solución

```scilab
A*x
```

Debe dar exactamente `b`.

### Ver el Rango

```scilab
rank(A)
```

Si el rango es igual al número de columnas → solución única.

---

### ✅ 3.2 — Sistema Incompatible

Escribe:

```scilab
A = [1 1 1; 1 1 1; 2 2 2];
b = [1; 2; 3];

x = A\b
```

Verás un warning ⚠️

Luego comprueba:
```scilab
A*x - b
```

Si no da cero → el sistema es incompatible.

---

### ✅ 3.3 — Sistema Compatible Indeterminado

Cuando el sistema tiene infinitas soluciones

1️⃣ Calculas una solución particular:
```scilab
x0 = A\b
```

2️⃣ Calculas el núcleo:
```scilab
kernel(A)
```

Esto devuelve vectores columna.

La solución general será:

```math
x=x0+λ1u1+λ2u2
```

<br>

---

## 🔹 4. Redes de flujo
Aquí simplemente:

**1.** Escribes la matriz ampliada M

**2.** Haces:

```scilab
rref(M)
```

**3.** Interpretas el parámetro libre λ

<br>

---