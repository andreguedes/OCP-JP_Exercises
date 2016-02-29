package br.com.andreguedes.xti;

/** How to import a class
 * import - key word to import classes
 * 
 * The package "java.lang.*" is imported by default
 */
import java.util.Scanner;

/**
 * Input data with Scanner class
 * @author Andre
 *
 */
public class Aula11 {
	// Aula 011 - Entrada de dados com Scanner
	public static void main(String[] args) {
		
		// If it'll not have any value in the first element, it'll throw an exception (NullPointerException)
		//System.out.println(args[0]);
		
		//User interaction, read the input
		Scanner s = new Scanner(System.in);
		System.out.println("What`s your name?");
		
		//Get the info that the user was put
		String name = s.nextLine();
		
		System.out.println("Welcome " + name);
	}

}