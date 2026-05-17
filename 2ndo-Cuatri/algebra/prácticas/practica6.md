# 6. Ortogonalidad y Proyecciones Ortogonales (Scilab)
### Idea importante:
Descomponer un vector en una parte dentro de un subespacio y otra perpendicular.

## 6.1 Producto escalar
Si:
$$u=(u1​,u2​,…,un​)$$
y
$$v=(v1​,v2​,…,vn​)$$
entonces:
$$u⋅v=u1​v1​+u2​v2​+⋯+un​vn​$$

---

## 6.2 Ortogonalidad
Dos vectores son ortogonales si:
$$u⋅v=0$$
es decir:
$$u⊥v$$

---

## 6.3 Comandos Scilab
### Definir vectores
```js
u = [5;-4;0;3]
v = [-4;1;-3;8]
```

### Producto escalar
```js
u'*v
```

Resultado:
$$0$$
Entonces:
$$u⊥v$$

---

## 6.4 Norma de un vector
La norma es la longitud del vector.
$$\|v\|=\sqrt{v_1^2+v_2^2+\cdots+v_n^2}$$

```js
w = [3;3;5;-1]

norm(w)
```

---

## 6.5 Vector unitario
Un vector unitario tiene norma 1.
Se obtiene haciendo:
$$
\frac{v}{\|v\|}$$

```js
t = w / norm(w)

// comprobar
norm(t)
```

debe salir:
$$1$$

---

## 6.6 Distancia entre dos vectores
$$d(u,v)=∣∣u−v∣∣$$

```js
norm(u-v)
```

---

## 6.7 Subespacio columna y fila
### Subespacio columna
Está generado por las columnas de una matriz
$$Col(A)$$

### Subespacio fila
Está generado por las filas.
$$Fil(A)$$

---

## 6.8 Complemento ortogonal
Son todos los vectores perpendiculares a un subespacio.

$$(Fil(A))^
⊥
=Nul(A)
$$
$$(Col(A))^
⊥
=Nul(A
^t
)$$

```js
// crear matriz
A = [u v w]

// núcleo de A
kernel(A)
```
esto calcula:
$$(Fil(A))^⊥$$

### Núcleo de A'
```js
kernel(A')
```
esto calcula:
$$(Col(A))^⊥$$

---

## 6.9 Proyección ortogonal
Es la sombra perpendicular de un vector sobre un subespacio.

---

## 6.10 Proyección sobre una recta
Si una recta está generada por un vector unitario:
$$q$$
Entonces:
$$ProyW​(x)=(qtx)q
$$

---

## 6.11 Ejemplo completo
Queremos proyectar:
$$x=(0,1,1)$$
sobre la recta generada por:
$$u=(1,−2,5)$$

Paso 1 — Crear vector
```js
u = [1;-2;5]
```
Paso 2 — Hacerlo unitario
```js
q = u / norm(u)
```
Paso 3 — Vector a proyectar
```js
x = [0;1;1]
```
Paso 4 — Fórmula de proyección
```js
(q'*x)*q
```

resultado:
$$
\begin{pmatrix}
0.1 \\
-0.2 \\
0.5
\end{pmatrix}
$$

---

## 6.12 Otro ejemplo
Paso 1 — Base del subespacio
```js
u1 = [1;2;3]
u2 = [-3;-5;1]
```

Paso 2 — Construir M(S)
```js
MS = [u1 u2]
```

Paso 3 — Vector a proyectar
```js
x = [2;3;4]
```

Paso 4 — Matriz de proyección
```js
PW = MS * inv(MS'*MS) * MS'
```

Paso 5 — Proyección ortogonal
```js
PW*x
```

---
## Preguntas que pueden ser
ej 1. comprobar si dos vectores son ortogonales
```js
u'*v
```

ej 2. calcular la norma
```js
norm(v)
```

ej 3. calcular distancia entre vectores
```js
norm(u-v)
```

ej 4. calcular un vector unitario
```js
v/norm(v)
```

ej 5. calcular completamente ortogonal
```js
kernel(A)
// o
kernel(A')
```

ej 6. calcular proyección ortogonal sobre una recta
```js
u = [1;-2;5]

q = u/norm(u)

x = [0;1;1]

(q'*x)*q
```

ej 7. calcular proyección sobre un subespacio
```js
u1 = [1;2;3]
u2 = [-3;-5;1]

MS = [u1 u2]

x = [2;3;4]

PW = MS*inv(MS'*MS)*MS'

PW*x
```