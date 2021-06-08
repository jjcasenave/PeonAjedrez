package org.iesalandalus.programacion.peonajedrez;

/*Crea la clase Peon, dentro del paquete adecuado, cuyos atributos serán un color (del tipo enumerado Color)
 *  y posicion (de la clase Posicion), con la visibilidad adecuada. Haz un commit.
 */

public class Peon {
	
	//Atributos
	private Color color;
	private Posicion posicion;
		
	//Metodos
	
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
	
	//Getters y Setters
	
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
