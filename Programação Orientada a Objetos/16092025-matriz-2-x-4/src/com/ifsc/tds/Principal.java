package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] vetor = new int[2][4];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Informe um número: ");
				vetor[i][j] = scan.nextInt();
				
			}
		}
		scan.close();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(vetor[i][j]+ " ");
				//System.out.println();
				//System.out.println("");
			}
			System.out.println();
		}
	}

}
