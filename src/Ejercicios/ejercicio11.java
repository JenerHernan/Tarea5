package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana").toLowerCase();
		
		switch(dia) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("El dia introducido es laboral");
				break;
			case "sabado":
			case "domingo":
				System.out.println("El dia introducido NO es laboral");
				break;
			default:
				System.out.println("El valor introducido no es reconocido");
				break;
		}
	}

}
