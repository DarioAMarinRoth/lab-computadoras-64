package ejercicios;

import static teoria.funciones.Funciones.*;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        double promedio;
        int numeroIngresado;
        int totalNumerosIngresados = 10;
        int cantidadDePares = 0;
        double sumaPares = 0;
        int i;

        Scanner ent = new Scanner(System.in);

        for (i = 0; i < totalNumerosIngresados; i++) {
            System.out.println("Ingrese un número entero: ");
            numeroIngresado = ent.nextInt();

            if (esPar(numeroIngresado)) {
                cantidadDePares++;
                sumaPares += numeroIngresado;
            }
        }
        promedio = sumaPares / cantidadDePares;
        System.out.println(promedio);
    }


}
