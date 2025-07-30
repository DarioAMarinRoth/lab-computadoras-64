package conceptos.metodos;

public class PrimerosMetodos {
    public static void main(String[] args) {
        int a = incrementarEnDos(1);
        System.out.println(a);

//        int a = 2;
//        int b = 3;
//        imprimirSuma(1,1);
//        int c;
//        miMetodo();
//        c = a + b;
//        System.out.println(c);
    }

    public static void miMetodo() {
        int a = 10;
        int b = 1;
        System.out.println(a + b);
    }

    public static void imprimirSuma(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int incrementarEnDos(int valor) {
        int valorIncrementado = valor + 2;
        return valorIncrementado;
    }

}
