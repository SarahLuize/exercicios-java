package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float consumoMedio=0f;
		float distancia=0f;
		float combustivelGasto=0f;
		
		System.out.println("Distancia: ");
		distancia = scan.nextFloat();
		
		System.out.println("Combustivel gasto: ");
		combustivelGasto = scan.nextFloat();
		scan.close();
		
		System.out.println("Litros gastos: " + (combustivelGasto * distancia));

	}

}
