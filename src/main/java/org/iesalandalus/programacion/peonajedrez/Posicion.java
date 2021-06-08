package org.iesalandalus.programacion.peonajedrez;

public class Posicion 
{
	//Atributos
	private int fila;
	private char columna;
	
	//Metodos
	
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
