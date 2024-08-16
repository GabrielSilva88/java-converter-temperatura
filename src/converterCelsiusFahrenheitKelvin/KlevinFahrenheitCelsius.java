package converterCelsiusFahrenheitKelvin;

import java.util.Scanner;

public class KlevinFahrenheitCelsius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Calculadora para conviter Celsius em Fahrenheit ou Kelvin. \n\r Digite a temperatura: ");
		double C = scan.nextDouble();

		System.out.println("Digite: 1 para Fahrenheit ou 2 para Kelvin.");
		int opc = scan.nextInt();

		if (opc == 1) {
			double F = (C * 9 / 5) + 32;
			System.out.println("Celsius em Fahrenheit: " + F);
		} else if (opc == 2) {
			double K = C + 273.15;
			System.out.println("Celsius em Kelvin: " + K);
		}

	}
}

/*
	Escreva um programa que leia a temperatura em graus Celsius e converta para graus Fahrenheit ou Kelvin, de acordo com a escolha do usuário. 

	A fórmula para converter Celsius para Fahrenheit é: 	
	F = (C * 9/5) + 32. 
	A fórmula para converter Celsius para Kelvin é 
	K = C + 273.15.

*/



