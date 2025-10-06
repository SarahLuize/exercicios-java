package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float nota = 0f;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe uma nota: ");
		nota = teclado.nextFloat();

		if (nota >= 60) {
			System.out.println("Aprovado!");
		} else if (nota < 60 && nota < 20) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}

		teclado.close();
	}

}
