package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas = 0;
		double salarioHora = 0;

		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();
		System.out.println("Salário por hora: ");
		salarioHora = scan.nextDouble();
		scan.close();

		// calculo do salario
		if (horasTrabalhadas > 160) {
			double salarioBase = salarioHora * 160;
			double horasExtras = horasTrabalhadas - 160;
			double valorExtra = salarioHora * 1.5;
			double totalHoraExtra = valorExtra * horasExtras;
			double salarioTotal = salarioBase + totalHoraExtra;
			
			System.out.println("Salario do mês: " + String.format("%.2f", salarioTotal));
		} else {
			double salarioTotal = salarioHora * horasTrabalhadas;
			System.out.println("Salario do mês: " + String.format("%.2f", salarioTotal));
		}

	}
}
