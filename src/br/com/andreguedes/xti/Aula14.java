package br.com.andreguedes.xti;

/**
 * Mathmatics operators
 * @author Andre
 *
 */
public class Aula14 {
	//Aula 14 - Operadores matematicos
	
	public static void main(String[] args) {
		double x = 7 + +3;
		double y = x * -2;
		y = ++y % 2; // pre increment
		x = y-- - 2; // post increment
		
		System.out.println(x);
		System.out.println(y);
		
		// We can use the operator + to concatenate values
		String concat = "Hello " + "friend";
		System.out.println(concat);
	}

}
