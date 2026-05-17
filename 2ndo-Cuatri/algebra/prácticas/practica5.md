# 5. Algoritmo PageRank (Scilab)
## 5.1 ¿Qué es PageRank?
PageRank es el algoritmo usado por Google para medir la importancia de páginas web.
<br>
Una página es importante si:

- muchas páginas enlazan hacia ella
- o páginas importantes enlazan hacia ella

La web se modela mediante:
$$
\text{Páginas web} \longrightarrow \text{grafo dirigido}
$$
### Interpretación
- vértices → páginas web
- flechas → enlaces

---

## 5.2 Vector de Importancia
Cada página tiene una importancia:
$$
I(p_i)
$$

### Vector PageRank
$$
\vec I =
\begin{pmatrix}
I(p_1) \\
I(p_2) \\
\vdots
\end{pmatrix}
$$

---

## 5.3 Matriz G
La importancia se calcula usando una matriz:
$$
G = [g_{ij}]
$$

### Definición de las entradas
$$
g_{ij} =
\frac{1}{\text{número de enlaces de } p_j}
$$

si $p_j$ enlaza a $p_i$


### Si no enlaza
$$
g_{ij}=0
$$

---

## 5.4 Ecuación Fundamental
El vector de importancia cumple:
$$
G\vec I = \vec I
$$

---

## 5.5 Vector Estacionario
Queremos un vector que:
### 5.5.1 Sea estacionario
$$
G\vec I = \vec I
$$

### 5.5.2 Sea vector de probabilidad
- componentes ≥ 0
- suma = 1

### 5.5.3 Sea único
para tener una única clasificación de páginas.

---

## 5.5 Matrices Estocásticas
Una matriz es estocástica si:
- todas las entradas ≥ 0
- cada columna suma 1

---

## 5.6 Problema de las columnas nulas
Si una página no tiene enlaces:
$$
a_j = 0
$$
aparece una columna nula (la matriz deja de ser estocástica).

---

## 5.7 SOLUCIÓN — PÁGINAS SUMIDERO
Si una página no tiene enlaces, suponemos que enlaza a todas por igual.
<br>
Sustituimos columna nula por:
$$
\left(
\frac1n,\frac1n,\dots,\frac1n
\right)
$$

---

## 5.8 Matriz de Aleatoriedad
$$
E =
\begin{pmatrix}
1/n & 1/n & \dots \\
1/n & 1/n & \dots \\
\vdots & \vdots & \ddots
\end{pmatrix}
$$
El usuario puede ir aleatoriamente a cualquier página.

---

## 5.9 Matriz GOOGLE
📌 importante:
$$
\bar G = \alpha G + (1-\alpha)E
$$
📌 α (alpha)
$$
0 < \alpha < 1
$$
- α cercano a 1 → seguimos enlaces reales
- α pequeño → navegación más aleatoria

📌 Google usa
$$
\alpha \approx 0.85
$$

---

## 5.10 Sistema a resolver
Queremos resolver:
$$
\bar G \vec x = \vec x
$$
equivalente a:
$$
(\bar G - I)\vec x = 0
$$

---

## 5.11 Método Iterativo
$$
x_{k+1} = \bar G x_k
$$

📌 Cadena de Markov
$$
x_0,\ x_1,\ x_2,\dots
$$

---

## 5.12 Ejemplo completo Scilab
📌 Paso 1 — Definir matriz G
```js
G = [0 0 1/3 1/4;
     1 0 1/3 1/4;
     0 1 0 1/4;
     0 0 1/3 1/4]
```

📌 Paso 2 — Matriz aleatoria
```js
E = 1/4*ones(4,4)
```

📌 Paso 3 — Matriz Google
```js
G = 0.85*G + (1-0.85)*E
```

📌 Paso 4 — Resolver sistema
```js
x = kernel(G-eye(4,4))
```

📌 Paso 5 — Normalizar
```js
x = x/sum(x)
```

resultado:
```js
0.1708075
0.3159938
0.3423913
0.1708075
```

---

## 5.13 Interpretación
La página más importante es
$$
p_3
$$
porque tiene el valor más grande.

---

## 5.14 Ordenar páginas
```js
[w,k] = gsort(x/sum(x))

// resultado
k =
3
2
1
4
```
orden de importancia:
```js
p3 > p2 > p1 > p4
```
