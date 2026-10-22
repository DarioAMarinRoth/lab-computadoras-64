package clase6;

public class PruebaPersona {
    static void main() {
        Persona p1 = new Persona("pepito", EstadoCivil.soltero);
        Persona p2 = new Persona("pepito", EstadoCivil.soltero);
        Persona p3 = new Persona("pepito", EstadoCivil.soltero);
        Persona p4 = new Persona("pepito", EstadoCivil.soltero);
        Persona p5 = new Persona("pepito", EstadoCivil.soltero);
        Persona p6 = new Persona("pepito", EstadoCivil.soltero);
        Persona p7 = new Persona("pepito", EstadoCivil.soltero);
        Persona p8 = new Persona("pepito", EstadoCivil.soltero);


        IO.println(Persona.devolverPersonasRegistradas());
    }
}
