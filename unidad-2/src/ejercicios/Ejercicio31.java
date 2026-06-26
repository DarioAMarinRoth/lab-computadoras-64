void main() {
    double valor = 10;
    IO.println(raizCuadrada(valor));
    IO.println(Math.sqrt(valor));
}

// <tipo de retorno> <identificador> (<parametros>) {...}

double raizCuadrada(double x) {

    double b = x;   // Base de mi rectángulo
    double h = 1;   // La altura de mi rectángulo

    // Juntas construyen un rectángulo de area x.


    while (!(sonIguales(b, h))) {
        b = (b + h) / 2;
        h = x / b;
    }

    // La base es igual a la altura y por lo tanto
    // El rectángulo se transformó en un cuadrado.

    return b;
}

boolean sonIguales(double x, double y) {
    double dif = x > y ? x - y : y - x;
    double tol = 0.000001;
    return dif <= tol;
}