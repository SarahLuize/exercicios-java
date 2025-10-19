package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float distancia=0f;
		float tempo = 0f;
		float velocidade = 0f;
		float gasolina = 0f;
		
		System.out.println("Informe a velocidade média: ");
		velocidade = scan.nextFloat();
		
		System.out.println("Informe o tempo: ");
		tempo = scan.nextFloat();
		
		//System.out.println("Informe a quantidade de gasolina gasta");
		//gasolina = scan.nextFloat();
		
		distancia = tempo * velocidade;

		
		System.out.println("Velocidade média: " + velocidade);
		System.out.println("Tempo gasto na viagem: " + tempo);
		System.out.println("Distância percorrida: " + (velocidade * tempo));
		System.out.println("Qtde de litros usados: " + (distancia / 12));
	}

}
