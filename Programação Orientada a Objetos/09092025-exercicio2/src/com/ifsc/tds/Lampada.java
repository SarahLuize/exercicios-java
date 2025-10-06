package com.ifsc.tds;

public class Lampada {

	private boolean acesa;
	private double potencia;

	public Lampada(double valorPotencia) {
		this.potencia = valorPotencia;
	}

	public void acender() {
		acesa = true;
	}

	public void apagar() {
		acesa = false;
	}

	public void informarSituacao() {
		if (acesa == true) {
			System.out.println("A luz est� acesa");
		} else {
			System.out.println("A luz est� apagada");
		}
	}

	public void informarPotencia() {
		System.out.println("A pot�ncia da l�mpada � " + potencia);
	}
}
