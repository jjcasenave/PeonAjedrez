package org.iesalandalus.programacion.peonajedrez;

public class Posicion 
{
	//Atributos
	private int fila;
	private char columna;
	
	//Metodos
	
	//Constructores
	
	//Crea un constructor para esta clase que acepte como parámetros la fila y la columna y 
	//que los asigne a los atributos si son correctos  y si no lance una excepción del mismo 
	//tipo que la anterior indicando el problema. Para ello utiliza los métodos set anteriormente 
	//creados. Haz un commit.
	
	public Posicion(int fila, char columna) {
		
		if(fila<1 || fila>8)
			throw new IllegalArgumentException("ERROR:");
		setFila(fila);
		
		if(columna<'a' || columna>'h')
			throw new IllegalArgumentException("ERROR:");
		setColumna(columna);
		
	}
	
	//Getters y Setters
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if(fila<1 || fila>8)
			throw new IllegalArgumentException("ERROR:");
		
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if(columna<'a' || columna>'h')
			throw new IllegalArgumentException("ERROR:");
		
		this.columna = columna;
	}
	
}
