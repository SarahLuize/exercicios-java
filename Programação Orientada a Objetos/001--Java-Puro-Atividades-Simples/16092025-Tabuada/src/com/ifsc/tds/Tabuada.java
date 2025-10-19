package com.ifsc.tds;

public class Tabuada {

	public void Tabuada(int numero) {
		System.out.println("TABUADA DO " + numero);
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "x" + i + " = " + (numero * i));
		}
	}
}
