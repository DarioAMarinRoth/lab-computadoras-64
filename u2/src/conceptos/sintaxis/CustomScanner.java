package conceptos.sintaxis;

import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {

        String cuentito = "3 tristes tigres \n tragaban trigo \n en un trigal";
        Scanner miScanner = new Scanner(cuentito);
        String linea = miScanner.nextLine();
        System.out.println(linea);
        linea = miScanner.nextLine();
        System.out.println(linea);
        linea = miScanner.nextLine();
        System.out.println(linea);
        miScanner.close();
    }
}
