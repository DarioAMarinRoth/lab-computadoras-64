package app;


import entidades.Barco;
import entidades.Tablero;
import enums.Orientacion;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.colocarBarco(new Barco(2, Orientacion.HORIZONTAL), 3, 2);
        tablero.colocarBarco(new Barco(3, Orientacion.VERTICAL), 5, 1);
        tablero.colocarBarco(new Barco(4, Orientacion.HORIZONTAL), 0, 0);
        tablero.recibirAtaque(9, 9);
        tablero.recibirAtaque(0, 0);

        tablero.mostrarTablero();
    }
}
