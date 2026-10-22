package clase6;

public class Persona {
    private String nombre;
    private int dni;
    private EstadoCivil estadoCivil;
    private static int personasRegistradas;

    public Persona(String nombre, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        personasRegistradas++;
        dni = personasRegistradas;
    }

    public boolean estaSoltero() {
        return estadoCivil.equals(EstadoCivil.soltero) ;
    }

    public int getDni() {
        return dni;
    }

    public static int devolverPersonasRegistradas() {
        return personasRegistradas;
    }
}
