package org.iesalandalus.programacion.peonajedrez;

import javax.naming.OperationNotSupportedException;


import org.iesalandalus.programacion.utilidades.Entrada;



public class MainApp {
	
	private static Peon peon;
	
	public static void main(String[] args) {
		int opcion;
	do {
		mostrarMenu();
		opcion = elegirOpcion();
		ejecutarOpcion(opcion);
		if (opcion != 0) {
			mostrarPeon();
		}
	} while (opcion != 0);
	
	System.out.println("ADIOS");
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
		System.out.println("1- Un paso adelante.");
		System.out.println("2- Dos pasos adelante");
		System.out.println("3- Avance a la izquierda");
		System.out.println("4- Avance a la derecha");
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
	
	private static void realizarMovimiento(int movimiento) throws OperationNotSupportedException {
		switch (movimiento) 
		{
			case 1:
				peon.mover(1);
				break;
				
			case 2:
				peon.mover(2);
				break;
				
			case 3:
				peon.mover(Direccion.IZQUIERDA);
				break;
			
			case 4:
				peon.mover(Direccion.DERECHA);
				break;
				
				default:
				
				break;
		}
	}
	
	private static void crearPeonDefecto() {
		peon = new Peon();
		System.out.println("Creado peón por defecto");
	}
	
	private static void crearPeonColor() {
		Color color = elegirColor();
		peon = new Peon(color);
		System.out.println("Creado peón de color");
	}
	
	private static void crearPeonColorColumna() {
		Color color = elegirColor();
		char columna = elegirColumnaInicial();
		peon = new Peon(color, columna);
		System.out.println("Creado peón de color en columna escogida");
	}
	
	private static void mover() {
		mostrarMenuMovimientos();
		
		int movimiento = elegirMovimiento();
		try {
			realizarMovimiento(movimiento);
			System.out.println("Realizado movimiento");
		} catch (OperationNotSupportedException e) {
			System.out.println(e.getMessage() + "\n");
		}
	}
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
			case 1:
				crearPeonDefecto();
				break;
				
			case 2:
				crearPeonColor();
				break;
				
			case 3:
				crearPeonColorColumna();
				break;
				
			case 4:
				if (peon != null) {
					mover();
				} else {
					System.out.println("No se puede mover porque no existe ningun peón");
				}
				break;
				
				default:
				
				break;
				
		}
	}
}
