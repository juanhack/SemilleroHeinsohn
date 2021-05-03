package heinsohn.semillero.roedores;

public class prueba {

	public static void main(String[] args) {
		
		Roedores miguelito = new Raton("miguelito", 2, 2, 1);
		Roedores pepe = new Jerbo("Pepe Mujica", 2, 2, 0);
		Roedores speedy = new Hamster("Speedy Gonzales", 2, 2, 1);
		
		System.out.println("Yo soy de la familia " + miguelito.getFamiliName() +  ", y cuento con " + miguelito.getExtremities() + " extremidades");
		System.out.println("Sin embargo, me conocen mas como " + (miguelito.getFamiliName().equals("Muridae")? "Ratón":""));
		
		Roedores roedorcitosMios [] = new Roedores[3];
		roedorcitosMios[0] = miguelito;
		roedorcitosMios[1] = pepe;
		roedorcitosMios[2] = speedy;
		
		for(int i=0;i<3;i++){
			System.out.println("Yo soy de la familia " + roedorcitosMios[i].getFamiliName());
	    }		
	
	}

}
