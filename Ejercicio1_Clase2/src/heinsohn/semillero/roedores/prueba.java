package heinsohn.semillero.roedores;

public class prueba {

	public static void main(String[] args) {
		
		Roedores miguelito = new Raton("miguelito", 2, 2, 1);
		Roedores pepe = new Hamster("Pepe Mujica", 2, 2, 0);
		Roedores speedy = new Hamster("Speedy Gonzales", 2, 2, 1);
		
		System.out.println("Yo soy de la familia " + miguelito.getFamiliName() +  ", y cuento con " + miguelito.getExtremities() + " extremidades");
		System.out.println("Sin embargo, me conocen mas como " + (miguelito.getFamiliName().equals("Muridae")? "Ratón":""));
	
	}

}
