package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float valor=0f;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o valor: ");
			valor = valor + teclado.nextFloat();
		}
		System.out.println("Total: R$" + valor);
		teclado.close();
	}

}
