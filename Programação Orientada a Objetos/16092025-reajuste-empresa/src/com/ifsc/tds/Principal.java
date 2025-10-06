package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salario=0;
		double novoSalario=0;
		double salarioMinimo = 1518;
		
		System.out.println("Reajuste salário empresa");
		System.out.println("Informe seu salário: ");
		salario = scan.nextDouble();
		scan.close();
		
		if(salario < 3*salarioMinimo) {
			novoSalario = salario + salario*(50/100.0);
			System.out.println("Novo salário: " + String.format("%.2f", novoSalario));
		}
		else if(salario >= 3*salarioMinimo && salario <= 10*salarioMinimo) {
			novoSalario = salario + salario*(20/100.0);
			System.out.println("Novo salário: " + String.format("%.2f", novoSalario));
		}
		else if(salario > 10*salarioMinimo && salario <= 20*salarioMinimo) {
			novoSalario = salario + salario*(15/100.0);
			System.out.println("Novo salário: " + String.format("%.2f", novoSalario));
		}else {
			novoSalario = salario + salario*(10/100.0);
			System.out.println("Novo salário: " + String.format("%.2f", novoSalario));
		}

	}

}
