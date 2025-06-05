package conceptos.sintaxis;

import java.awt.*;
import java.util.GregorianCalendar;

public class Objetos {

    public static void main(String[] args) {

        // Creación de objetos
        // <Clase> <identificador>

        Point miPunto;  // Declarar una variable para almacenar una referencia de un objeto.

        // Para crear un objeto es necesario un mét. especial:
        // El constructor. El mét. constructor se llama siempre igual que la clase.
        // Los constructores de una clase se invocan con una palabra reservada: new

        miPunto = new Point();  // Creando el objeto y almacenando su referencia en la variable "miPunto".
        GregorianCalendar miCalendario = new GregorianCalendar();
        Point otroPunto = new Point(2, 3);


    }
}
