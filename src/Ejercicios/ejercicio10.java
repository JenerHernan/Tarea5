package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio10 {

	public static void main(String[] args) {
		int n_ventas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas ventas hay que introducir?"));
		double sumaTotal = 0;
		for(int i = 0; i < n_ventas; i++) {
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la venta numero " + i) );
			sumaTotal += precio;
		}
		System.out.println("El precio total de las ventas es de " + sumaTotal);
	}

}
