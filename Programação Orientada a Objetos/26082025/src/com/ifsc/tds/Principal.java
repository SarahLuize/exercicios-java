package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 20;
		float salario = 125.50f;
		char letra = 'A';

		int num1 = 5;
		int num2 = 5;

		System.out.println("Teste!");
		System.out.println("Sua idade �: " + idade);
		System.out.println("Sal�rio �: " + salario);
		System.out.println("Letra �: " + letra + "\n");

		// CALCULOS MATEM�TICOS DE num1 E num2
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtra��o: " + (num2 - num1));
		System.out.println("Multiplica��o: " + (num1 * num2));
		System.out.println("Divis�o: " + (num2 / num1));
	}

}
