package conceptos.sintaxis;

public class SalidaEstandar {

    public static void main(String[] args) {

        // El objeto que representa la salida estándar es 'out'
        // que está en la clase System

        // En total hay tres métodos para imprimir:
        // - print(): Imprime un mensaje.
        // - println(): Imprime un mensaje y agrega un salto de línea y un retorno de carro.
        // - printf(): Imprime un mensaje con un formato especificado. Lo vemos en la unidad 3.

        // Sin salto de línea
        System.out.print("Hola, ");
        System.out.print("como estás?\n");

        // Con salto de línea
        System.out.println(); // Deja una separación con respecto al mensaje anterior
        System.out.println("Hola, ");
        System.out.println("cómo estás?");

    }
}
