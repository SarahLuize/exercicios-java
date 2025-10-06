package com.ifsc.tds;

import java.util.Scanner;

public class TesteTabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Tabuada tabuadaNumero = new Tabuada();
		int tabuada = 0;

		System.out.println("Digite um número inteiro para calcular a tabuada: ");
		tabuada = teclado.nextInt();

		tabuadaNumero.calcularTabuada(tabuada);
		
		teclado.close();

	}

}
