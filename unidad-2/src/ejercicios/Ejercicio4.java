void main() {
    String nombre = IO.readln("Ingrese su nombre: ");
    int edad = Integer.parseInt(IO.readln("Ingrese su edad: "));
    double altura = Double.parseDouble(IO.readln("Ingrese su altura: "));

    IO.println("Mi nombre es " + nombre + " tengo " + edad + " años y mido " + altura + " metros");

}