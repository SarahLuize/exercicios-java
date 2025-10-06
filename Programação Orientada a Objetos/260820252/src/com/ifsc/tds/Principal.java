package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num1 = scan.nextInt();

		System.out.println("Digite outro número: ");
		num2 = scan.nextInt();

		// CALCULOS
		System.out.println("Soma: " + (num1 + num2));

		scan.close();
	}

}
