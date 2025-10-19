package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um dia da semana (1-7): ");
		dia = teclado.nextInt();

		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		
		case 2:
			System.out.println("Segunda-feira");
			break;
				
		case 3:
			System.out.println("Terça-feira");
			break;
		
		case 4:
			System.out.println("Quarta-feira");
			break;
				
		case 5:
			System.out.println("Quinta-feira");
			break;
		
		case 6:
			System.out.println("Sexta-feira");
			break;
		
		case 7:
			System.out.println("Sábado");
			break;
		
		default:
			System.out.println("Dia inválido. Não existe o dia da semana " + dia);
			break;
		}
		
		teclado.close();
	}

}
