void main() {
    IO.println(contadorBilletes(236));
}

int contadorBilletes(int monto) {
    int billetes100 = monto / 100;
    monto %= 100;   // Actualizamos el monto después de devolver

    int billetes20 = monto / 20;
    monto %= 20; // Actualizamos el monto después de devolver

    int billetes1 = monto;

    int totalBilletes = billetes1 + billetes20 + billetes100;
    return totalBilletes;
}