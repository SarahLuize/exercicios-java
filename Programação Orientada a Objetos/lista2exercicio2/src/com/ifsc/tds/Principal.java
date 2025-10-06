package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double notas[] = new double[4];
		double media = 0;
		double mediaExame = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite" + i + "ª nota: ");
			notas[i] = teclado.nextDouble();
			media = media + notas[i];
		}

		media = media / notas.length;

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Exame");
			System.out.println("Digite a média do exame: ");
			mediaExame = teclado.nextDouble();

			media = (media + mediaExame) / 2;

			if (media >= 5) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}

		}

		teclado.close();

	}

}
