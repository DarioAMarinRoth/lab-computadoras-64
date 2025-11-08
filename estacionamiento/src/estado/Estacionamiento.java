package estado;

import entidades.Espacio;
import entidades.Vehiculo;
import enums.TipoVehiculo;

import java.util.ArrayList;

public class Estacionamiento {
    // Atributos
    private ArrayList<Espacio> espacios;
    private int espaciosOcupados;
    private final int CAPACIDAD_MAXIMA;
    private final int TARIFA_MOTO;
    private final int TARIFA_ESTANDAR;



    public Estacionamiento(ArrayList<Espacio> espacios, int tarifaMoto, int tarifaEstandar) {
        this.espacios = espacios;
        TARIFA_MOTO = tarifaMoto;
        TARIFA_ESTANDAR = tarifaEstandar;
        CAPACIDAD_MAXIMA = espacios.size();
    }

    public int obtenerCostoAcumulado(int numeroEstacionamiento) {
        Espacio elEspacio = espacios.get(numeroEstacionamiento - 1);
        if (elEspacio.obtenerTipo().equals(TipoVehiculo.MOTO)) {
            return TARIFA_MOTO * elEspacio.obtenerTiempoDeEstacionamiento();
        } else {
            return TARIFA_ESTANDAR * elEspacio.obtenerTiempoDeEstacionamiento();
        }
    }

    public boolean estacionarVehiculo(Vehiculo vehiculo) {
        if (espaciosOcupados == CAPACIDAD_MAXIMA) {
            return false;
        }

        for (Espacio unEspacio : espacios) {
            if (!unEspacio.estaOcupado()) {
                unEspacio.estacionarVehiculo(vehiculo);
                espaciosOcupados++;
                break;
            }
        }
        return true;
    }

    public void liberarEstacionamiento(int numeroEstacionamiento) {
        espacios.get(numeroEstacionamiento - 1).liberarEstacionamiento();
        espaciosOcupados--;
    }


}
