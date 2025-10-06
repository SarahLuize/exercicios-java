package com.ifsc.tds;

import java.util.Scanner;

public class MaiorNumero {
	Scanner teclado = new Scanner(System.in);
	private int num1=0;
	private int num2=0;
	private int maior=0;
	private int menor=0;
	
	public void informeNumeros() {
		System.out.println("Informe um número: ");
		num1=teclado.nextInt();
		System.out.println("Informe outro número: ");
		num2=teclado.nextInt();
	}
	
	public void comparacao() {
		if (num1 < num2) {
			maior= num2;
			menor = num1;
		}
		else {
			maior = num1;
			menor = num2;
		}
		System.out.println("Maior: " + maior + ". Menor" + menor);
	}
}
