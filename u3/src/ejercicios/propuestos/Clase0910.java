package ejercicios.propuestos;

// Crear un vector de tamaño N y llenarlo de forma automática con números aleatorios e
// imprimir el vector. Colocar los elementos pares en las primeras coordenadas del vector y los
// impares en las últimas. Luego, ordenar los elementos pares e impares de menor a mayor. Para
// finalizar, imprimir el vector modificado.
// Aclaración: se debe trabajar con un único vector.

import java.util.Scanner;
import static utils.Funciones.*;

public class Clase0910 {

    // [x] Hacer que el usuario ingrese la dimensión del vector.
    // [x] Generar el vector.
    // [x] Imprimir el vector.
    // [x] Colocar pares al comienzo e impares al final.
    // [] Ordenar pares e impares de menor a mayor.
    // [] Imprimir el vector.

    public static void main(String[] args) {

        int dimension;
        Scanner ent = new Scanner(System.in);
        int[] vector;
        int min = 1;
        int max = 10;

        System.out.println("Ingrese la dimensión del vector: ");
        dimension = ent.nextInt();

        vector = vectorAleatorio(dimension, min, max);
        System.out.println();
        imprimirVector(vector);
        subirPares(vector);
        System.out.println();
        imprimirVector(vector);

    }

}
