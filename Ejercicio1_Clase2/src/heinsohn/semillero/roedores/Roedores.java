package heinsohn.semillero.roedores;
/**
 * Esta interfas tentra por objeto representar a cualquier roedor
 * @author juand
 *
 */
public interface Roedores {

	/**
	 * Este metodo retorna el nombre de la familia para cada implementacion
	 */
	public String getFamiliName();
	/**
	 * Este metodo retorna la forma de desplazamiento
	 */
	public String move();
	/**
	 * Este metodo retorna la cantidad de extremidades
	 */
	public int getExtremities();
}
