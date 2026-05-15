# Variables y tipos de dato

## Tipos de dato

### Repaso de los tipos de dato que usábamos en pseudocódigo

- **Entero:** números sin parte decimal.
- **Racional:** números que admiten parte decimal.
- **Lógico:** estados booleanos (ON/OFF, V/F, etc).
- **Cadena:** cadenas de texto alfanuméricas.

### Tipos de dato que existen en java 

#### Tipos de dato enteros

- `byte`: 8 bits
- `short`: 16 bits
- `int`: 32 bits
- `long`: 64 bits

> [!NOTE] 
> En la materia normalmente utilizaremos `int` como tipo de dato entero.

#### Tipos de dato de punto flotante (racionales)

- `float`: 32 bits
- `double`: 64 bits

> [!NOTE] 
> En la materia utilizaremos `double` como tipo de dato racional/real.

#### Otros tipos de dato

- `boolean`: *`true`* o *`false`*
- `char`: caracteres ASCII (8 bits). Se escriben entre comillas simples `' '`.
- `String`: Cadenas de texto. Se escriben entre comillas dobles `" "`.

> [!WARNING] 
> `String` no es un tipo de dato como tal pero lo usaremos como si lo fuera (por el momento).

---

## Variables

La sintaxis para declarar variables en java es idéntica a la que utilizábamos en pseudocódigo.

```plain
<tipo de dato> <identificador>;
```

Hay ejemplos de declaración de variables en el archivo [TiposDeDato.java](../src/teorias/TiposDeDato.java)

### Nomenclatura de identificadores y reglas de estilo

#### Reglas léxicas

Los compiladores no aceptan cualquier secuencia de caracteres para un identificador. Existen ciertas reglas que deben verificarse para definir un identificador válido:

- Un identificador debe comenzar obligatoriamente con alguno de los siguientes:
  - Una letra
  - Un guión bajo `_`
  - Un signo de dólar `$`.
  > [!CAUTION] 
  > Un identificador **NO** puede comenzar con un número.
- No se pueden utilizar palabras reservadas del lenguaje como identificadores. Por ejemplo: `int`, `class`, `public`, `if`, `while`, `return`, etc.
- Un identificador no puede incluir espacios en blanco.
- Los identificadores pueden contener solo letras, números, `_` y `$`. El uso de cualquier otro símbolo matemático, de puntuación o especial (`@`, `-`, `#`, `+`, `&`, `.`, etc.) es inválido.

#### Tipos de nomenclatura

Existen varias maneras de escribir un identificador. Las estandarizadas son:

- **camelCase:** todas las palabras que conforman el identificador se escriben pegadas y en minúscula. La inicial de cada palabra se escribe en mayúscula a excepción de la primer letra del identificador que también va en minúscula. Ejemplo: Laboratorio de computadoras electronicas → `laboratorioDeComputadorasElectronicas`.
- **PascalCase:** Igual que camelCase pero con la primer letra del identificador también en mayúscula.  Ejemplo: Laboratorio de computadoras electronicas → `LaboratorioDeComputadorasElectronicas`.
- **snake_case:** Se escribe todo en minúscula y cada palabra se separa con un guión bajo.  Ejemplo: Laboratorio de computadoras electronicas → `laboratorio_de_computadoras_electronicas`.
- **UPPER_SNAKE_CASE:** Igual que snake_case pero todo en mayúsculas. Ejemplo: Laboratorio de computadoras electronicas → `LABORATORIO_DE_COMPUTADORAS_ELECTRONICAS`.

#### Reglas de estilo

Si bien el compilador aceptará cualquier tipo de identificador que no incumpla ninguna restricción, existen ciertas reglas de estilo entre los programadores de un lenguaje para facilitar la colaboración, mejorar la legibilidad, optimizar el mantenimiento, etc. Actualmente hay dos convenciones de estilo para java, las originales de [oracle](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html) y las convenciones de [google](https://google.github.io/styleguide/javaguide.html). No importa cual elijan mientras sigan una convención. A continuación, se muestra una tabla con las nomenclaturas asignadas a distintos tipos de identificadores.

| Tipo de Identificador | Convención | Ejemplo |
| :--- | :--- | :--- |
| **Clases y archivos .java** | PascalCase | `MiClase` |
| **Funciones/Métodos** | camelCase | `miFuncion()` |
| **Variables** | camelCase | `intentosRestantes` |
| **Constantes** | UPPER_SNAKE_CASE | `MAX_CONEXIONES` |
