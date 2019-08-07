package com;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a medida do lado do quadrado!");
		double lado = entrada.nextDouble();
		System.out.print("A área do quadrado é de: "+ (lado*lado));
		entrada.close();
	}

}
