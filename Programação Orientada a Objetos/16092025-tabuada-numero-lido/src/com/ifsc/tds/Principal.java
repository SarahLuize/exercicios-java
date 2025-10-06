package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.println("Informe um número: ");
		num = scan.nextInt();
		scan.close();

		for (int j = 1; j <= num; j++) {
			System.out.println("TABUADA DO " + j);
			for (int i = 0; i < 11; i++) {
				System.out.println(j + " X " + i + " = " + (j * i));
			}
			System.out.println("------------");
		}
		System.out.println("FIM");

	}

}
