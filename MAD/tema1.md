#   INTRODUCCIÓN A LA LÓGICA

## Proposición:
Definición:
<br>
afirmación de algo que puede ser cierto o falso.
<br>
valor lógico __1 cierto__ | __2 falso__

ej.
<br>
'Los pájaros vuelan' - ___1___
<br>
'¿dónde vas esta tarde?' - ___(no es)___
<br>
'Maradona está vivo' - ___0___

<br>

---

<br>

## Tipos de Proposiciones

__ATÓMICAS ->__ las + simples (q, p, r)
<br>

__MOLECULARES ->__ atómicas unidas mediante partículas que hacen de nexos (Q, P, R).
<br>

ej. 
<br>
'Joan es alto' - ___(atómica)___
<br>
'Maria estudia informática' - ___(atómica)___
<br>
'Joan es alto y Maria estudia informática' - ___(molecular)___

<br>

---

## Conectores Lógicos

<br>

| Conector lógico | Símbolo | Se escribe | Se lee                     |
|-----------------|--------|----------|-----------------------------|
| Negación         | ¬      | ¬p       | no p                        |
| Conjunción       | ∧      | p ∧ q    | p i q                       |
| Disjunción       | ∨      | p ∨ q    | p o q                       |
| Condicional     | →      | p → q    | si p, entonces q           |
| Bicondicional   | ↔      | p ↔ q    | p si y solo si q           |

<br>

__Negación:__ 
<br>
__¬p__ cierta si __p__ falsa, y viceversa
<br>
ej.
<br>
|p|¬p|
|--|--|
|0|1|
|1|0|

<br>

__Conjunción:__ 
<br>
p ∧ q cierto solo si, p ___y___ q son ciertos
<br>
ej.
<br>
|p|¬p|p ∧ q| 
|--|--|--|
|0|0|0|
|0|1|0|
|1|0|0|
|1|1|1|

<br>

__Disjunción:__ 
<br>
p ∨ q cierto si, p ___o___ q son ciertos
<br>
ej.
<br>
|p|¬p|p ∨ q| 
|--|--|--|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|1|

<br>

__Condicional:__ 
<br>
p → q cierto excepto si, p ___cierto___ y q ___falso___
<br>
ej.
<br>
|p|¬p|p → q| 
|--|--|--|
|0|0|1|
|0|1|1|
|1|0|0|
|1|1|1|

<br>

__Bicondicional:__ 
<br>
p ↔ q cierto solo si, p y q ___cierto___ o p y q ___falso___
<br>
ej.
<br>
|p|¬p|p ↔ q| 
|--|--|--|
|0|0|1|
|0|1|0|
|1|0|0|
|1|1|1|

<br>

---

## Jerarquia de los conectores

(mayor a menor importancia)
1. ↔
2. →
3. ∨, ∧
4. ¬

<br>

---


## Formas Proposicionales

Definición:
<br>
Cualquier expresión formada por
- símbolos
- conectores lógicos
- parejas de paréntesis

regla:
<br>
si A y B son proposicionales, también lo son
<br>
(A ∧ B), (A ∨ B), (A → B) i (A ↔ B).

<br>

---

## Tautologias y Contradicciones

### Tautologia:
___símbolo τ___
<br>

fórmula proposicional que ___siempre es cierta___
<br>
(independientemente de los valores lógicos de las variables que la forman).

<br>

### Contradicción
___símbolo φ___
<br>

fórmula proposicional que ___siempre es falsa___
<br>
(independientemente de los valores lógicos de las variables que la forman).

<br>

### Contingencia
fórmula proposicional ni tautologia ni contradicción

<br>

_ejemplos:_
<br>
¬(p ∧ q → r) es una contingencia.
<br>

(p → q) ↔ (¬p ∨ q) es una tautologia.
<br>

p ∧ ¬p es una contradicción.
