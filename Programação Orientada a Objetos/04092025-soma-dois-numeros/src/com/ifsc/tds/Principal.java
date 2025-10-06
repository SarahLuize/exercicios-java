package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num1 = scan.nextInt();
		
		System.out.println("Informe outro número: ");
		num2 = scan.nextInt();
		
		num1 = num1 + num2;
		scan.close();
		System.out.println("Resultado: " + num1);
		
	}

}
