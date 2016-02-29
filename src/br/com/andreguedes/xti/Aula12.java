package br.com.andreguedes.xti;

//Class which have many types for graphic interfaces in Java
import javax.swing.JOptionPane;

/**
 * JOptionPane - Graphic interface
 * @author Andre
 *
 */
public class Aula12 {
	//Aula 012 - Interface grafica com o objeto JOptionPane
	public static void main(String[] args) {
		
		//Object JOption with the method to input values using graphic interface
		String name = JOptionPane.showInputDialog("What's your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Welcome " + name);
	}

}
