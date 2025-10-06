package com.ifsc.tds;

public class testeBanco {

	public static void main(String[] args) {
		Conta bradesco = new Conta(10);
		Conta sicob = new Conta(15);
		Cidade cidade = new Cidade(); 
		
		cidade.setCidade("Blumenau");
		
		//Adicionar conta + cliente
		Conta itau = new Conta(25.25, new Cliente()); 
		itau.getCliente().setNome("Ciclano");
				
		Conta santander = new Conta(23.30);
		santander.getCliente().setNome("Fulano");
		
		Conta viacredi = new Conta(100, new Cliente());
		viacredi.getCliente().setNome("Beltrano");
		
		bradesco.deposito(60);
		sicob.deposito(100);
		
		System.out.println("Saldo Bradesco R$: " + String.format("%.2f", bradesco.getSaldo()));
		System.out.println("Saldo Sicob R$: " + String.format("%.2f", sicob.getSaldo()));
		System.out.println("Cliente Santander: " + santander.getCliente().getNome());
		System.out.println("Cliente Itau: " + itau.getCliente().getNome());
		System.out.println("Cliente Viacredi: " + viacredi.getCliente().getNome());
		System.out.println("Cidade: " + cidade.getCidade());
	}

}
