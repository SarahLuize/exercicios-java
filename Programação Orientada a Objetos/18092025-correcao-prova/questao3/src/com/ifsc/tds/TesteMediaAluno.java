package com.ifsc.tds;

import java.util.Scanner;

public class TesteMediaAluno {

	public static void main(String[] args) {
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;

		Scanner teclado = new Scanner(System.in);
		MediaAluno mediaAluno = new MediaAluno();

		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();

		System.out.println("Digite a terceira nota: ");
		nota3 = teclado.nextDouble();

		System.out.println("Digite a quarta nota: ");
		nota4 = teclado.nextDouble();

		mediaAluno.calcularMedia(nota1, nota2, nota3, nota4);

		teclado.close();

	}

}
