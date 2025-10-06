package com.ifsc.tds;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada led = new Lampada(100);

		led.informarSituacao();
		led.acender();
		led.informarSituacao();
		led.apagar();
		led.informarSituacao();
		led.informarPotencia();
	}

}
