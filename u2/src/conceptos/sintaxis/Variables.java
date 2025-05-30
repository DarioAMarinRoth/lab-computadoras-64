package conceptos.sintaxis;

public class Variables {
    public static void main(String[] args) {
        // Sintaxis para declarar una variable:
        // <tipo de dato/Objeto> <identificador> ;
        // * IMPORTANTE: las variables se escriben en camelCase.
        // ! No vamos a usar float. Usaremos 'double' en su lugar.

        // Declaraciones de variables:

        int miEntero;
        double miFlotante;
        boolean miBoolean;
        char miChar;

        String miString;

        // Inicializar las variables (con el comando de asignación)

        miEntero = 4;
        miFlotante = 3.14;
        miBoolean = true;
        miChar = '%';

        miString = "hola";

        // Constantes:
        // * Las constantes se escriben con UPPER_SNAKE_CASE

        final double VELOCIDAD_DE_LA_LUZ_EN_EL_VACIO = 299792458;




    }
}
