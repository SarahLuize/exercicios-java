package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i=0; // Índice/posição
		int n=3; // Tamanho do vetor
		int v[] = new int[n]; // Declaração do vetor 'v'
		
		//Entrada de dados
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
			v[i] = teclado.nextInt();
		}
		
		//Processamento de dados/ Somar dados, definir maior e menor valor
		int soma=0;
		int menor=v[0];
		int maior=v[0];
		for (i = 0; i < n; i++) {
			soma = soma + v[i];
			
			if(v[i] < menor)
				menor = v[i];
			
			if(v[i] > maior)
				maior = v[i];
		}
		
		//RESULTADO
		System.out.printf("\n");
		for (i = 0; i < n; i++) {
			if(v[i] == menor)
				System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			else if(v[i] == maior)
				System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
			else {
				System.out.printf("v[%d] = %2d\n", i, v[i]);
			}
			System.out.printf("\nSoma = %d\n", soma);
		}

	}

}
