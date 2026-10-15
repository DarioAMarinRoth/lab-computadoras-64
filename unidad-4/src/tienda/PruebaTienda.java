package tienda;

import tienda.modelos.Pedido;
import tienda.modelos.Producto;

public class PruebaTienda {
    static void main() {
        Pedido miPedido = new Pedido("Fulano");

        Producto producto1 = new Producto();
        producto1.setNombre("Leche");
        producto1.setPrecio(3000);

        Producto producto2 = new Producto();
        producto2.setNombre("Queso");
        producto2.setPrecio(10000);

        Producto producto3 = new Producto();
        producto3.setNombre("Cereal");
        producto3.setPrecio(1000);

        miPedido.agregarProducto(producto1);
        miPedido.agregarProducto(producto2);
        miPedido.agregarProducto(producto3);

        IO.println(miPedido.calcularTotal());;

    }
}
