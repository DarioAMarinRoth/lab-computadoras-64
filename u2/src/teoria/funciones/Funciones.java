package teoria.funciones;

public class Funciones {

    int numeroIngresado = 1;

    public static void saludar(String nombreSaludado) {
        System.out.println("Esta es la función saludar.");
        System.out.println("Hola " + nombreSaludado + "!");
    }

    public static boolean esPar(int numero){
        boolean esPar;
        esPar = numero % 2 == 0;
        return esPar;
    }

}
