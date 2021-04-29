package com.heinsohn.semillero.java;

import java.util.*;

public class SentenciasControl {

	public static void main(String[] args) {
		int promedio = 10;
		
		// IF
		if(promedio > 5) {
			System.out.println("Promedio superior!");
		}
		else {
			System.out.println("Promedio inferior!");
		}
		
		// OPERADOR TERNARIO
		System.out.println((promedio > 5) ? "Promedio superior!" : "Promedio inferior!");
		
		String caso = "Casa";
		
		// SWITCH
		switch (caso) {
			case "Finca":
				System.out.println("Es una Finca!");
				break;
			case "Lote":
				System.out.println("Es un lote!");
				break;
			case "Casa":
				System.out.println("Es una casa!");
				break;
			default:
				System.out.println("No aplica!");
				break;
		}
		
		int i=10;
        
		// WHILE
		while(i > 1) {
			System.out.println(i);
			i--;
		}
		
		i=10;
		// DO WHILE
		do{
             System.out.println("Do: " + i);
             i--;
        } while(i > 1);
		
		// FOR
		int j=10;
		for(; j>1;){
			j--;
            System.out.println("El valor de j es: "+j);
        }
		
		List<Integer> listado = new ArrayList<>();
		
		listado.add(1);
		listado.add(new Integer(2));
		listado.add(new Long(3).intValue());
		
		// FOR-EACH
		for(Integer l : listado) {
			System.out.println("Elemento: " + l);
		}

	}

}
