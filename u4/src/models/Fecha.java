package models;

public class Fecha {
    final int DIAS_EN_UN_AÑO = 360;
    final int DIAS_EN_UN_MES = 30;
    int dia;
    int mes;
    Año año;


    // Hipótesis:
    // El argumento siempre es una fecha en el futuro;
    // Todos los meses tienen 30 días.
    // El año tiene 30 * 12 = 360 días.

    public int diaHasta(Fecha fecha) {
        int dias = 0;
        dias += (this.año.año - fecha.año.año) * DIAS_EN_UN_AÑO;
        dias += Math.abs(this.mes - fecha.mes) * DIAS_EN_UN_MES;
        dias += Math.abs(this.dia - fecha.dia);
        return dias;
    }
}
