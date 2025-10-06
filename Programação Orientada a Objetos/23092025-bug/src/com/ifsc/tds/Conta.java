package com.ifsc.tds;

public class Conta {
	private double saldo;

	private Cliente cliente;
	private String cidade;
	
	public Conta(double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
		//this.cidade = cidade;
	}

	public void saque(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta (double valor) {
		this.saldo = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
