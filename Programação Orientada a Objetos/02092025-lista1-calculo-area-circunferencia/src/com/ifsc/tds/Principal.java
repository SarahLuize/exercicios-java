package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		double raio = 0;
		
		System.out.println("Informe o valor do raio: ");
		raio = scan.nextDouble();
		
		System.out.println("Area = " + (pi * (raio * raio)));
		scan.close();

	}

}
