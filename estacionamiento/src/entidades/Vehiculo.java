package entidades;

import enums.TipoVehiculo;

import java.time.Instant;

public class Vehiculo {
    private final TipoVehiculo TIPO;
    private long horaLlegada;



    public Vehiculo(TipoVehiculo tipo) {
        this.TIPO = tipo;
    }

    protected boolean esTipo(TipoVehiculo tipo) {
        return tipo.equals(this.TIPO);
    }

    protected void estacionar() {
        horaLlegada = Instant.now().getEpochSecond();
    }

    protected long obtenerHoraLlegada() {
        return horaLlegada;
    }

    protected TipoVehiculo obtenerTipo() {
        return TIPO;
    }

}
