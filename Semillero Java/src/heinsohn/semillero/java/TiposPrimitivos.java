package heinsohn.semillero.java;

/**
 * Clase que ermite validar los tipos primitivos
 * 
 * @author duribe
 * 
 *
 */
public class TiposPrimitivos {

	public static void main(String[] args) {
		int a = 2;
        double b = 3.0;
        float c = (float) (20000*a/b + 5);
        
        System.out.println("Valor en formato float: " + c);
        System.out.println("Valor en formato double: " + (double) c);
        System.out.println("Valor en formato byte: " + (byte) c);
        System.out.println("Valor en formato short: " + (short) c);
        System.out.println("Valor en formato int: " + (int) c);
        System.out.println("Valor en formato long: " + (long) c);
        

	}
	
}