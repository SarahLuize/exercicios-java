package com.ifsc.tds;

public class Salario {

	public void calcularSalario(int numeroDependentes, double valorHora, double quantidadeHoras) {
		double salarioBruto = 0;
		double salarioLiquido = 0;
		double descontoINSS = 0;
		double descontoIR = 0;

		salarioBruto = quantidadeHoras * valorHora + (50 * numeroDependentes);

		if (salarioBruto <= 1000) {
			descontoINSS = salarioBruto * 8.5 / 100;
		} else {
			descontoINSS = salarioBruto * 9 / 100;
		}

		if (salarioBruto <= 500) {
			descontoIR = 0;
		} else if (salarioBruto > 500 && salarioBruto <= 1000) {
			descontoIR = salarioBruto * 5 / 100;
		} else {
			descontoIR = salarioBruto * 7 / 100;
		}

		salarioLiquido = (salarioBruto - descontoINSS) - descontoIR;

		System.out.println("Salário Bruto R$..: " + String.format("%.2f", salarioBruto));
		System.out.println("Salário Líquido R$: " + String.format("%.2f", salarioLiquido));
	}

}
