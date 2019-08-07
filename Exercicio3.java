package com;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe dois números! ");
		System.out.print("Primeiro Número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo Número: ");
		double num2 = entrada.nextDouble();
		System.out.print("A soma dos Números é: "+ (num1+num2));
		entrada.close();
	}

}
