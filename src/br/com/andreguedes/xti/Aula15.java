package br.com.andreguedes.xti;

/**
 * Compare operators
 * @author Andre
 *
 */
public class Aula15 {
	// Aula 15 - Operadores de comparacao
	
	public static void main(String[] args) {
		int x = 6;
		System.out.println(x == 7);
		System.out.println(x != 6);
		System.out.println(x < 3);
		
		//System.out.println(x instanceof int); Not compile, because int isn`t a object, it`s a primitive type
		
		Integer y = x;
		System.out.println(y instanceof Integer); // It`ll compile, because it`s a compatible type with the Wrapper Integer
		
		//System.out.println(x == "6"); Not compile, because the types that we`re compare are different
	}

}
