package app;

import entidades.Espacio;
import entidades.Vehiculo;
import enums.TipoVehiculo;
import estado.Estacionamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Espacio> espacios = new ArrayList<>();
        espacios.add(new Espacio());
        espacios.add(new Espacio());
        espacios.add(new Espacio());
        Estacionamiento estacionamiento = new Estacionamiento(espacios, 1, 2);
        estacionamiento.estacionarVehiculo(new Vehiculo(TipoVehiculo.VEHICULO_ESTANDAR));
        estacionamiento.estacionarVehiculo(new Vehiculo(TipoVehiculo.MOTO));
        ent.nextInt();
        System.out.println(estacionamiento.obtenerCostoAcumulado(1));
        System.out.println(estacionamiento.obtenerCostoAcumulado(2));
    }
}
