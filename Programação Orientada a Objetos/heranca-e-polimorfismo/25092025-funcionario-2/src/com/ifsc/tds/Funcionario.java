package com.ifsc.tds;

public class Funcionario {
	private String cpf;
	private String nome;
	private double salario;
	
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
