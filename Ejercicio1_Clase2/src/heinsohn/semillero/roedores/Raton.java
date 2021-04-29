package heinsohn.semillero.roedores;

public class Raton implements Roedores {

	private String nombre;
	private int brazos;
	private int patas;
	private int cola;

	
	public Raton(String nombre, int brazos, int patas, int cola) {
		super();
		this.nombre = nombre;
		this.brazos = brazos;
		this.patas = patas;
		this.cola = cola;
	}
	
	@Override
	public String getFamiliName() {
		// TODO Auto-generated method stub
		return "Muridae";
	}
	@Override
	public String move() {
		return "Me Desplazo Corriendo muy Rapido";
	}
	@Override
	public int getExtremities() {
		return brazos + patas + cola + 1;
	}
}
