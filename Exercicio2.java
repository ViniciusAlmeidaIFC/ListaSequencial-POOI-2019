package com;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		double num = entrada.nextDouble();
		System.out.println("O n�mero informado foi: "+ num);
		entrada.close();
	}

}
