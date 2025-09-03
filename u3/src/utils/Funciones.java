package utils;

import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

public class Funciones {

    public static void imprimirVector(int[] vector){
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
}
