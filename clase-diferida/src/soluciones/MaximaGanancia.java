package soluciones;

public class MaximaGanancia {
    public static int maximaGanancia(int[] precios) {
        int diaDeCompra = 0;
        int gananciaActual;
        int maximaGanancia = 0;

        for (int i = 0; i < precios.length; i++) {
            gananciaActual = precios[i] - precios[diaDeCompra];
            if (gananciaActual > maximaGanancia) {
                maximaGanancia = gananciaActual;
            }

            if (gananciaActual < 0) {
                diaDeCompra = i;
            }
        }

        return maximaGanancia;
    }
}
