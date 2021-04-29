package heinsohn.semillero.figura;


public class Circulo implements Figuras{
	
	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public String obtenerNombreFigura() {
		return "Circulo";
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double calcularPrimetro() {
		return 2 * Math.PI * radio;
	}

}
