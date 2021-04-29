package com.heinsohn.semillero.java;

public class TiposObjetos {

	public static void main(String[] args) {
		
		// Boolean
		Boolean refBoolean = new Boolean(true);
		boolean bool = refBoolean.booleanValue();
		
		System.out.println("Boolean: " + bool);
		
		// Byte
		Byte refByte = new Byte((byte) 123);
		byte b = refByte.byteValue();
		
		System.out.println("Byte: " + b);
		
		// Character
		Character refChar = new Character('x');
		char c = refChar.charValue();
		
		System.out.println("Character: " + c);
		
		// Short
		Short refShort = new Short((short) 123);
		short s = refShort.shortValue();
		
		System.out.println("Short: " + s);
		
		// Integer
		Integer refInt = new Integer(123);
		int i = refInt.intValue();
		
		System.out.println("Integer: " + i);
		
		// Long
		Long refLong = new Long(123L);
		long l = refLong.longValue();
		
		System.out.println("Long: " + l);
		
		// Float
		Float refFloat = new Float(12.3F);
		float f = refFloat.floatValue();
		
		System.out.println("Float: " + f);
		
		// Double
		Double refDouble = new Double(12.3D);
		double d = refDouble.doubleValue();
		
		System.out.println("Double: " + d);

	}

}
