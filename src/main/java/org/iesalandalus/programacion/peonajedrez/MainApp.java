package org.iesalandalus.programacion.peonajedrez;

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
	
}
