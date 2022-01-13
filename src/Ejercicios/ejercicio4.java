package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
		System.out.println("La superficie del circulo es " + Math.pow(radio, 2) * Math.PI);
	}

}
