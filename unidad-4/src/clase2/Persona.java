package clase2;

public class Persona {

    // Las características -> Atributos
    // Información de los objetos (preferentemente oculta)



    private String nombre;
    private int edad;
    private double altura;

    // Los comportamientos -> Métodos

    // Constructores
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


    // Métodos


    public void asignarEdad(int edad) {
        if (edad > 0) {         // Validación
            this.edad = edad;
        }
    }

    public int devolverEdad() {
        return edad;
    }

    public void saludar() {
        IO.println("Hola! soy " + nombre);
    }

    public void mostrarInformacion() {
        IO.println("Nombre: " + nombre);
        IO.println("Edad: " + edad);
        IO.println("Altura: " + altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
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
* - Un setter de nombre
* - Un setter de nota -> validar que la nota esté entre 1 y 10
* - Un getter de nombre
*
* - resumen(): muestra el nombre y la nota de la materia
* - estaAprobada(): devolver true si la nota es mayor o igual a 7 y false en el caso contrario.
* */
