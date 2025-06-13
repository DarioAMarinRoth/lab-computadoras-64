package conceptos.control;

import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {

        boolean exp0 = false;
        boolean exp1 = false;
        boolean exp2= false;
        boolean exp3 = false;
        // Selección simple (solo rama true)

//        System.out.println("la primer parte de mi programa");
//        if (exp) {
//            System.out.println("Estoy dentro del if");
//        }
//        System.out.println("La última parte de mi programa");

        // Selección doble

//        System.out.println("Comienzo del programa");
//        if (exp0) {
//            System.out.println("La expresión resultó verdadera");
//        } else {
//            System.out.println("La expresión resultó falsa");
//        }
//        System.out.println("Fin del programa");

        // ifs anidados

        if (exp0) {
            System.out.println("La expresión 0 era verdadera");
        } else if (exp1){
            System.out.println("La expresión 1 era verdadera");
        } else if (exp2) {
            System.out.println("La expresión 2 era verdadera");
        } else if (exp3) {
            System.out.println("La expresión 3 era verdadera");
        }
    }
}
