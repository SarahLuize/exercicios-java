package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma=0;
		int num=0;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < num; i++) {
			soma += i;
			System.out.println("" + i + " - " + "Soma: " + soma);
		}
		System.out.println("Fim!");
	}

}
