package com.ifsc.tds;

public class MediaAluno {

	public void calcularMedia(double notas[]) {
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}

		media = media / notas.length;

		if (media >= 6) {
			System.out.println("Aprovado! Média: " + String.format("%.2f", media));
		} else {
			System.out.println("Aprovado! Média: " + String.format("%.2f", media));
		}

	}
}
