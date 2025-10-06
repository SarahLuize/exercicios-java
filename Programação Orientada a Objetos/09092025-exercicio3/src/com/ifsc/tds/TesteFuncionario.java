package com.ifsc.tds;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario fulano = new Funcionario();
		
		fulano.nome("Fulano");
		fulano.sobrenome("Ciclano");
		fulano.horasTrabalhadas(10);
		fulano.valorPorHora(25.50);
		
		fulano.nomeCompleto();
		fulano.calcularSalario();
		fulano.incrementarHoras(8);
		
		fulano.calcularSalario();
	}

}
