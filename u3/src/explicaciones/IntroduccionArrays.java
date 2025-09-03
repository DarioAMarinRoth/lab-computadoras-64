package explicaciones;

import java.util.Scanner;

import static utils.Funciones.imprimirVector;

public class IntroduccionArrays {
    public static void main(String[] args) {
//
//        int[] a;                // La declaración de una variable del tipo int array
//        a = new int[50];         // Creación de un array de enteros de 5 elementos.
//
//        // Llenar todos los elementos de mi array manualmente
//
//        a[0] = 1;
//        a[1] = 10;
//        a[2] = 100;
//        a[3] = 1000;
//        a[4] = 10000;
//
//        // Mostrar los elementos del array manualmente
//
//        System.out.println("El array entero es: ");
//        System.out.print(a[0] + " ");


//        // Llenar el array con entrada de teclado
//
//        int[] b = new int[5];
//        Scanner ent = new Scanner(System.in);
//
//        System.out.println("Ingrese 5 valores: ");
//        b[0] = ent.nextInt();
//        b[1] = ent.nextInt();
//        b[2] = ent.nextInt();
//        b[3] = ent.nextInt();
//        b[4] = ent.nextInt();
//
//    // Mostrar los elementos del array manualmente
//
//        System.out.println("El array entero es: ");
//        System.out.print(b[0] + " ");
//        System.out.print(b[1] + " ");
//        System.out.print(b[2] + " ");
//        System.out.print(b[3] + " ");
//        System.out.print(b[4] + " ");

        // Automatizar la carga de un array:
//
//        int size = 5;
//        int[] c = new int[size];
//
//
//        System.out.println("Ingrese n valores: ");
//        for (int i = 0; i < c.length; i++) {
//            c[i] = ent.nextInt();
//        }
//
//        // Automatiza la impresión del array
//
//        System.out.println("El array que ingresó es: ");
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }


        // Inicializar un array directamente con sus elementos

        int[] d = {1, 12, 13, 4, 5, 6, 10, 15, 1, 10};
        System.out.println("El array que ingresó es: ");
        imprimirVector(d);
    }
}
