package com.ifsc.tds.pessoa;

import java.util.Scanner;

public class Pessoa {

	Scanner scan = new Scanner(System.in);
	private String nome;
	private int idade;

	public Pessoa(String valorNome, int valorIdade) {
		this.nome = valorNome;
		this.idade = valorIdade;
	}

	public void dizerONome() {
		System.out.println("Ol�, meu nome � " + this.nome);
	}
	
	public void dizerAIdade() {
		System.out.println("Ol�, minha idade � " + this.idade);
	}
	
	public void fazerAniversario() {
		this.idade++;
	}

}
