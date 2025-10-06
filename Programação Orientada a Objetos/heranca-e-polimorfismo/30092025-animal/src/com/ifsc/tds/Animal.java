package com.ifsc.tds;

public class Animal {
	private String nome;
	private float comprimento=0f;
	private int numPatas=0;
	private String cor;
	private String ambiente;
	private float velMedia=0f;
	
	
	public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velMedia = velMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelMedia() {
		return velMedia;
	}

	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}

	public void dados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Comprimento: " + this.getComprimento() + " cm");
		System.out.println("Número de patas: " + this.getNumPatas());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ambiente: " + this.getAmbiente());
		System.out.println("Velocidade média: " + this.getVelMedia() +  " m/s");
	}
}