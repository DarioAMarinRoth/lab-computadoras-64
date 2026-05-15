
void main() {

    IO.println("El siguiente comentario muestra la sintaxis para declarar variables en Java");

    // Sintaxis:
    // <tipo de dato> <identificador>;
    
    // Los identificadores de las variables deben estar escritos en camelCase.

    IO.println("Declaremos e inicialicemos una variable");

    int variableEntera; // Declaración de una variable
    variableEntera = 0; // Inicialización (Asignación) de una variable

    IO.println("El proceso de declaración e inicialización se puede combinar en una sola línea");

    int otraVariable = 15; // Declaración e inicialización de una variable (en la misma línea).

    IO.println("Mostremos los valores de las variables variables:");

    IO.println("variableEntera: " + variableEntera);
    IO.println("otraVariable: " + otraVariable);

}