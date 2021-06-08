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
		try {
			int fila = posicion.getFila();
			fila = (color == Color.BLANCO) ? fila + 1 : fila - 1;
			if (direccion == Direccion.IZQUIERDA) {
				setPosicion(new Posicion(fila, (char)(posicion.getColumna() - 1)));
			} else {
				setPosicion(new Posicion(fila, (char)(posicion.getColumna() + 1)));		
			}
		} catch (IllegalArgumentException e) {
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
		if(!(columna=='c' || columna=='f'))
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
	
	
	

}
