void main() {

    int[] dni1 = {4, 0, 0, 0, 0, 0, 0, 0};
    int[] dni2 = {4, 0, 0, 0, 0, 0, 0, 1};
    int[] dni3 = {4, 0, 0, 0, 0, 0, 0, 2};
    int[] vectorPrueba = {1, 2, 3};
    int[] ficticio = {1, 1, 1, 1, 1, 1};



//    IO.println("El dni ingresado es: ");
//

    IO.println("El vector prueba tiene " + ficticio.length +" elementos" );

    imprimirVector(dni1);
    imprimirVector(vectorPrueba);
    imprimirVector(ficticio);

}

void imprimirVector(int[] vector) {

    for (int coordenada = 0; coordenada < vector.length; coordenada++) {
        IO.print(vector[coordenada]);
    }
    IO.println();
}

// Dejar que el usuario cargue un vector de n elementos. Luego calcular e imprimir la suma de
// todos los elementos.

// Realizar una función que reciba un vector de enteros y que DEVUELVA la suma de sus elementos.
