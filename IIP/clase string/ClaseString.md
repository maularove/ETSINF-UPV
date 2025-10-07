### 🧵 Clase `String` – Resumen básico

| Método | Ejemplo | Qué hace |
|---------|----------|----------|
| `length()` | `"Hola".length()` → `4` | Devuelve la **longitud** del texto |
| `trim()` | `"  hola  ".trim()` → `"hola"` | Elimina espacios al inicio y final |
| `charAt(i)` | `"Java".charAt(1)` → `'a'` | Devuelve el **carácter** en la posición indicada |
| `substring(inicio, fin)` | `"Programar".substring(0, 4)` → `"Prog"` | Extrae una **parte del texto** |
| `toUpperCase()` | `"java".toUpperCase()` → `"JAVA"` | Convierte a **mayúsculas** |
| `toLowerCase()` | `"JAVA".toLowerCase()` → `"java"` | Convierte a **minúsculas** |
| `indexOf(cadena)` | `"Hola Mundo".indexOf("M")` → `5` | Devuelve la **posición** de la primera coincidencia |
| `lastIndexOf(cadena)` | `"banana".lastIndexOf("a")` → `5` | Devuelve la **última posición** donde aparece |
| `startsWith(cadena)` | `"Hola".startsWith("Ho")` → `true` | Comprueba si **empieza** con la cadena indicada |
| `endsWith(cadena)` | `"Hola".endsWith("la")` → `true` | Comprueba si **termina** con la cadena indicada |
| `concat(cadena)` | `"Hola".concat(" Mundo")` → `"Hola Mundo"` | **Une** dos cadenas |
| `contains(cadena)` | `"Programar".contains("gram")` → `true` | Comprueba si **incluye** la cadena indicada |

📝 **Recuerda:**  
> En Java, los objetos `String` son **inmutables**, es decir, sus valores **no cambian**; los métodos devuelven **nuevas cadenas**.