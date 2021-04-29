package heinsohn.semillero.figura;

/**
 * Interfaz que representa una figura
 * @author juand
 *
 */
public interface Figuras {
	/**
	 * Este metodo retorna el nombre de la figura para cada implementacion	
	 * @return String, es el nombre de la figura
	 */
	public String obtenerNombreFigura();
	public double calcularArea();
	public double calcularPrimetro();
}
