package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base=0;
		double expoente=0;
		
		System.out.println("Informe a base: ");
		base = scan.nextDouble();
		System.out.println("Informe a base: ");
		expoente = scan.nextDouble();
		
		scan.close();
		System.out.println("Resultado: " + Math.pow(base, expoente));

	}

}
