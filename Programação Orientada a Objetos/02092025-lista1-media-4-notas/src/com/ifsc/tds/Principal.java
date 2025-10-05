package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float nota = 0f;
		int i=0;
		for (i = 0; i < 4; i++) {
			System.out.println("Informe uma nota: ");
			nota = nota + scan.nextFloat();
		}
		scan.close();
		System.out.println("Media: " + (nota / 4));
	}

}
