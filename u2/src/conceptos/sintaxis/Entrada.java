package conceptos.sintaxis;

import java.io.IOException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws IOException {
//        int a = System.in.read();
//        int b = System.in.read();
//        int c = System.in.read();
//        int d = System.in.read();
//
//        System.out.println("Lo que usted leyó de consola fue:");
//        System.out.println();
//        System.out.print((char)a);
//        System.out.print((char)b);
//        System.out.print((char)c);
//        System.out.print((char)d);


        // La manera estándar

        System.out.println("Ingrese un número");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        System.out.println("El número que usted ingresó fue: " + num);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Su nombre es: " + nombre);
    }
}
