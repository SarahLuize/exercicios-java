package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double comprimento = 0;
		double largura = 0;
		double altura = 0;
		double volume = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o comprimento: ");
		comprimento = teclado.nextDouble();

		System.out.println("Digite o largura: ");
		largura = teclado.nextDouble();

		System.out.println("Digite o altura: ");
		altura = teclado.nextDouble();

		volume = comprimento * largura * altura;

		System.out.println("Volume: " + String.format("%.2f", volume));

		teclado.close();

	}

}
