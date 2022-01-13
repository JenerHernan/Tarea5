package Ejercicios;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {
	
	public static void main(String[] args) {
		double resultado = 0;
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero"));
		String operador = JOptionPane.showInputDialog("Introduce el operador");
		
		
		
		switch(operador){
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			case "^":
				resultado = Math.pow(num1, num2);
				break;
			case "%":
				resultado = num1 % num2;
				break;
			default:
				System.out.println("No se reconoce el operador introducido");
		}
		
		JOptionPane.showMessageDialog(null,"El resultado es " + resultado);
	}
	
}
