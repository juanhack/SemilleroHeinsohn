package com.heinsohn.semillero.figuras;

/**
 * Interface que representa una Figuta
 * 
 * @author duribe
 *
 */
public interface Figura {

	/**
	 * Este metodo retorna el nombre de la figura para cada implementacion
	 * 
	 * @return String, es el nombre de la figura
	 */
	public String obtenerNombreFigura();
	
	public double calcularArea();
	
	public double calcularPerimetro();
	
}
