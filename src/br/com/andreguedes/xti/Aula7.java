package br.com.andreguedes.xti;

/**
 * Learning about primitive types
 * @author Andre
 *
 */
public class Aula7 {

	// Aula 007 - Tipos primitivos
	public static void main(String[] args) {
		
		// Primitive types
		/*
		 * int - value without fraction - 4 bytes - MAX 2.147.483.647
		 * long - large number without fraction - MAX 9.000.000.000.000.000.000
		 * char - a character, and only one, within ''
		 * byte - short number without fraction - MAX 127
		 * float - number with fraction
		 * double - number with fraction
		 * short - short number without fraction - MAX 32767
		 * void - without value
		 * boolean - true or false (conditional)
		 */
		int age = 2_130_566_456;
		double price = 2.56;
		char n = 'n'; // Unicode
		boolean married = false;
		byte b = 127;
		short s = 32767;
		long l = 9_000_000_000_000_000_000L;
		double d = 1.7975653843876623E+308; // IEEE 754
		float f = 123F;
		
		// Implicit casting
		age = s;
		System.out.println(age);
		
		// Explicit casting
		age = (int) l;
		System.out.println(age);
		
		// Binary form
		byte bb = 0b01010101; // 1 byte - 8 bits
		short sb = 0b0101010101010101; // 2 bytes - 16 bits
		int ib = 0b01010101010101010101010101010101; // 4 bytes - 32 bits
		
		System.out.println(ib);
		
		// A primitive type isn`t a object, it`s only your own value
	}
}
