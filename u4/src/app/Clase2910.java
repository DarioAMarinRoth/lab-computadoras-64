package app;

import enums.Color;
import models.Persona;

import java.util.ArrayList;

public class Clase2910 {
    public static void main(String[] args) {
        // ArraysLists
        // Enums
        // Exceptions

        ArrayList<Persona> miLista = new ArrayList<>();

        Persona unaPersona = new Persona("Fulano", 20, Color.MARRON);
        Persona otraPersona = new Persona("Mengano", 21, Color.MARRON);
        Persona unaTerceraPersona = new Persona("Mafalda", 22, Color.AZUL);

        try {
            unaTerceraPersona.setEdad(-20);
            int a = 1;
            int b = 1;
            System.out.println(b / a);
        } catch (IllegalArgumentException error) {
            System.out.println("Sucedió una excepción y se capturó con éxito");
            System.out.println("Ingresaste una edad que no correspondía.");
        } catch (ArithmeticException err) {
            System.out.println("Dividiste por cero");
        } catch (RuntimeException err) {
            System.out.println("Error desconocido");
        }


        System.out.println(unaTerceraPersona);

    }
}
