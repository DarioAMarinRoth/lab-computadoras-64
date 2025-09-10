package test;

import static utils.Funciones.imprimirVector;

public class Test {
    public static void main(String[] args) {
        int[] arr = {53, 36, 17, 56, 40, 51, 3, 49, 55};
        imprimirVector(arr);
        ordenarVector(arr);
        System.out.println();
        imprimirVector(arr);
    }


    public static void ordenarVector(int[] vector) {
        int b;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                b = vector[i];
                vector[i] = vector[i + 1];
                vector[i + 1] = b;
                i = 0;
            }
        }
    }
}
