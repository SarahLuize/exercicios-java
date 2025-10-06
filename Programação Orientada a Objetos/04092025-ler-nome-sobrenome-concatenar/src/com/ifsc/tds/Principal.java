package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome; 
		String sobrenome;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome: ");
		nome = scan.next();
		
		System.out.println("Sobrenome: ");
		sobrenome = scan.next();
		scan.close();
		System.out.println("Nome completo: " + nome + " " + sobrenome);
	}

}
