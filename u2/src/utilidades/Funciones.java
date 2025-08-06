package utilidades;

public class Funciones {

    // Modificar las declaraciones como crea necesario


    public static void main(String[] args) {

        System.out.println(potenciaRecursiva(10,5));
    }

    static double abs(double x) { // Función para el valor absoluto
        double resultado = x;
        if (x < 0) {
            resultado = x * -1;
        }
        return resultado;
    }

    static boolean sonIguales(double num1, double num2, double tolerancia) {
        return abs(num1 - num2) <= tolerancia;
    }

    public static double calcularRaizCuadrada(double argumento) {
        return calcularRaizCuadrada(argumento, 0.001);
    }

    public static double calcularRaizCuadrada(double argumento, double tolerancia) {
        double base = 2;
        double altura = argumento / base;
        while (!sonIguales(base, altura, tolerancia)) {
            base = (base + altura) / 2;
            altura = argumento / base;
        }
        return base;
    }

    public static double potencia(double base, int exponente) {
        int x = 0;
        double resultado = 1;
        while (x < exponente){
            resultado = resultado * base;
            x++;
        }
        return resultado;
    }

    public static double potenciaRecursiva(double base, int exponente) {
        if (exponente < 0) {
            base = 1 / base;
            exponente *= -1;
        }

        if (exponente == 0) {
            return 1;
        } else {
            return potenciaRecursiva(base, exponente - 1) * base;
        }
    }



}
