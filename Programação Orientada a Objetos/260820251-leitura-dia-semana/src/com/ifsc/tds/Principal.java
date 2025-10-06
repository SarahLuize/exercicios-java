package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	int dia = 0;	
	Scanner teclado = new Scanner(System.in);
	teclado.close();
	//ctrl + shift + F
	//ctrl + shift + O
	
	System.out.println("Digite o dia da semana (1-7):");
	dia = teclado.nextInt();
	
	System.out.println("Dia: " + dia);
	}
}