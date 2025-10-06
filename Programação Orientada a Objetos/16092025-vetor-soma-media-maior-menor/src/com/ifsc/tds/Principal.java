package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A[] = new int[7];
		int soma=0;
		double media=0;
		int maior=10000000;
		int menor=0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Informe um valor: ");
			A[i] = scan.nextInt();
			soma = soma + A[i];
			
			if (i==0) {
				menor = A[i];
				maior = A[i];
			} else {
				if (A[i] < menor) {
					menor = A[i];
				}
				if(A[i] > maior) {
					maior = A[i];
				}
			}
		}
		
		scan.close();
		
		media = soma / 7.0;
		System.out.println("Soma: " + soma);
		System.out.println("Media " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}

}
