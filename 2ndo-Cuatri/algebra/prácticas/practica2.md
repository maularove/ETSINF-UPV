# 2. Métodos Iterativos 

Los métodos iterativas sirven para resolver sistemas:
```math
Ax = b
```

pero __no dan la solución exacta directamente__, sino que generan:

```math
x^{(0)}, x^{(1)},x^{(2)},…
```

hasta acercarse a la solución.

## Condiciones importantes
Para poder usar estos métodos:
- Mismo nº ecuaciones que de incógnitas
- matriz __A__ con rango máximo
- Los elementos de la diagonal __no son cero__

## 2.1 Descomposición de la matriz
Se descompone:
```math
A = L + D + U
``` 
Donde:
- _D:_ diagonal
- _L:_ parte inferior
- _U:_ parte superior

En Scilab:

```js
D = diag([diag(A)])
L = tril(A) - D
U = triu(A) - D
```

## 2.2 Método de Jacobi

```math
x^{(k+1)} = D^{-1}(b - (L+U)x^{(k)})
```

Pasos para poder llevarlo a cabo:
<br>

1. Elegir vector inicial:
```java
x = [0;0;0]
```

2. Calcular:
```java
F = inv(D)
R = L + U
```

3. Iterar:
```java
for i = 1:n
    x = F*(b - R*x)
end
```

📌 Ejemplo:
```java
A = [10 3 1; 2 -10 3; 1 3 10];
b = [14; -5; 14];

// Descomposición
D = diag([diag(A)]);
L = tril(A) - D;
U = triu(A) - D;

//Jacobi
F = inv(D);
R = L + U;

x = [0;0;0];

for i = 1:10
    x = F*(b - R*x);
end

x
```

## 2.3 Método de Gauss-Seidel
En fórmula:

```math
(L + D)x^{(k+1)} = b - Ux^{(k)}
```

En Scilab:
```java
M = L + D
x = [0;0;0]

for i = 1:n
    x = inv(M)*(b - U*x)
end
```

ejemplo:
```java
D = diag([diag(A)]);
L = tril(A) - D;
U = triu(A) - D;

M = L + D;

x = [0;0];

for i = 1:10
    x = inv(M)*(b - U*x);
    x
end
```

### Diferencia con Jacobi
- Jacobi → usa valores antiguos
- Gauss-Seidel → usa valores antiguos

## 2.4 Criterio de convergencia
Para que los métodos funcionen:
```math
|a_{ii}| > \sum_{j \ne i} |a_{ij}|
```

### Interpretación:
En cada fila:
<br>

El número de la diagonal debe ser mayor que la suma del resto
<br>

Ejemplo:
```math
|10| > |3| + |1|
```

---