package ejercicios;

public class Ejercicio30 {

    public static void main(String[] args) {
        printMatrix(diagonales(1000));
    }

    public static int[][] diagonales(int n) {
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            int inicio = i + 1;
            for (int j = n - 1; j >= 0; j--) {
                resultado[i][j] = inicio++;
            }
        }

        return resultado;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%-5d", element);
            }
            System.out.println();
        }
    }
}
