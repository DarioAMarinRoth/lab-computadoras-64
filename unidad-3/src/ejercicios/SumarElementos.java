void main() {
    int[] vector = {1, 10, 100, 1000, 10000, 100000, 1000000};
    int[] otroVector = {1, 2, 3};
    IO.println(sumar(vector));
    IO.println(sumar(otroVector));

}

int sumar(int[] argumento) {
    int i = 0;
    int suma = 0;
    while (i < argumento.length) {
        int valor = argumento[i];
        suma = suma + valor;
        i++;
    }
    return suma;
}