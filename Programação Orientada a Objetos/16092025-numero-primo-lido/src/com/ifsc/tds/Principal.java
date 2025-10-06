package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		boolean primo = true;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		scan.close();
		
		for (int j = 0; j < num; j++) {
			primo=true;
			for (int i = 2; i < j-1; i++) {
				if (j % i == 0) {
					primo =false;
				}
			}
			if (primo) {
				System.out.println("Primo: " + j);
			}
		}

	}

}
