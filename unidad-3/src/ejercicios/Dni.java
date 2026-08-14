void main() {
    // Declarar un vector
    // Crear un vector de cierto tamaño.
    // Darle valores al vector
    // Imprimir los elementos de un vector

    // <tipo> <identificador>

    int[] dni;
    dni = new int[100];

    // IO.readln() -> lee texto
    // Integer.parseInt("el texto a convertir") -> Convierte texto a int

    int coordenada = 0;

    while(coordenada < 15){
        dni[coordenada] = Integer.parseInt(IO.readln());
        coordenada++;
    }

    IO.println("El dni ingresado es: ");

    coordenada = 0;
    while (coordenada < 15) {
        IO.println(dni[coordenada]);
        coordenada++;
    }

}