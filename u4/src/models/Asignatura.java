package models;

public class Asignatura {
    String nombre;
    double calificacion;

    public boolean estaAprobada() {
        return calificacion >= 7;
    }
}
