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
			System.out.println("A luz está acesa");
		} else {
			System.out.println("A luz está apagada");
		}
	}

	public void informarPotencia() {
		System.out.println("A potência da lâmpada é " + potencia);
	}
}
