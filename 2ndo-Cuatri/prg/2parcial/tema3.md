# 🧠 TEMA 3: POO - Herencia y Excepciones (Java)

## 1.- Herencia (POO)
Es un mecanismo que permite crear una clase nueva a partir de otra ya existente.

- Relación: __"ES UN"__
- Ejemplo: Estudiante _ES UNA_ Persona

Sirve para reutilizar código y evitar repetir atributos / métodos

<br>

### Conceptos clave
`Clase base` (superclase) → la original

<br>

`Clase derivada` (subclase) → la nueva
- Hereda atributos y métodos __no privados__
- Puede añadir cosas nuevas

<br>

Se usa:
```java
class Estudiante extends Persona
```

### Constructor y super
- Se usa `super(...)` para llamar al constructor de la clase base
- Debe ser la primera instrucción

### Modificadores de acceso

### Sobreescritura (override)
Permite redefinir métodos heredados
- Mismo nombre, parámetros y tipo
- Puede ser:
    - __Completa__ → nuevo comportamiento
    - __Parcial__ → usa `super`
<br>

Ejemplo:
```java
toString()
equals()
```

### ✔️ Jerarquía de clases
- Todas las clases heredan de `Object`
- Estructura tipo árbol

<br>

📌 Importante:
- Java __NO tiene herencia múltiple__ (solo puede heredar de uno)
- Relación transitiva:
    - Si A → B y B → C → entonces A → C

### Compatibilidad de tipos
### ✔️ Esto es válido:
```java
Persona p = new Estudiante();
```

❌ Esto NO:
```java
Estudiante e = new Persona(); // error
```

### ✔️ instanceof:
comprueba el tipo:
```java
if (obj instanceof Estudiante)
```

## 2.- Excepciones en Java
Un error que ocurre durante la ejecución

