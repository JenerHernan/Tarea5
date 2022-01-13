package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		final double IVA = 1.21;
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		System.out.println("El precio con IVA incluido es " + precio * IVA);
	}

}
