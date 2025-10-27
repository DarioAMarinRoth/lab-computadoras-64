package models;

public class Estudiante {

    String nombre;
    Asignatura[] materias;
    int dni;

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < materias.length ; i++) {
            suma += materias[i].calificacion;
        }
        return suma / materias.length;
    }

    public void estadoDeLasAsignaturas() {
        for (int i = 0; i < materias.length ; i++) {
            System.out.printf("Materia: %s, Aprobada: %b\n", materias[i].nombre, materias[i].estaAprobada());
        }
    }

    public Estudiante() {
        nombre = "";
        System.out.println("Se creó un objeto del tipo Estudiante");
    }

    public Estudiante(int cantidadDeMaterias) {
        materias = new Asignatura[cantidadDeMaterias];
    }

    public Estudiante(int dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
    }


}
