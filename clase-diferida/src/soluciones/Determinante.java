package soluciones;

public class Determinante {
    // A: una matriz cuadrada de enteros de orden n
    public static int determinante(int[][] A) {
        int n = A.length;

        if (n == 1) {
            return A[0][0];
        }

        if (n == 2) {
            return A[0][0] * A[1][1] - A[0][1] * A[1][0];
        }

        int determinante = 0;
        // Método de los cofactores
        for (int i = 0; i < n; i++) {
            determinante += A[0][i] * calcularCofactor(0, i, A);
        }
        return determinante;
    }

    public static int calcularCofactor(int i, int j, int[][] A) {
        return (int) Math.pow(-1, i + j) * determinante(matrizMenor(A, i, j));
    }

    public static int[][] matrizMenor(int[][] A, int fila, int columna) {
        int n = A.length;
        int[][] M = new int[n - 1][n - 1];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (i == fila) {
                continue;
            }
            int l = 0;
            for (int j = 0; j < n; j++) {
                if (j == columna) {
                    continue;
                }
                M[k][l] = A[i][j];
                l++;
            }
            k++;
        }
        return M;
    }

}