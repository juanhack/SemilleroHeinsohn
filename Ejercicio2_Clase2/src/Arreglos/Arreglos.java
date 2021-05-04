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
		
		/** Esta funcion resuelve el problema de las fechas
		primerPunto();
		*/
		
		/**Esta funcion resuelve el problema del arreglo de numeros*/
		segundoPunto();
		
		
		
		

	}
	
	private static void segundoPunto() {
		/** Este codigo resuelve el tercer punto que es crear un arreglo de 5 enteros y sumar sus valores, encuentre el mayo y si la suma es 
		 * mayor a 300 agregar el 10% y si no el 7%*/
		Scanner entrada = new Scanner(System.in);
		float suma = 0;
		int mayor = 0;
 
		int[] misEnteros = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese el número en la posición " + (i) + " :");
			misEnteros[i] = entrada.nextInt();
		}
		entrada.close();
		// realizar la suma y encontrar el mayor
				for (int i = 0; i < misEnteros.length; i++) {
					suma += misEnteros[i];			
					if (mayor < misEnteros[i]) {
						mayor = misEnteros[i];
					}
					System.out.println(String.format("Posición [%d] Elemento: %d", i,
							misEnteros[i]));
				}
		if(suma > 300) {
			suma = (float) (suma * 1.10);
		}else {
			suma = (float) (suma * 1.07);
		}
	}
	
	private static void primerPunto() {
		/** Este codigo resuelve el primer punto, se recibe por conola una cadena compuesta por “dd/MM/YYYY”, y separa los valores almacenando 
		 * cada uno en una variable de dia, mes y año. */
		
		String fecha = capturarInformacion("Ingrese la Fecha por favor: ");
		List<String> fechaTransformada = Arrays.asList(separaCaracteres(fecha, "/"));		
		String dia = fechaTransformada.get(0);
		String mes = fechaTransformada.get(1);
		String anio = fechaTransformada.get(2);
		
		/**Este codigo resuelve el segundo punto que es imprimir cada una de las variables*/
		
		System.out.println(dia + " " + mes + " " + anio);
	}

	/**Esta funcion tiene como proposito capturar informacion desde consola*/

	private static String capturarInformacion(String textoPropuesto) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(textoPropuesto);
			String fecha = in.nextLine();
			in.close();
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
