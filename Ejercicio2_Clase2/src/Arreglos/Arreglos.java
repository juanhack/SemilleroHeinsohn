package Arreglos;

import java.util.*;

public class Arreglos {

	public static void main(String[] args) {
		
		/**List lista = new ArrayList();
		Scanner reader = new Scanner(System.in);
		int numero = 0;

		System.out.println("Introduce números. El cero para salir");

		do {			
		    numero = reader.nextInt();
		    lista.add(numero);
		} while (numero!=0);
		
		System.out.println(lista);**/
		System.out.println(Arrays.asList(separaCaracteres("Hola/Stackoverflow/en/español", "/")).toString());
	}

	private static String[] separaCaracteres(String cadena, String separator){        
	    System.out.println("Separator: " + separator);
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
