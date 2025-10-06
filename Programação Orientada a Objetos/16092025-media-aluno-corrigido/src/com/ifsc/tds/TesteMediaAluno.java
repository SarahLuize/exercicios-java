package com.ifsc.tds;

import java.util.Scanner;

public class TesteMediaAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MediaAluno media = new MediaAluno();
		double[] notas = new double[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite uma nota: ");
			notas[i] = teclado.nextDouble();
		}
		teclado.close();

		media.calculoMedia(notas);

		media.aprovacao();
	}

}
