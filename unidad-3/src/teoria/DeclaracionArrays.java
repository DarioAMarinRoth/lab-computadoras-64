void main() {
    int[] miArreglo;        // Declaramos una variable del tipo array
    miArreglo = new int[12]; // Creamos un array de 5 elementos

    int[] otroArreglo = new int[6];
    String apellido;

    int miVariable = 7;
    int indice = 0;

    while (indice < miArreglo.length) {
        IO.println("El indice ahora vale : " + indice);
        IO.println("El array en la coordenada " + indice + " Es " + miArreglo[indice]);
        indice++;
    }

    // Ejercicio 1:

    // Escribir un programa donde declaren un array del tipo String que
    // tenga dos elementos. En el primer elemento guarden su nombre
    // En el segundo elemento guarden el apellido.

    // Impriman el array

    // Ejercicio 2:
    // Escribir un programa donde se declare un vector de enteros de
    // 8 elementos. Deje que el usuario ingrese en cada elemento del vector
    // un dígito de su dni.

    // Al finalizar, imprima el dni completo.

}