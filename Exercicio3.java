package com;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe dois n�meros! ");
		System.out.print("Primeiro N�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo N�mero: ");
		double num2 = entrada.nextDouble();
		System.out.print("A soma dos N�meros �: "+ (num1+num2));
		entrada.close();
	}

}
