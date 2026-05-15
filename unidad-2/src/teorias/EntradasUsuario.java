

void main(){ // Inicio del programa

    /*
    * En pseudocódigo para leer un valor
    *
    * a = read();
    * read();
    *
    * */

    IO.println("Entrada de usuarios en Java");


    String miEntrada = IO.readln("Ingrese un texto de prueba: "); // Una entrada del usuario.

    IO.println("La entrada del usuario fue: " + miEntrada);

    //! Descomentar la linea de abajo genera un error de tipos.
//    int unNumero = IO.readln();
    /*
    * Transformar el String en un tipo de dato diferente se llama
    * PARSEAR.
    *
    * Por ejemplo, para parsear un String a un entero, se utiliza
    *                   Integer.parseInt(...);
    * La función transforma el argumento en un entero.
    * */

    // Ejemplo
    String auxiliar = IO.readln("Ingrese un numero entero: "); // El número en formato texto
    int num = Integer.parseInt(auxiliar); // El número en formato binario con signo (entero)

    int resultado = num + 3;
    IO.println("El resultado de la cuenta es " + resultado);

    /*
    * - Para parsear de texto a double: Double.parseDouble(...);
    * - Para parsear de texto a boolean: Boolean.parseBoolean(...);
    * */


    int numeroConvertido = Integer.parseInt(IO.readln("ingrese otro numero entero: "));
    IO.println("El numero ingresado fue: " + numeroConvertido);


} // Fin del programa