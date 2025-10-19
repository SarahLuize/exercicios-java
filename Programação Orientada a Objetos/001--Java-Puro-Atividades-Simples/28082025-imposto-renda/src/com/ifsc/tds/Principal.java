package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		float salario = 0f;
		float imposto = 0f;
		float total = 0f;

		System.out.println("Informe um salário: ");
		Scanner teclado = new Scanner(System.in);
		salario = teclado.nextFloat();

		System.out.println("Salário: " + salario);

		if (salario <= 1000) {
			System.out.println("Sem imposto!");
		} else if (salario >= 1000.00 && salario <= 2200.00) {
			imposto = (float) (13 / 100.0) * salario;
			total = salario - imposto;
			System.out.println("Imposto de 13%: R$" + total);
		} else {
			imposto = (float) (22 / 100.0) * salario;
			total = salario - imposto;
			System.out.println("Imposto de 22%: R$" + total);
		}

		teclado.close();

	}

}
