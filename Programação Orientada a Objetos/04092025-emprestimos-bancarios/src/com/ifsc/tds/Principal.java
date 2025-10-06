package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valEmprestimo = 0;
		int numParcelas = 0;
		double valParcela = 0;
		double salario = 0;
		double calculoComprometimento;

		System.out.println("Informe o valor do empr�stimo: ");
		valEmprestimo = scan.nextDouble();

		System.out.println("Informe a quantidade de parcelas: ");
		numParcelas = scan.nextInt();

		System.out.println("Informe o valor do seu sal�rio: ");
		salario = scan.nextDouble();
		scan.close();

		//PARCELAS
		valParcela = valEmprestimo/numParcelas;
		
		calculoComprometimento = (valParcela * 100) / salario;
		System.out.println("Porcentagem: " + calculoComprometimento);

		if (calculoComprometimento > 30) {
			System.out.println("Empr�stimo Negado!");
		} else {
			System.out.println("Emprestimo Aceito!");
		}
	}

}
