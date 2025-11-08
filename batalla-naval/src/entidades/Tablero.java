package entidades;

import enums.Orientacion;

import java.util.ArrayList;

public class Tablero {

    // Atributos
    private final static int TAMAÑO = 10;
    private int[][] cuadricula;
    private ArrayList<Barco> barcos;


    // Métodos
    public Tablero() {
        cuadricula = new int[TAMAÑO][TAMAÑO];
    }

    public void colocarBarco(Barco barco, int fila, int columna) {
        if (barco.estaOrientado(Orientacion.HORIZONTAL)) { // Fija la fila, se mueven las columnas
            for (int i = columna; i < columna + barco.tamaño(); i++) {
                cuadricula[fila][i] = 1;
            }
        } else {    // Fija la columna, se mueven las filas
            for (int i = fila; i < fila + barco.tamaño(); i++) {
                cuadricula[i][columna] = 1;
            }
        }
        barcos.add(barco);
    }

    public boolean recibirAtaque(int fila, int columna) {
        if (cuadricula[fila][columna] == 1) {
            cuadricula[fila][columna] = 2;
            return true;
        } else {
            cuadricula[fila][columna] = 3;
            return false;
        }
    }

    public void mostrarTablero() {
        for (int[] fila : cuadricula) {
            for (int elemento : fila) {
                System.out.printf("%3d", elemento);
            }
            System.out.println();
        }
    }

}
