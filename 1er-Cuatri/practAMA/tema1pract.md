# TEMA 1: Introducción a la Mathematica

## 🔹 Demostración Gráfica
```wl
Plot[x, {x, -1 , 1}]
```

## 🔹 Dibujar Círculo
```wl
Graphics[Circle[{1, 2}, 3], Axes -> True]
```

## 🔹 Resultado expandido
```wl
Expand[(x^3  + x^2 + x + 1) * (x^5 - x^4 + x - 1)]
```

## 🔹 Resultado simplificado
```wl
Simplify[(x^2 - 3 x + 2)/(x^2 - 1)]
```

## 🔹 Limites
```wl
Limit[(Sqrt[1 + x] - Sqrt[1 - x])/x, x -> 0]
```

## 🔹 Integral
```wl
Integrate[Sqrt[1 + x] - Sqrt[1 - x], x]
```

## 🔹 Tripe Integral
```wl
D[Sqrt[1 + x] - Sqrt[1 - x], {x, 3}]
```

## 🔹 Función con valor x, y 10 dígitos significativos

```wl
(* definicion funcion *)
f[x_]:= (x^3 - 5 x^2 + 3 x + 1)/(2 x^2 + x - 1)

(* % = referencia a la funcion / lo ultimo comentado *)
(* el valor de x será 5/4 *)
%/. x -> (5/4)

(* 10 valores significativos *)
N[%, 10]
```

## 🔹 Sacar Dominio
```wl
FunctionDomain[f[x], x]
```
