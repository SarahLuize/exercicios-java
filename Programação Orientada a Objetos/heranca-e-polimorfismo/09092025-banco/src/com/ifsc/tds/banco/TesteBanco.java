package com.ifsc.tds.banco;

public class TesteBanco {

	public static void main(String[] args) {
		Conta sicobe = new Conta(500.00);
		Conta itau = new Conta(350);
		
		sicobe.saque(150);
		sicobe.deposito(22.50);
		sicobe.saque(47.67);

		System.out.println("Saldo R$: " + String.format("%.2f", sicobe.getSaldo()));
		
		itau.saque(200);
		itau.deposito(22.50);
		itau.saque(15.25);

		System.out.println("Saldo R$: " + String.format("%.2f", itau.getSaldo()));

	}

}
