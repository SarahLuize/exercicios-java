package com.ifsc.tds;

public class Gerente extends Funcionario {
	private int senha;

	public boolean validarsenha (int valorSenha) {
		if(this.senha == valorSenha) {
			return true;
		}
		return false;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
