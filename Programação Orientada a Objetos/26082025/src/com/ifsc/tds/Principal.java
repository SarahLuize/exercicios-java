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
		System.out.println("Sua idade é: " + idade);
		System.out.println("Salário é: " + salario);
		System.out.println("Letra é: " + letra + "\n");

		// CALCULOS MATEMÁTICOS DE num1 E num2
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num2 - num1));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Divisão: " + (num2 / num1));
	}

}
