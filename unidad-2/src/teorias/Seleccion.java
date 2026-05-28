// Estructuras
// - Secuencia
// - Selecciones -> if(...)-else
// - Iteraciones -> while(...)

void main() {

    int num = 6;

    if(num < 5) {
        IO.println("El numero es menor que 5");
    } else if(num < 7){
        IO.println("El numero es menor que 7");
    } else if(num < 9){
        IO.println("El numero es menor que 9");
    } else {
        IO.println("El numero es mayor o igual a 9");
    }

    IO.println("Otra instrucción");
}