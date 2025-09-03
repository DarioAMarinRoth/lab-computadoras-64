package explicaciones;

import static utils.Funciones.imprimirMatriz;

public class Matrices {
    public static void main(String[] args) {

        int[][] miMatriz = new int[5][3];
        miMatriz[2][1] = 100;
        imprimirMatriz(miMatriz);
    }
}
