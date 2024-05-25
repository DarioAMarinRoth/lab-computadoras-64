Algoritmo NumeroMayor
	
	Definir i Como Entero;
	Definir mayorNumero Como Entero;
	Definir nuevoNumero Como Entero;
	Definir cantidadDeNumerosIngresados Como Entero;
	
	i = 0;
	Imprimir "Ingrese la cantidad de números que desee comparar";
	Leer cantidadDeNumerosIngresados;
	Imprimir  "Ingrese los números";
	Leer mayorNumero;
	
	
	Mientras i < cantidadDeNumerosIngresados - 1 Hacer
		Leer nuevoNumero;
		Si nuevoNumero > mayorNumero Entonces
			mayorNumero = nuevoNumero;
		FinSi
		i = i + 1;
	FinMientras
	
	Imprimir mayorNumero;
	
FinAlgoritmo
