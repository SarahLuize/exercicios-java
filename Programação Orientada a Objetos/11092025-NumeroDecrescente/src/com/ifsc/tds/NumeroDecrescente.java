package com.ifsc.tds;

import java.util.Scanner;

public class NumeroDecrescente {

	private int numero;
	Scanner scan = new Scanner(System.in);

	public void informeNumero() {
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
	}

	public void ordemDecrescente() {
		for (int i = numero; i > 0; i--) {
			System.out.println("Resultado: " + i);
		}

	}
}