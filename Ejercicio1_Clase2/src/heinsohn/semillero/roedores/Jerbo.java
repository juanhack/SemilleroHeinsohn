package heinsohn.semillero.roedores;

public class Jerbo implements Roedores {

	private String nombre;
	private int brazos;
	private int patas;
	private int cola;
	
	public Jerbo(String nombre, int brazos, int patas, int cola) {
		super();
		this.nombre = nombre;
		this.brazos = brazos;
		this.patas = patas;
		this.cola = cola;
	}

	@Override
	public String getFamiliName() {
		return "Dipodidae";
	}

	@Override
	public String move() {
		return "Me desplazo saltando hasta 3 metros por salto";
	}

	@Override
	public int getExtremities() {
		return brazos + patas + cola + 1;
	}

}
