package com.ifsc.tds;

public class Salario {
	private int horasTrabalhadas = 0;
	private double salarioHora = 0;
	private int numDependentes = 0;
	private double salarioBruto = 0;
	private double salarioLiquido = 0;
	 double INSS = 0;
	 double IR = 0;

	public void SalarioBruto(int horasTrabalhadas, double salarioHora, int numDependentes) {
		salarioBruto = horasTrabalhadas * salarioHora + (50*numDependentes);
		System.out.println("Salario bruto: " + String.format("%.2f", salarioBruto));
	}
	public void calculoSalarioLiquido() {
		//DESCONTO INSS
		if(salarioBruto <=1000 ) {
			INSS = salarioBruto * (8.5/100);
		}
		else if(salarioBruto > 1000) {
			INSS = salarioBruto * (9.0/100);
		}
		
		//DESCONTO IR
		if(salarioBruto <=500) {
			IR = 0;
		}
		else if(salarioBruto > 500 && salarioBruto <= 1000) {
			IR = salarioBruto * (5.0/100);
		}
		else if(salarioBruto > 1000) {
			IR = salarioBruto * (7.0/100);
		}
		
		salarioLiquido = salarioBruto - INSS - IR;
		System.out.println("Salario liquido: " + String.format("%.2f",salarioLiquido));
	}

		

}
