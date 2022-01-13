package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio12 {

	public static void main(String[] args) {
		String contrasenya = "JavaMola";
		String intento_usuario;
		int intentos = 3;
		
		do {
			intentos--;
			intento_usuario = JOptionPane.showInputDialog("Introduce la contrasenya");
		}while(intentos > 0 && !intento_usuario.equals(contrasenya));
		
		if(intento_usuario.equals(contrasenya))
			System.out.println("ENHORABUENA");
		else
			System.out.println("Contrasenya erronea");

	}

}
