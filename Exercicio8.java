package com;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe quantos R$ voc� ganha por hora: ");
		double horaGanha = entrada.nextDouble();
		System.out.print("Informe quantas horas trabalhadas: ");
		double horaTrabalhada = entrada.nextDouble();
		System.out.println("Seu sal�rio � de: R$"+ horaGanha*horaTrabalhada);
		entrada.close();

	}

}
