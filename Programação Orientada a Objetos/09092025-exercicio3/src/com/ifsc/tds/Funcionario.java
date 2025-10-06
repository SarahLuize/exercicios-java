package com.ifsc.tds;

public class Funcionario {

	String nome;
	String sobrenome;
	int horasTrabalhadas;
	double valorPorHora;
	double calculo;
	int valorHoras;

	public void nome(String nome) {
		this.nome = nome;
	}

	public void sobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void horasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void valorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public void nomeCompleto() {
		System.out.println("Nome: " + this.nome + " " + this.sobrenome);
	}

	public void calcularSalario() {
		this.calculo = this.horasTrabalhadas * this.valorPorHora;
		System.out.println("R$" + this.calculo);
	}

	public void incrementarHoras(int valorHoras) {
		this.horasTrabalhadas = this.horasTrabalhadas + this.valorHoras;
		System.out.println("Total de horas: " + (horasTrabalhadas + valorHoras));
	}
}
