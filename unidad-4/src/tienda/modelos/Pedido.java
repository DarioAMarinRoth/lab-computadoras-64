package tienda.modelos;

import java.util.ArrayList;

public class Pedido {

    private String cliente;
    private ArrayList<Producto> productos;

    public Pedido(String cliente) {
        this.cliente = cliente;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total = total + productos.get(i).getPrecio();
        }
        return total;
    }
}
