package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota=0;
		double media=0;
		double exame=0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite uma nota: ");
			nota = scan.nextDouble();
			media = media + nota;
		}
		media = media/4;
		if (media >= 7) {
			System.out.println("Média: " + String.format("%.2f", media));
			System.out.println("Aprovado!");
		}else {
			System.out.println("Média: " + String.format("%.2f", media));
			System.out.println("Exame.. Qual a nota do exame?");
			exame = scan.nextDouble();
			media = media + exame;
			media = media/2;
			scan.close();
			
			if (media >= 5) {
				System.out.println("Média: " + String.format("%.2f", media));
				System.out.println("Aprovado!");
			}else {
				System.out.println("Média: " + String.format("%.2f", media));
				System.out.println("Reprovado!");
			}
			
		}

	}

}
