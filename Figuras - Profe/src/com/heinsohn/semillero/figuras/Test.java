package com.heinsohn.semillero.figuras;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Figura> figuras = new ArrayList<>();
		
		Figura rectangulo = new Rectangulo(2, 3);
		
		Figura circulo = new Circulo(3);
		
		figuras.add(rectangulo);
		figuras.add(circulo);
		
		for (Figura figura : figuras) {
			System.out.println("Soy: " + figura.obtenerNombreFigura());
			System.out.println("Mi area es: " + figura.calcularArea());
			System.out.println("Mi perimetro es: " + figura.calcularPerimetro());
		}
		
	}
	
}
