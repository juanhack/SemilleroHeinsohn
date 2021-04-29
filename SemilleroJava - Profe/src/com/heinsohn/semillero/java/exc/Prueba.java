package com.heinsohn.semillero.java.exc;

import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		try {
			List<String> lista = new ArrayList<>();
			
			lista.add("Danner");
			lista.add("Juan");
			
			for (String s : lista) {
				System.out.println(s);
				saludar();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saludar() throws Exception {
		throw new Exception("Error gemerado!");
	}

}
