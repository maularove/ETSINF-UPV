# 3. Matrices Estocásticas y cadenas de Markov
## 3.1 Cadenas de Markov
Una cadena de Markov estudia cómo una población se mueve entre diferentes estados a lo largo del tiempo.

- `Vector de estado Inicial` (x0)
<br>
proporción inicial de individuos en cada estado.
<br>
La suma de sus componentes siempre debe ser 1.

- `Matriz de Transición` (P)
<br>
Matriz donde cada columa suma 1.
La entrada $p_{ij}$ es la probabilidad de pasar del estado j al estado i.

- `Estado Límite` (v)
<br>
Es el vector al que tiende la población después de muchos años (o pasos).
<br>
Cuando el proceso se estabiliza, se dice que es un vector estacionario.

Ejemplo:
### A. Definir la Matriz y el Vector Inicial
```js
// Definir vector columna (usar punto para decimales y punto y coma para cambiar de fila)
x0 = [0.15; 0.20; 0.65]; 

// Definir matriz de transición (comas para separar columnas, punto y coma para filas)
P = [0.70, 0.15, 0.15; 
     0.20, 0.80, 0.15; 
     0.10, 0.05, 0.70];
```

### B. Calcular estados futuros ($\vec{x}_k = P^k \cdot \vec{x}_0$)
Para saber la situación tras 10, 20 o 50 años:
```js
x10 = P^10 * x0;  // Estado tras 10 iteraciones [cite: 44]
x50 = P^50 * x0;  // Estado tras 50 iteraciones
```

### C. Limpiar valores residuales
A veces Scilab muestra números muy pequeños que en realidad son 0. Usa `clean` para verlo claro:
```js
clean(x50)
```

---

## 3.2 Cómo encontrar el Vector Estacionario (v)
Un vector es estacionario si se cumple que $P\vec{v} = \vec{v}$. Tiene dos formas de sacarlo en el examen:

### Método 1: Por aproximación (Método de la Potencia)
Si la matriz es regular (no tiene ceros o, al elevarla a una potencia, dehan de aparecer ceros), cualquier vector iniciar acabará llegando al mismo sitio.
- eleva P a un número grande (ej. 100) y multiplícalo por $x_0$.
```js
v = P^100 * x0
```

### Método 2: Por el Núcleo (Exacto)
El vector estacionario es el núcleo de la matriz $(P - I)$.
1. Calcula el núcleo de P menos la identidad.
2. Normaliza el resultado (divide el vector por la suma de sus componentes para que sume 1).
```js
// 1. Hallar el núcleo (kernel)
A = P - eye(3,3); // 'eye' crea la matriz identidad [cite: 129]
v_base = kernel(A);

// 2. Convertirlo en vector de probabilidad (que sume 1)
v_estacionario = v_base / sum(v_base) [cite: 138]
```


