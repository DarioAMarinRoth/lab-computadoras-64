package models;

import enums.Color;

public class Persona {
    private String nombre;
    private int edad;
    public Color colorDeOjos;

    public Persona(String nombre, int edad, Color colorDeOjos) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorDeOjos = colorDeOjos;
    }

    public Persona(){}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorDeOjos='" + colorDeOjos + '\'' +
                '}';
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}
