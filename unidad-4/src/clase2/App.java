import clase2.Persona;

void main() {

    // Varaibles que admiten objetos del tipo Persona

    Persona persona1;   // Declaramos la variable
    Persona persona2 = new Persona("Fernando", 18, 1.7);

    persona1 = new Persona(); // Creando un objeto del tipo Persona y guardándolo en la variable persona1.


    persona2.mostrarInformacion();
    persona1.mostrarInformacion();

}