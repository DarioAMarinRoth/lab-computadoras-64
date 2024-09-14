package teoria;

public class Vectores {
    public static void main(String[] args) {

        /* Tarea: Realizar una función que reciba como parámetro de entrada un vector y que imprima todos sus elementos en la consola.
        * Realizar una función que permita ingresar:
        * - Un número entero: min
        * - un número entero: max
        * - un número entero: n
        * La función debe devolver un vector de enteros de dimensión `n` con valores aleatorios entre min y max.
        */

        int n = 15;
        int[] vector = new int[n];
        vector[0] = 1;
        vector[1] = 15;
        vector[2] = 33;

        int i = 0;

        System.out.println(vector[i++]);
        System.out.println(vector[i++]);
        System.out.println(vector[i++]);

        int dim = vector.length;
        System.out.println(dim);

        System.out.println(vector);


    }
}
