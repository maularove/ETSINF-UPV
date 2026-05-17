# 7. Método de los mínimos cuadrados
## 7.1 Idea clave: mínimos cuadrados
Se usa cuando un sistema tiene:
- más ecuaciones que incógnitas
- normalmente no tiene solución exacta
Entonces buscamos una solución aproximada que haga:
$$A
\vec x
≈
\vec b$$
minimizando el error:
$$∥\vec b
−A\vec x
∥$$

---

Una solución por mínimos cuadrados del sistema:
$$A
\vec x
=
\vec b$$

es un vector $\bar x_ 
M$ tal que:
$$∥
b
−A
\vec x_
M
∥≤∥
\vec b
−A
\vec x
∥   ∀
x$$ 

---

## 7.2 Fórmula Más Importante del Tema
La solución por mínimos cuadrados se obtiene resolviendo:
$$A^
t
A
\vec x_
M
=A^
t
\vec b$$
Esto se llama, ___Ecuaciones normales___

### Caso más importante
si las columnas de A son linealmente independientes:
$$\vec x_
M
=(A^
t
A)^
{−1}
A^
t
\vec b
	​
$$ 

### Error residual
Mide el error del ajuste:
$$∥\vec b
−A\vec x_
M​∥​$$

---

## 7.3 Ejemplo completo típico
resolver por mínimos cuadrados:
$$A=\begin{bmatrix} 1 & 3 \\ 1 & -1 \\ 1 & 1 \end{bmatrix},
\vec b=\begin{bmatrix} 5 \\ 1 \\ 0 \end{bmatrix}$$

Paso 1: calcular $A^
t
A$
$$A^tA=\begin{bmatrix} 3 & 3 \\ 3 & 11 \end{bmatrix}$$

Paso 2: calcular $A^
t
\vec b$
$$A^t\vec b
=\begin{bmatrix} 6 \\ 14 \end{bmatrix}$$

Paso 3: resolver
$$\begin{bmatrix} 3 & 3 \\ 3 & 11 \end{bmatrix} \begin{bmatrix} x_1 \\ x_2 \end{bmatrix} = \begin{bmatrix} 6 \\ 14 \end{bmatrix}$$

solución:
$$\vec x_
M​=\begin{bmatrix} 1 \\ 1 \end{bmatrix}$$

error residual
$$|| \vec b
−A \vec x_
M​||
​= \sqrt{6}
​$$

---

## 7.4 Resolución en Scilab
```js
A=[1 3;1 -1;1 1];
b=[5;1;0];

Am=A'*A
bm=A'*b

xm=Am\bm
```

resultado:
```js
xm =

1.
1.
```

### Error residual
```js
norm(b-A*xm)
```

