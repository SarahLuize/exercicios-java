package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		}

		teclado.close();

	}

}
