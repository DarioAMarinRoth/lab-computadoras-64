package entidades;

import enums.TipoVehiculo;

import java.time.Instant;

public class Espacio {

    private static int ESPACIOS_CREADOS = 0;
    private final int numeroEspacio;
    private Vehiculo vehiculoEstacionado;
    private boolean ocupado;

    public Espacio() {
        numeroEspacio = ++ESPACIOS_CREADOS;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public int obtenerNumeroEspacio() {
        return numeroEspacio;
    }

    public boolean estacionarVehiculo(Vehiculo vehiculo) {
        if (!ocupado) {
            vehiculo.estacionar();
            vehiculoEstacionado = vehiculo;
            ocupado = true;
            return true;
        }
        return false;
    }

    public void liberarEstacionamiento() {
        if (ocupado) {
            vehiculoEstacionado = null;
            ocupado = false;
        }
    }

    public TipoVehiculo obtenerTipo() {
        return vehiculoEstacionado.obtenerTipo();
    }

    public int obtenerTiempoDeEstacionamiento() {
        long temp = Instant.now().getEpochSecond() - vehiculoEstacionado.obtenerHoraLlegada();
        return (int) temp % 60;
    }
}
