package com.ifsc.tds;

import java.util.Scanner;

public class TesteSalario {

	public static void main(String[] args) {
		int numeroDependentes = 0;
		double valorHora = 0;
		double quantidadeHoras = 0;
		Scanner teclado = new Scanner(System.in);
		Salario salario = new Salario();

		System.out.println("Digite a quantidade de horas trabalhadas: ");
		quantidadeHoras = teclado.nextDouble();

		System.out.println("Digite o valor da hora trabalhada: ");
		valorHora = teclado.nextDouble();

		System.out.println("Digite a quantidade de dependentes: ");
		numeroDependentes = teclado.nextInt();

		salario.calcularSalario(numeroDependentes, valorHora, quantidadeHoras);

		teclado.close();

	}

}
