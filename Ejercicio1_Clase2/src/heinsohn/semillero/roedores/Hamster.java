package heinsohn.semillero.roedores;

public class Hamster implements Roedores {

	private String nombre;
	private int brazos;
	private int patas;
	private int cola;
	
	public Hamster(String nombre, int brazos, int patas, int cola) {
		super();
		this.nombre = nombre;
		this.brazos = brazos;
		this.patas = patas;
		this.cola = cola;
	}
	
	@Override
	public String getFamiliName() {
		return "Cricetidae";
	}
	@Override
	public String move() {
		return "Me desplazo caminando o corriendo, pero mucho mas despacio";
	}
	@Override
	public int getExtremities() {
		return brazos + patas + cola + 1;
	}
}
