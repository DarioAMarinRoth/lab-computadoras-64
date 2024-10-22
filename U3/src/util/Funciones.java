package util;

public class Funciones {

    public static void main(String[] args) {
        System.out.println(minimoComunMultiplo(15, 10));
    }

    public static void imprimirVector(int[] fulano) {
        for (int elemento : fulano) {
            System.out.println(elemento);
        }
    }

    public static void imprimirVector(boolean[] vector) {
        for (boolean elemento : vector) {
            System.out.println(elemento);
        }
    }

    public static int minimoComunMultiplo(int num1, int num2) {
        int res = 2;
        int a = 1;
        if (num1 < num2) {
            while (res % num2 != 0) {
                res = num1 * a;
                a++;
            }
        }
        if (num2 < num1) {
            while (res % num1 != 0) {
                res = num2 * a;
                a++;
            }
        }

        return res;
    }

}
