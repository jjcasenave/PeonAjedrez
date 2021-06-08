package org.iesalandalus.programacion.peonajedrez;

/*Crea la clase Peon, dentro del paquete adecuado, cuyos atributos serán un color (del tipo enumerado Color)
 *  y posicion (de la clase Posicion), con la visibilidad adecuada. Haz un commit.
 */

public class Peon {
	
	//Atributos
	private Color color;
	private Posicion posicion;
		
	//Metodos
	
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
