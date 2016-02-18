package br.com.andreguedes.xti;

public class Aula9 {

	// Aula 009 - Constantes e modificador final
	public static void main(String[] args) {
		
		// variable
		int populacao = 20000000;
		
		// Constant value
		final double PI = 3.14;
		
		//PI = 123; It will compile with error if you try to change the value of a constant
		
		final char MALE = 'M';
		final char FEMALE = 'F';
		
		/*
		 * By convention, constant names should be upper case
		 */
		
		System.out.println(PI);
	}
}
