package conceptos.control;

public class Iteracion {

    public static void main(String[] args) {

        int num = 0;

        System.out.println("El comienzo del programa");
        while (num < 10) {
            num++; // num++ ó ++num Peeeeeeeeero num++ != ++num
            if (num == 5 || num == 7) {
                continue;
            }
            System.out.println("Estoy adentro del loop. Voy por la iteración N° " + num);
        }
        System.out.println("Terminó el programa");

    }
}
