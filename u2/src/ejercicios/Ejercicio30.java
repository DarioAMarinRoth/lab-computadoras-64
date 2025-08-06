
package ejercicios;

import static utilidades.Funciones.potencia;

public class Ejercicio30 {

    public static void main(String[] args) {
        System.out.println(deBinarioADecimal(1001010111));
    }

    public static int deBinarioADecimal(int binario) {
        int decimal = 0;
        int base = 10;
        int i = 0;

        while (binario != 0) {
            int digito = binario % base;
            binario = binario / base;
            decimal += (int) (digito * potencia(2, i));
            i++;
        }
        return decimal;
    }
}
