package org.iesalandalus.programacion.peonajedrez;

public class Posicion 
{
	//Atributos
	private int fila;
	private char columna;
	
	//Metodos
	
	//Constructor con parametros
	
	public Posicion(int fila, char columna) {
		
		setFila(fila);
		setColumna(columna);
		
	}
	
	//Constructor copia
	
	public Posicion(Posicion p) throws NullPointerException
	{
		if(p==null)
			throw new NullPointerException("ERROR:");
		setFila(p.getFila());
		setColumna(p.getColumna());
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	
	
}
