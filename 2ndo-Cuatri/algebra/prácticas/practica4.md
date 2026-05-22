# 4. Cálculo de inversas y descomposición

## Matriz Inversa
Dada una matriz cuadrada 𝐴, su inversa es la $A^{-1}$
```math
AA^{-1} = I
```

donde I es la matriz identidad.

## Calcular inversa con `inv`
```js
A = [2 5 -1; 0 0 9; 0 -5 4];

inv(A)

// comprobar resultado
A*inv(A)
```

Aveces aparecen números muy pequeños (ej. 5.551D-17), en ese caso debemos ___limpiar los resultados.___
```js
clean(A*inv(A))
```

---

## Matriz Singular
Una matriz singular:
- No tiene inversa
- Tiene determinante 0
- No tiene rango máximo

```js
B = [1 1 1; 2 2 2; 3 3 3];

inv(B)

//sale de resultado este error
Problem is singular
```

### Comprobar rango
```js
rank(B)

//resultado
1
```

---

## Matriz mal condicionada
A veces en Scilab muestra:
```js
matrix is close to singular or badly scaled
```
La matriz es casi singular.

### Comprobar rango
```js
rank(A)
```
Si el rango no es máximo → no es invertible.

---

## Inversa con Gauss-Jordan
Construimos:
```math
[A \mid I]
```

y aplicamos `rref`.
```js
A = [2 5 -1;0 0 9;0 -5 4];

A1 = [A, eye(3,3)];

rref(A1)
```
Si queda:
```math
[I \mid A^{-1}]
```

entonces A es invertible.

### Extraer la inversa
```js
ans(:,4:6)
```

---

## Cuándo una matriz no es invertible
Si tras rref la izquierda NO es identidad:
```math
[I \mid A^{-1}]
```

entonces no existe inversa.


---

## Descomposición LU
Escribir:
```math
A =  LU
```

donde: 
- L → triangular inferior
- U → triangular superior

---

## Calcular LU en Scilab
```js
A = [2 5 -3; 4 7 -4; -6 -3 1];

[L,U] = lu(A)
```

Importante:
<br>
Scilab una pivotación parcial.
<br>
Puede intercambira filas.
<br>
Entonces:
- `U` sí es triangular superior
- `L` puede parecer NO triangular

---
## Matriz de Permutación
```js
[L,U,P] = lu(A)
```

```math
PA = LU
```

Comprobación:
```js
P*L*U
```
Debe dar A.

---

## Resolución de sistemas con LU
Queremos resolver:
```math
Ax = b
```

Como:
```math
A = LU
```

entonces:
```math
LUx = b
```
Definimos:
```math
Ux = y
```
y resolvemos:

1. Ly=b
2. Ux=y

```js
C = [0 -2 1;3 0 2;0 2 4];

[L,U] = lu(C);

y = L\[1;2;3]

x = U\y
```

resultado:
```js
x =
0.1333333
-0.1
0.8
```

---

## Determinantes de LU
```math
\det(A) = \det(L)\det(U)
```


___Importante:___
<br>
Si U es triangular:
```math
\det(U) = \text{producto de la diagonal}
```


```js
A = [0 2 3; -4 6 0; 2 -5 5];

[L,U] = lu(A);

det(L)*det(U)
```

---

## Inversa mediante LU
```js
A = [1 2 -5; -4 1 0; 1 2 7];

[L,U] = lu(A);

inv(U)*inv(L)
```

comprobar:
```js
clean(A*ans)
```
Debe dar identidad.
