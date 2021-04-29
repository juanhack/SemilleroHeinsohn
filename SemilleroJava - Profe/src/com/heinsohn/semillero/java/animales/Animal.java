package com.heinsohn.semillero.java.animales;

public class Animal implements IAnimal {

	private String sonido;
	
	@Override
	public String getSonido() {
		return "Mi sonodo: " + sonido;
	}

}
