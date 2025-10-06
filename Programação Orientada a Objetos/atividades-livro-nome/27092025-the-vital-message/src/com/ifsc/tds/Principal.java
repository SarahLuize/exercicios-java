package com.ifsc.tds;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    Random random = new Random();
		int D=0;
		String M = "";
		String N = "";
		
		limparTela();
		System.out.println("Vital Message (Mensagem Vital)");
		System.out.println();
		System.out.println("Quão difícil?");
		D = scan.nextInt();
		while (D < 4 || D > 10) {
			System.out.println("Quão difícil?");
			D = scan.nextInt();
		}

		for (int i = 0; i < D; i++) {
			int numero = random.nextInt(26)+65;
			char letra = (char) numero;
			M = M + letra;
		}
		
		limparTela();
		System.out.println("MANDE ESSA MENSAGEM");
		System.out.println();
		System.out.println(M);
		
		try {
			TimeUnit.SECONDS.sleep(D*1);
		} catch (InterruptedException e) {
		
		}
		
		limparTela();
		
		N = scan.next();
		scan.close();
		
		if(N.equals(M)) {
			System.out.println("MENSAGEM CORRETA");
			System.out.println("A GUERRA ACABOU");
			return;
		}else {
			System.out.println("VOCÊ ERROU");
			System.out.println("DEVERIA TER DIGITADO: " + M);
			return;
		}
	}
	
	public static void limparTela() {  
		for (int i = 0; i < 5; i++) {
	        System.out.println();
	    }
	}
}
