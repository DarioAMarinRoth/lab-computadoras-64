package app;

import models.Persona;

import java.util.ArrayList;

public class Clase2910 {
    public static void main(String[] args) {
        // ArraysLists
        // Enums
        // Exceptions

        ArrayList<Persona> miLista = new ArrayList<>();

        Persona unaPersona = new Persona("Fulano", 20, "Marrones");
        Persona otraPersona = new Persona("Mengano", 21, "marrones");
        Persona unaTerceraPersona = new Persona("Mafalda", 22, "azules");

        miLista.add(unaPersona);
        miLista.add(otraPersona);
        miLista.add(unaTerceraPersona);
        miLista.add(new Persona("Susanita", 15, "marrón"));



        System.out.println(miLista.size());

        miLista.remove(unaTerceraPersona);

        System.out.println(miLista.size());

        for (Persona persona : miLista) {
            System.out.println(persona);
        }
    }
}
