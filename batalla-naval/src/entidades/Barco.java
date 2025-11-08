package entidades;

import enums.Orientacion;

public class Barco {
    private final int TAMAÑO;
    private Orientacion orientacion;

    public Barco() {
        this(3, Orientacion.HORIZONTAL);
    }

    public Barco(int SIZE, Orientacion orientacion) {
        this.TAMAÑO = SIZE;
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public boolean estaOrientado(Orientacion orientacion) {
        return this.orientacion.equals(orientacion);
    }

    public void rotar() {
        if (orientacion.equals(Orientacion.HORIZONTAL)) {
            orientacion = Orientacion.VERTICAL;
        } else {
            orientacion = Orientacion.HORIZONTAL;
        }
    }

    public int tamaño() {
        return TAMAÑO;
    }
}
