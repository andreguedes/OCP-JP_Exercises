package br.com.andreguedes.xti;

/**
 * Wrappers class
 * @author Andre
 *
 */
public class Aula10 {
	//Aula 10 - Classes Wrappers
	/*
	 * Integer
	 * Byte
	 * Short
	 * Long
	 * Float
	 * Double
	 * Character
	 * Void
	 * Boolean
	 */
	
	public static void main(String[] args) {
		Integer age = new Integer(20);
		double a = age.doubleValue();
		int b = age.intValue();
		byte c = age.byteValue();
		
		Double price = new Double(2.13);
		
		Character t = new Character('M');
		
		Boolean type = new Boolean(true);
		Boolean value = new Boolean("true");
		Boolean yes = new Boolean("yes");
		
		// Static
		double d = Double.parseDouble("2");
		int i = Integer.parseInt("2");
		
		// Binary value to int
		int i2 = Integer.valueOf("001001011001", 2);
		
		System.out.println(i2);
	}
	
}