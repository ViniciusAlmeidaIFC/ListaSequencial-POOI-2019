package com;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as quatros notas do aluno! ");
		System.out.print("Primeira Nota: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segunda Nota: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceira Nota: ");
		double num3 = entrada.nextDouble();
		System.out.print("Quarta Nota: ");
		double num4 = entrada.nextDouble();
		System.out.print("A média das Notas é: "+ (num1+num2+num3+num4)/4);
		entrada.close();


	}

}
