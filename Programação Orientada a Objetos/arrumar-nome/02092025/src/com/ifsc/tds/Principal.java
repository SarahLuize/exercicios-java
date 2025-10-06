package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		int contador = 0;
		for (int i = 0; i < 10; i++) {
			contador = contador + 10;
			
			System.out.println("Download arquivo: " + contador + "%");
		}

	}

}
