package com.ifsc.tds;

public class MaiorNumero {

	public void achaMaiorNumero(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("O primeiro número é o maior!");
		} else if (valor1 < valor2) {
			System.out.println("O segundo número é o maior!");
		} else {
			System.out.println("Os números são iguais!");
		}
	}

}
