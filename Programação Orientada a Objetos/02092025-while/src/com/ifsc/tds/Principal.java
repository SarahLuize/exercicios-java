package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num = 0;
		int menor = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);

		// for (int i = 0; i < 10; i++) {
		while (contador < 3) {
			System.out.println("Informe um número: ");
			num = teclado.nextInt();

			if (contador == 0) {
				menor = num;
			} else {
				if (num < menor) {
					menor = num;
				}
			}
			contador++;
		}

		teclado.close();
		System.out.println("Menor número: " + menor);

	}

}
