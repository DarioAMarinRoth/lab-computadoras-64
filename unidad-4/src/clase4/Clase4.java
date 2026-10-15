package clase4;

import clase2.Persona;

import java.util.ArrayList;
public class Clase4 {
    static void main() {

        // Setters: para asignar valores a atributos privados
        // Getters: para consultar valores atributos privados

        Persona unaPersona = new Persona("Fabricio");
        Persona otraPersona = new Persona("Fabian");

        // ArrayList -> lista
        ArrayList<Persona> miLista = new ArrayList<>() ; // Crear una lista

        miLista.add(unaPersona);
        miLista.add(otraPersona);
        miLista.add(new Persona("Romina"));

        for (int i = 0; i < miLista.size(); i++) {
            IO.println(miLista.get(i).getNombre());
        }
    }
}


// Crear una clase que se llame Informe.
// Los atributos de informe son:
// - ArrayList<Materia> materias
// Métodos:
// - agregarMateria(String nombre): agrega una materia a la lista
// - mostrarMaterias(): imprime todas las materias de la lista
// - mostrarAprobadas(): imprime solo las materias aprobadas
// - calcularPromedio(): retornar el promedio de todas las materias de la lista