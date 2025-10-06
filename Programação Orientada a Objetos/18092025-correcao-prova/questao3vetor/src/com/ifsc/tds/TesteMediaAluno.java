package com.ifsc.tds;

import java.util.Scanner;

public class TesteMediaAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MediaAluno mediaAluno = new MediaAluno();
		double notas[] = new double[4];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digita a nota " + (i + 1) + " de 4: ");
			notas[i] = teclado.nextDouble();
		}
		
		mediaAluno.calcularMedia(notas);

		teclado.close();

	}

}
