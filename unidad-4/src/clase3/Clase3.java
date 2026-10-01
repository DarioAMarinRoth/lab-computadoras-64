package clase3;

import clase2.Persona;

public class Clase3 {
    static void main() {
        Persona otraPersona = new Persona();

        otraPersona.asignarEdad(12); // Un método Setter
        IO.println(otraPersona.devolverEdad()); // Un método Getter
    }
}
