package com.ifsc.tds;

public class NumerosImpares {

	public void calcularMultiplicacao(int valorInicial, int valorFinal) {
		int soma = 0;
		int multiplica = 1;

		for (int i = valorInicial; i <= valorFinal; i++) {

			if (i % 2 == 0) {
				multiplica = multiplica * i;
			} else {
				soma = soma + i;
			}
		}

		System.out.println("Total da multiplicação dos pares: " + multiplica);
		System.out.println("Total da soma dos ímpares.......: " + soma);

	}

}
