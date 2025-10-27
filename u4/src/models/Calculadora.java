package models;

public class Calculadora {


    int a;
    int b;

    public Calculadora(int a) {
        this.a = a;
    }

    public Calculadora(){}

    public static int sumarEnteros(int a, int b) {
        return a + b;
    }

    public static int sumarEnteros(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumarEnteros(int[] enteros) {
        int suma = 0;
        for (int entero : enteros) {
            suma += entero;
        }
        return suma;
    }
}
