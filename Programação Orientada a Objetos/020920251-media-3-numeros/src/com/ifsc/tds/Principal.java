package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float acumulador = 0f;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			acumulador = acumulador + teclado.nextFloat();
		}

		acumulador = acumulador / 3;
		
		System.out.println("A média é: " + acumulador);

		teclado.close();

	}

}
