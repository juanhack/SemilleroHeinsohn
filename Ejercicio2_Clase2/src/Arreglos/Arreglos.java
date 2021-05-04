package Arreglos;

import java.util.*;

/**
 * Este codigo tiene por objetivo resolver el siguiente requerimiento:
 * Dada una cadena compuesta por “dd/MM/YYYY”, 
 * 	1. cree tres nuevos elementos que separen los valores para día, mes y año. Ejemplo: 01/03/2018  
 *  2. Imprimir en tres valores variables independientes. 01   03   2018.
 *  3. Crear un arreglos de 5 enteros y sumar sus valores.
 *	4. Crear una aplicación que lea 5 precios y sumarlo
 *		- si se pasa de 300 agregarle 10% del precio final sino solo el 7% 
 *      - decir cual de todos fue el precio mas alto.
 *      
 * @author juand
 *
 */

public class Arreglos {

	public static void main(String[] args) {
		
		/** Este codigo resuelve el primer punto, se recibe por conola una cadena compuesta por “dd/MM/YYYY”, y separa los valores almacenando 
		 * cada uno en una variable de dia, mes y año. */
		
		String fecha = capturarInformacion("Ingrese la Fecha por favor: ");
		List<String> fechaTransformada = Arrays.asList(separaCaracteres(fecha, "/"));		
		String dia = fechaTransformada.get(0);
		String mes = fechaTransformada.get(1);
		String anio = fechaTransformada.get(2);
		
		/**Este codigo resuelve el segundo punto que es imprimir cada una de las variables*/
		
		System.out.println(dia + " " + mes + " " + anio);
		
		/** Este codigo resuelve el tercer punto que es crear un arreglo de 5 enteros y sumar sus valores*/
		
		int[] enteros = null;
		
		for(int i=0; i<5 ; i++) {
			enteros[i]=i;
		}
		
	}

	/**Esta funcion tiene como proposito capturar informacion desde consola*/

	private static String capturarInformacion(String textoPropuesto) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(textoPropuesto);
			String fecha = in.nextLine();
			return fecha;
		}
	}
	
	/**Esta funcion tiene como proposito realizar division de texto por medio de diferentes caracteres*/
	
	private static String[] separaCaracteres(String cadena, String separator){        
	    
	    String[] parts = null;   
	    if(separator.equals("|")|| separator.equals("\\")||separator.equals(".")||separator.equals("^")||separator.equals("$")
	            ||separator.equals("?")||separator.equals("*")||separator.equals("+")||separator.equals("(")||separator.equals(")")
	            ||separator.equals("{")||separator.equals("["))
	    {
	        parts = cadena.split("\\"+separator);       
	    }else{
	        parts = cadena.split(separator);
	    }  
	    return parts;
	}
	
}
