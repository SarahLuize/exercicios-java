package com.ifsc.tds;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia,
			String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		System.out.println("---------------------");
		dados();
		System.out.println("Alimento: " + alimento);
		System.out.println("---------------------");
		System.out.println();
	}
}