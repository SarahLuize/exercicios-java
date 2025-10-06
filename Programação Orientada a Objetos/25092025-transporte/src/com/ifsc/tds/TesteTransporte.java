package com.ifsc.tds;

public class TesteTransporte {

	public static void main(String[] args) {
		Automovel carro = new Automovel();
		Automovel moto = new Automovel();
		Transporte transporte1 = new Transporte();
		Terrestre terrestre = new Terrestre();
		
		transporte1.setCapacidade(300);
		terrestre.setCapacidade(30);
		
		System.out.println("Capacidade transporte1: " + transporte1.getCapacidade());
		System.out.println("Capacidade terrestre: " + terrestre.getCapacidade());
		System.out.println();

		carro.setCor("Azul");
		carro.setPlaca("ABC1234");
		carro.setNumRodas(4);
		carro.setCapacidade(5);
		carro.setNumPortas(4);
		
		moto.setCor("Verde");
		moto.setPlaca("DEF5678");
		moto.setNumRodas(2);
		moto.setCapacidade(2);
		moto.setNumPortas(0);
		
		//CARRO
		System.out.println("Carro |");
		System.out.println("......|Cor: " + carro.getCor());
		System.out.println("......|Placa: " + carro.getPlaca());
		System.out.println("......|Rodas: " + carro.getNumRodas());
		System.out.println("......|Capacidade: " + carro.getCapacidade());
		System.out.println("......|Portas: " + carro.getNumPortas());
		
		
		//MOTO
		System.out.println();
		System.out.println("Moto |");
		System.out.println(".....|Cor: " + moto.getCor());
		System.out.println(".....|Placa: " + moto.getPlaca());
		System.out.println(".....|Rodas: " + moto.getNumRodas());
		System.out.println(".....|Capacidade: " + moto.getCapacidade());
		System.out.println(".....|Portas: " + moto.getNumPortas());
	}

}
