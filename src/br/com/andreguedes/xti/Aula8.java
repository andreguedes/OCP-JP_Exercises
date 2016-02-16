package br.com.andreguedes.xti;

public class Aula8 {

	// Aula 008 - Variaveis de referencia, garbage collector
	public static void main(String[] args) {
		// Primitive variable
		int i = 9; // repository to the value of i
		i = 10; // The JVM change the value to 10
		
		// Reference variable - objects
		String y = "Lesson"; // It`s a repository too, but your content don`t contains the value, contains a memory reference
		y = "lesson 8"; // The value of y remains in the memory yet. But, I was created a new object to the reference of the y.
	
		/*
		 * When a object is in memory without references, it`s free to the action of Garbage Collector.
		 * It`s a manager to the objects without references in the project, cleaning them.
		 */
	
		y = null; // The second value is already able to the action of GC.
	}
}