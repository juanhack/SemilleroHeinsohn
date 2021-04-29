package heinsohn.semillero.figura;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Figuras> figuras = new ArrayList<>();
		Figuras rectangulo = new Rectangulo(2, 3);
		Figuras circulo = new Circulo(3);
		
		figuras.add(rectangulo);
		figuras.add(circulo);
		
		for (Figuras figura : figuras) {
			System.out.println("Soy " + figura.obtenerNombreFigura());
			System.out.println("Mi area es: " + figura.calcularArea());
			System.out.println("Mi perimetro es: " + figura.calcularPrimetro());
		}

	}

}
