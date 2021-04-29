package heinsohn.semillero.figura;

public class Rectangulo implements Figuras{

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
	public double calcularPrimetro() {
		return 2 * (base + altura);
	}
	
	
	
}
