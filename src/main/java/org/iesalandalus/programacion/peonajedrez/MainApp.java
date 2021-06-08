package org.iesalandalus.programacion.peonajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Peon peon;
	
	public static void main(String[] args) {
			
		System.out.println("Hasta luego Lucas!!!!");
	}
	
	private static void mostrarPeon() {
		System.out.println(peon);		
	}
	
	private static void mostrarMenu() {
		System.out.println("Programa para aprender a colocar y mover un peón en el tablero de ajedrez");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("1-Crear Peón por defecto");
		System.out.println("2-Crear Peón por escogiendo el color");
		System.out.println("3-Crear Peón escogiendo el color y la columna inicial");
		System.out.println("4-Mover Peón");
		System.out.println("0-SALIR");
		
	}
	
	private static int elegirOpcion() {
		int numero;
		do {
			System.out.println("Elige una de estás opciones");
			numero = Entrada.entero();
			if (numero < 0 || numero > 4) {
				System.out.println("Introduce un numero correcto");
			}
		} while (numero < 0 || numero > 4);
		return numero;
	}
	
	private static Color elegirColor() {
	
	int colorPeon;
	Color color = null;
	do {
		System.out.println("Elige el color del peon");
		System.out.println("1.Blanco");
		System.out.println("2.Negro");
		colorPeon = Entrada.entero();
		if (colorPeon< 1 && colorPeon > 2) {
			System.out.println("Introduce una opcion correcta");
		}
	} while (colorPeon < 1 && colorPeon > 2);

	switch (colorPeon) {
	case 1:
		color = Color.BLANCO;
		break;

	case 2:
		color = Color.NEGRO;
		break;

	default:
		break;
	}

	return color;
}
	private static char elegirColumnaInicial() {
		char columna = 'a';
		char letraColumna;

		do {
			System.out.println("Elige la columna inicial");
			letraColumna = Entrada.caracter();
			if (letraColumna != 'c' && letraColumna != 'f')
				System.out.println("ERROR: Introduce una opción correcta");
		} while (letraColumna != 'c' && letraColumna != 'f');
		columna = letraColumna;
		return columna;
	}
	
	private static void mostrarMenuMovimientos() {
		System.out.println("0- Un paso adelante.");
		System.out.println("1- Dos pasos adelante");
		System.out.println("2- Avance a la izquierda");
		System.out.println("3- Avance a la derecha");
	}
	
	private static int elegirMovimiento() {
		
		int opcion;
		do 
		{
			System.out.print("Elige un movimiento (1 - 4): ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}
	
	
}
