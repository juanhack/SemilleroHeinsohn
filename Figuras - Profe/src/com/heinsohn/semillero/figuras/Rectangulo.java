package com.heinsohn.semillero.figuras;

public class Rectangulo implements Figura {

	private double base;
	
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String obtenerNombreFigura() {
		return "Rectangulo";
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (base + altura) * 2;
	}

}
