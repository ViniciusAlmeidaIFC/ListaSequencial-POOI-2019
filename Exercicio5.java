package com;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade em metros: ");
		double metros = entrada.nextDouble();
		System.out.print("A quantidade em centímetros é de: "+metros*100+" cm");
		entrada.close();

	}

}
