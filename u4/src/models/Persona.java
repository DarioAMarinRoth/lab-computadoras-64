package models;

public class Persona {
    private String nombre;
    private int edad;
    public String colorDeOjos;

    public Persona(String nombre, int edad, String colorDeOjos) {
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
}
