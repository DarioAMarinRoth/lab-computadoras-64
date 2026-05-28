void main() {

    // Repetir

    // - While
    // - do-while
    // - for

    int contador = 0;
    int num;
    int acumulador = 0;

    num = Integer.parseInt(IO.readln("ingrese un número entero para calcular su tabla de multiplicar: "));
    IO.println();

    while (contador <= 10) {

        contador++; // Forma de incrementar más compacta
        if (contador == 5 || contador == 7) {
            System.out.println("nos saltamos el 5 y el 7");
            continue;
        }

        IO.println(num * contador);

    }


//    do {
//        num = Integer.parseInt(IO.readln("ingrese un número entero: "));
//        acumulador += num;
//        contador++; // Forma de incrementar más compacta
//    } while (contador < 3);

    System.out.println("El total acumulado es: " + acumulador);



    //

}