package com.ifsc.tds;

import java.util.Scanner;

public class TesteImpares {

	public static void main(String[] args) {
		int numeroInicial = 0;
		int numeroFinal = 0;
		Scanner teclado = new Scanner(System.in);
		NumerosImpares numerosImpares = new NumerosImpares();

		System.out.println("Digite o número inteiro inicial: ");
		numeroInicial = teclado.nextInt();

		System.out.println("Digite o número inteiro final: ");
		numeroFinal = teclado.nextInt();
		

		numerosImpares.calcularMultiplicacao(numeroInicial, numeroFinal);

		teclado.close();

	}

}
