package org.iesalandalus.programacion.peonajedrez;

import javax.naming.OperationNotSupportedException;

public class Peon {
	
	//Atributos
	private Color color;
	private Posicion posicion;
		
	//Metodos
	
	public void mover(Direccion direccion) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: Mover el peón en una dirección nula no está permitido.");
		}
		try 
		{
			int fila = posicion.getFila();
			fila = (color == Color.BLANCO) ? fila+1:fila-1;
			if (direccion == Direccion.IZQUIERDA) {
				setPosicion(new Posicion(fila, (char)(posicion.getColumna() - 1)));
			} else {
				setPosicion(new Posicion(fila, (char)(posicion.getColumna() + 1)));		
			}
		} catch (IllegalArgumentException e) 
		{
			throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
		}
	}
	
	public void mover(int pasos) throws OperationNotSupportedException {
		
		int fila = posicion.getFila();		
		if (pasos == 2 && ((fila != 2 && color == Color.BLANCO) || (fila != 7 && color == Color.NEGRO))) {
			
			throw new OperationNotSupportedException("ERROR: El peón sólo se puede mover 2 pasos cuando se encuentra en la casilla inicial.");
			
		} else if (pasos != 1 && pasos != 2) {
			throw new OperationNotSupportedException("ERROR: El peón sólo se puede mover 1 o 2 pasos.");
		}
		
		try 
		{
			fila = (color == Color.BLANCO) ? fila + pasos : fila - pasos;
			setPosicion(new Posicion(fila, posicion.getColumna()));
			
		} catch (IllegalArgumentException e) 
		{
			throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
		}
	}
	
	//Constructor por defecto
	
	public Peon() throws IllegalArgumentException
	{
		color=Color.NEGRO;
		posicion=new Posicion(7, 'd');
	}
	
	//Constructores con parámetros
	
	public Peon(Color color) throws NullPointerException, IllegalArgumentException
	{
		if(color==null)
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		setColor(color);
		if(color.equals(Color.BLANCO))
			posicion=new Posicion(2, 'd');
		else
			posicion=new Posicion(7, 'd');
	}
	
	public Peon(Color color, char columna) throws NullPointerException, IllegalArgumentException
	{
		if(color==null)
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		if(!(columna=='a' || columna=='b' || columna=='c' || columna=='d' || columna=='e' || columna=='f' || columna=='g' || columna=='h'))
			throw new IllegalArgumentException("ERROR: Columna no válida.");		
		
		setColor(color);
		if(color.equals(Color.BLANCO))
			posicion=new Posicion(2, columna);
		else
			posicion=new Posicion(7, columna);
	}
	
	//Getters y Setters
	public Color getColor() {
		return color;
	}
	
	private void setColor(Color color) {
		if(color==null)
			throw new NullPointerException("ERROR: el color no puede ser nulo");
		else
			this.color = color;
	}
	public Posicion getPosicion() {
		return new Posicion(posicion);
	}
	private void setPosicion(Posicion posicion) {
		if(posicion==null)
			throw new NullPointerException("ERROR: la posicion no es valida");
		else
			this.posicion = new Posicion(posicion);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		Peon other = (Peon) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return posicion + ", color=" + color;
	}
	
	
	
	

}
