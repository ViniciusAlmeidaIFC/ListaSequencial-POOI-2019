package com;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o Raio do c�rculo: ");
		double raio = entrada.nextDouble();
		System.out.print("A �rea do c�rculo �: "+ (3.14*(raio*raio)));
		entrada.close();

	}

}
