package com.ifsc.tds;

public class TesteSalario {

	public static void main(String[] args) {
		Salario calculo = new Salario();
		
		calculo.SalarioBruto(160, 4, 2);
		calculo.calculoSalarioLiquido();
		
		calculo.SalarioBruto(170, 8, 5);
		calculo.calculoSalarioLiquido();
	}

}
