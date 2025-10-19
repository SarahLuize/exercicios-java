package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		int soma=0;
		
		for (int i = 0; i < 100; i++) {
			soma += i;
			System.out.println("" + i + " - " + "Soma: " + soma);
		}
		System.out.println("Fim!");
	}

}
