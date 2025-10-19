package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float IMC = 0f;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe seu IMC: ");
		IMC = teclado.nextFloat();

		if (IMC <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (IMC >= 18.5 && 24.99 >= IMC) {
			System.out.println("Peso normal");
		} else {
			System.out.println("Acima do peso");
		}

		teclado.close();
	}

}
