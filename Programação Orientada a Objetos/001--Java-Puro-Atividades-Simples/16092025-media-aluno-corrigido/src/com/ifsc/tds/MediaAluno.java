package com.ifsc.tds;

public class MediaAluno {

	private double[] notas = new double[4];
	private double media = 0;

	public void calculoMedia(double[] notas) {
		for (int i = 0; i < 4; i++) {
			media = media + notas[i];
		}
		media = (media / 4.0);

	}

	public void aprovacao() {
		if (media <= 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
	}

}
