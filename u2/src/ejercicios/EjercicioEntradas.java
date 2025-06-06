package ejercicios;

import java.util.Scanner;

public class EjercicioEntradas {
    /*
    Diseñe un programa que permita cargar: la altura, la edad y el nombre del usuario
    exactamente en ese orden, y que luego imprima toda la información del usuario en la
    consola.
     */

    // Import para el scanner: import java.util.Scanner;

    public static void main(String[] args) {
        String nombre;
        int edad;
        double altura;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su altura:");
        altura = entrada.nextDouble();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();

        System.out.println("RESULTADOS:");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);

    }
}
