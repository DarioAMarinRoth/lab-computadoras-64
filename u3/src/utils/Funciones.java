package utils;

import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

public class Funciones {

    public static void imprimirVector(int[] vector) {
        for (int elemento : vector) {   // For-each o for mejorado
            System.out.print(elemento + " ");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("%-18d ", elemento);
            }
            System.out.println();
        }
    }

    public static int[] vectorAleatorio(int dimension, int min, int max) {
        int[] vectorAleatorio = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vectorAleatorio[i] = enteroAleatorio(min, max);
        }
        return vectorAleatorio;
    }

    public static int enteroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void subirPares(int[] vector) {
        int j = -1;
        for (int i = 0; i < vector.length; i++) {
            if (esPar(vector[i])) {
                int temp = vector[j + 1];
                vector[j + 1] = vector[i];
                vector[i] = temp;
                j++;
            }
        }
    }
}
