# TEORÍA PARA EXAMEN

Los __checked__ exceptions:
- o se capturan con `try-cath` 
- o se declaran con `throws` 

ejemplo típico:
<br>
_FileNotFoundException_

No se propagan automáticamente (a diferencia de las unchecked)

✅ Opción 1: Propagar la excepción
```js
public static void writeHello(String nomF) throws FileNotFoundException {
    PrintWriter pw = new PrintWriter(new File(nomF));
    pw.println("Hello!!!");
}
```

✅ Opción 2: Manejarla con try-catch
```js
public static void writeHello(String nomF) {
    try {
        PrintWriter pw = new PrintWriter(new File(nomF));
        pw.println("Hello!!!");
    } catch (FileNotFoundException e) {
        System.out.println("Error: fitxer no trobat");
    }
}
```

---

## 🧱 Estructura de `try-catch` en Java
```js
try {
    // 1. Código que puede lanzar una excepción
    // si ocurre un error → salta al catch
} catch (TipoExcepcion e) {
    // 2. Código que maneja la excepción
} finally {
    // 3. (Opcional) Código que SIEMPRE se ejecuta
}
```

🎯 Resumen tipo examen
- __Capturar__ → usar `try-catch` (gestionar excepción)
- __Propagar__ → usar `throws` (pasarle a otro método que lo gestione)
- __Abortar__ → no hacer nada → el programa falla