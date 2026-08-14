void main() {

    int[] dni = new int[8];


    for (int i = 0; i < 8; i++) {
        dni[i] = Integer.parseInt(IO.readln());
    }

    IO.println("El dni ingresado es: ");

    for (int i = 0; i < 8; i++) {
        IO.println(dni[i]);
    }

}