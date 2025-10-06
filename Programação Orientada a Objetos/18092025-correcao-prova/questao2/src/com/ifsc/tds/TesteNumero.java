package com.ifsc.tds;

import java.util.Scanner;

public class TesteNumero {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		Scanner teclado = new Scanner(System.in);
		MaiorNumero maiorNumero = new MaiorNumero();
		
		System.out.println("Digite um número inteiro: ");
		numero1 = teclado.nextInt();

		System.out.println("Digite outro número inteiro: ");
		numero2 = teclado.nextInt();
		
		maiorNumero.achaMaiorNumero(numero1, numero2);
	
		teclado.close();

	}

}
