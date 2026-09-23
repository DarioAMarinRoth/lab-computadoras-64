package clase2;

public class Persona {

    // Las características -> Atributos
    // Información de los objetos (preferentemente oculta)

    public String nombre;
    public int edad;
    public double altura;

    // Los comportamientos -> Métodos

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void saludar() {
        IO.println("Hola! soy " + nombre);
    }

    public void mostrarInformacion() {
        IO.println("Nombre: " + nombre);
        IO.println("Edad: " + edad);
        IO.println("Altura: " + altura);
    }

}

// Tarea:

/*
* Crear una clase que se llame "Materia" con estos atributos:
* - String: nombre
* - int: nota
*
* Con los siguientes métodos:
*
* - Constructor sin argumentos
* - Constructor con nombre
* - Constructor con nombre y nota
*
* - resumen(): muestra el nombre y la nota de la materia
* - estaAprobada(): devolver true si la nota es mayor o igual a 7 y false en el caso contrario.
* */
