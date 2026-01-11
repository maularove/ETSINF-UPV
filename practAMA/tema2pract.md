# Tema 2: Estudio y representaciones de funciones

## 🔹 Definir una funcion de una variable
```wl
Nombre[x_]:=expresion

(* ejemplpo: *)
f[x_]:= x^2
```

## 🔹 Resolver funcion dando un valor a x
```wl
g[x_]:= (Cos[x] - Sin[x]) / x

(* el valor de x es 3 *)
g[3]

(* solución con su valor numérico *)
N[g[3]]
```

## 🔹 Representación de funciones de una variable
```wl
Plot[expresion, {x, xmin, xmax}]
```

ejemplo basiquillo:
```wl
Plot[-x^2 + 4, {x, -3, 3}]
```

### Modificación estilo gráfica:
```wl
(* PlotStyle -> RGBColor[a, b, c] | cambiar color gráfico *)
Plot[Tan[x], {x, -3, 3}, PlotStyle -> Green]

(* PlotStyle -> Thickness[a] | cambiar grosor gráfico *)
Plot[x^2, {x, -2, 2}, PlotStyle -> {Yellow, Thickness[0.01]}]

(* AspectRation -> k | proporcion entre la longitud de los ejes *)
Plot[Log[x], {x, -2, 2}, AspectRatio -> 0.5]

(* AxesOrigin -> {a, b} | Puntos de corte de los ejes *)
Plot[x^2 + 5, {x, -3, 3}, AxesOrigin -> {0, 0}]

(* Gráfica de varias funciones *)
Plot[{Log[x], Tan[x], x^3 - 7 x + 20}, {x, -4, 4}, 
 PlotLegends -> "Expressions"]
```

## 🔹 Asíntotas Horizontales
```wl
(* si dan valor numérico habrá asíintotas, sino comprobaremos oblicuas *)
Limit[ArcTan[x], x -> -Infinity]

Limit[ArcTan[x], x -> -Infinity]
```

## 🔹 Asíntotas Horizontales
```wl
m = Limit[q[x]/x, x ->  -Infinity]
n = Limit[q[x] - mx, x ->  -Infinity]

resultado = mx + n
```

## 🔹 Asíntotas Verticales
```wl

(* 1º.- sacar dominio *)
FunctionDomain[f[x], x]

(* 2º.- usar valores de dominio para probar asintotas verticales *)

(* en -1 no hay asintota vertical *)
(* en 1 si hay asintotas verticales *)
Limit[f[x], x  -> -1, Direction -> 1]

Limit[f[x], x  -> -1, Direction -> -1]
```

representar asíntota:
```wl
Plot[f[x], {x, -10, 10}, Exclusions -> {1}, ExclusionsStyle -> Dashed]
```