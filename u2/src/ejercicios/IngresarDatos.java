package ejercicios;

import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre;
        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(ent.nextLine());
        System.out.println("Ingrese su altura");
        altura = Double.parseDouble(ent.nextLine());
        System.out.println("Ingrese su nombre");
        nombre = ent.nextLine();

        System.out.println("Me llamo " + nombre + ", mido " + altura + " y tengo " + edad);
    }
}
