package com.ifsc.tds;

public class MediaAluno {

	public void calcularMedia(double valor1, double valor2, double valor3, double valor4) {
		double media = 0;

		media = (valor1 + valor2 + valor3 + valor4) / 4;

		if (media >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
