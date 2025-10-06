package com.ifsc.tds;

import java.util.Scanner;

public class NumerosImpares {
	private Scanner teclado = new Scanner(System.in);
	private int num1 = 0;
	private int num2 = 0;
	private int soma = 0;
	int multiplicacao = 1;

	public void informarNumeros() {
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
	}

	// imprimir soma numero impares entre os dois numeros
	public void somaImpares() {
		for (int i = num1; i < num2; i++) {
			if (i % 2 == 1) {
				soma += i;
				System.out.println("Soma: " + soma);
			}

		}
	}

	// multiplicação numeros pares entre os dois numeros
	public void multiplicacaoPares() {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					multiplicacao *= i;
					System.out.println("Multiplicação: " + multiplicacao);
				}
			}
		}
	}
