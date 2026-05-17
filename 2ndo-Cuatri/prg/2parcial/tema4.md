# Tema 4. Entrada y Salida. Flujos y Ficheros

## ¿Qué es un flujo?
Un flujo es una secuencia de información que entra o sale de un programa.
- __Entrada__ → datos que llegan al programa
- __Salida__ → datos que salen al programa


## Flujos especiales en Java
Java tiene dos flujos estándar:
```js
System.in   // entrada (teclado)
System.out  // salida (pantalla)
```

## Clases principales
### Entrada
```js
InputStream
```

### Salida
```js
outputStream
```

Y sus derivados para archivos:
```js
FileInputStream
FileOutputStream
```

## Ficheros
## ¿Qué es un fichero?
Un fichero es información almacenada en memoria secundaria:
- disco duro
- USB 
- SSD 
- etc...
Sirve para guardar datos incluso después de cerrar el programa.

## Características de un fichero
- Nombre
- Ruta
- Tamaño
- Permisos
- Fecha de modificación

## Operaciones básicas
### Leer
```js
Abrir → Leer → Cerrar
```

### Escribir
```js
Abrir → Escribir → Cerrar
```

---

## 3. Tipos de Ficheros
Hay dos grandes tipos:

### 3.1 Ficheros de texto
Guardan caracteres legibles
<br>

Ejemplo:
```js
Hola
123
```

### Ventajas
✅ Legibles por humanos
<br>

✅ Portables
<br>

✅ Fáciles de editar

### Desventajas
❌ Más grandes
<br>

❌ Más lentos
<br>

### 3.2 Ficheros binarios
Guardan datos codificados en bytes.
<br>

Ejemplo:
- `int` ocupa 4 bytes
- `double` ocupa 8 bytes

### Ventajas
✅ Más rápidos
<br>

✅ Más pequeños
<br>

✅ Más eficientes

### Desventajas
❌ No legibles
<br>

❌ Más complejos
<br>

---

## 4. Clase `File`
La clase `File` representa rutas de archivos o carpetas.
```js
File f = new File("datos.txt");
```

⚠️ Crear un `File` No crea el archivo realmente.

### Métodos importantes
| Método              | Función             |
| ------------------- | ------------------- |
| `exists()`          | comprueba si existe |
| `delete()`          | borra               |
| `getName()`         | nombre              |
| `getParent()`       | carpeta             |
| `getAbsolutePath()` | ruta completa       |
| `length()`          | tamaño              |
| `isFile()`          | si es fichero       |
| `isDirectory()`     | si es carpeta       |
| `listFiles()`       | lista archivos      |

### Ejemplo:
```js
File f = new File("/home/file.txt");

System.out.println(f.getName());
System.out.println(f.exists());
```

---

## 5. Escritura de Ficheros de texto - `PrintWriter`
### ¿Para qué sirve?
Para escribir texto fácilmente en archivos.

### Crear un `PrintWriter`
```js
PrintWriter pw = new PrintWriter("datos.txt");
// o
PrintWriter pw = new PrintWriter(new File("datos.txt"));
```

| Método      | Función           |
| ----------- | ----------------- |
| `print()`   | escribe sin salto |
| `println()` | escribe con salto |
| `printf()`  | texto formateado  |
| `close()`   | cierra fichero    |

### Importante
Cuando se crea:
- si el fichero NO existe → se crea
- si existe → se borra su contenido
⚠️ Puede lanzar:
```js
FileNotFoundException
```

### Ejemplo:
```js
PrintWriter pw = new PrintWriter("file.txt");

pw.println("Hola");
pw.println(5);

pw.close();
```

---

## 6. Lectura de Ficheros - `Scanner`
### ¿Para qué sirve?
Para leer:
- teclado
- strings
- archivos

### Crear Scanner
Desde teclado
```js
Scanner sc = new Scanner(System.in);
```

Desde archivo
```
Scanner sc = new Scanner(new File("datos.txt"));
```

Puede lanzar:
```js
FileNotFoundException
```

---

## 7. Tokens
Scanner divide la entrada en "tokens":
- palabras
- números
- fragmentos separados por espacios

---

## 8. Métodos Importantes de `Scanner`
| Método         | Función          |
| -------------- | ---------------- |
| `hasNext()`    | quedan datos     |
| `hasNextInt()` | siguiente es int |
| `next()`       | siguiente token  |
| `nextLine()`   | siguiente línea  |
| `nextInt()`    | siguiente entero |
| `nextDouble()` | siguiente double |

---

## 9. Excepciones en Scanner

✔️ `NoSuchElementException`
<br>
Cuando intentas leer y ya no quedan datos.
<br>

✔️ `InputMismatchException`
<br>
Cuando el tipo no coincide.
<br>

Ejemplo:
```js
scanner.nextInt();
```

pero el texto es:
```js
hola
```

Entonces:
```js
InputMismatchException
```

⚠️ Importante:
- el token NO desaparece
- se puede volver a intentar

---

## 10. Ejemplo Completo Scanner + PrintWriter
Escribir:
```js
PrintWriter pw = new PrintWriter("f.txt");

pw.println(3);

pw.close();
```

Leer:
```js
Scanner sc = new Scanner(new File("f.txt"));

int n = sc.nextInt();

sc.close();
```

---

## 11. Cierre de Ficheros
### Cerrar los ficheros:
```js
close();
```

### Finally
Para garantizar cierre:
```js
finally {
   if (sc != null) sc.close();
}
```

## 12. Ficheros Binarios
Guardan datos codificados directamente.

---

## 13. Serialización
Guardar objetos completos en un archivo binario.
<br>
La clase debe usar `Serializable`.
```js
finally {
   if (sc != null) sc.close();
}
```

Ejemplo:
```js
Agenda
Persona
Alumna
```

---

## 14. `ObjectOutputStream`
Sirve para escribir:
- primitivas 
- objetos

### Ejemplo:
```js
ObjectOutputStream out =
    new ObjectOutputStream(
        new FileOutputStream("f.dat"));

out.writeInt(5);

out.close();
```

### 15. `ObjectInputStream`
Sirve para leer:
- primitivas
- objetos

### Ejemplo:
```js
ObjectInputStream in =
    new ObjectInputStream(
        new FileInputStream("f.dat"));

int n = in.readInt();

in.close();
```

## 16. Métodos Importantes
### Métodos Escritura
- `writeInt()`
- `writeDouble()`
- `writeUTF()`
- `writeObject()`

### Métodos Lectura
- `readInt()`
- `readDouble()`
- `readUTF()`
- `readObject()`

---

## 17. Excepciones en Ficheros Binarios

✔️ `FileNotFoundException`
<br>
Archivo no encontrado.
<br>

✔️ `IOException`
<br>
Problemas generales de E/S
<br>

✔️ `ClassNotFoundException`
<br>
No encuentra la clase del objeto leído
<br>

✔️ `EOFException`
<br>
Fin del fichero
<br>

---

## 18. Fin del fichero
Cuando lees más allá del final.
```js
EOFException
```

### Técnica típica
```js
while(true) {
   int n = in.readInt();
}
```

Capturando:
```js
catch(EOFException e)
```

---

## 19. Jerarquía de Excepciones
### Checked
Obligatorias:
- IOException
- FileNotFoundException
- EOFFException

### Unchecked:
No obligatorias:
- InputMismatchException
- NoSuchElementEception

