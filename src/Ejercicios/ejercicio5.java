package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero"));
		if(numero % 2 == 0)
			System.out.println("El numero introducido es divisible entre 2");
		else
			System.out.println("El numero introducido NO es divisible entre 2");
	}

}
