package br.com.andreguedes.xti;

/**
 * Logic operators
 * @author Andre
 *
 */
public class Aula16 {
	// Aula 16 - Operadores logicos
	
	public static void main(String[] args) {
		int x = 9;
		
		System.out.println((x >= 3) && (x <= 10)); // The operator && return true if both operations are true
		System.out.println((x >= 3) || (x <= 10)); // The operator || return true case some is true
		System.out.println(!(x >= 3)); // Negative operator returns the inverse of result
	}

}
