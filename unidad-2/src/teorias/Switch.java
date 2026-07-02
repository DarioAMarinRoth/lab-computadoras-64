void main() {

    int codigo;
    codigo = Integer.parseInt(IO.readln("Ingrese el código de la entrada: "));



    while (codigo != 0) {
        // Switch solo soporta enteros, char, String
        switch (codigo) {
            case 1:
                IO.println("Toy story");
                break;
            case 2:
                IO.println("Toy story 2");
                break;
            case 3:
                IO.println("Toy story 3");
                break;
            case 4:
                IO.println("Toy story 4");
                break;
            case 5:
                IO.println("Toy story 5");
        }
        codigo = Integer.parseInt(IO.readln("Ingrese el código de la entrada: "));
    }


}