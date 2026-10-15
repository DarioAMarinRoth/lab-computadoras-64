package tienda.modelos;

public class Producto {

    // Atributos

    private String nombre;
    private double precio;

    // Métodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 1;
            return;
        }
        this.precio = precio;
    }

    public void mostrarInformacion() {
        IO.println("Nombre: " + nombre);
        IO.println("Precio: $" + precio);
    }

    public void aplicarDescuento(double descuento) {
       precio *= (1 - descuento / 100);
    }

}
