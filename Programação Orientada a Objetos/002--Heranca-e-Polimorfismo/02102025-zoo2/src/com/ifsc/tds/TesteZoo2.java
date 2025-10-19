package com.ifsc.tds;

public class TesteZoo2 {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		Leao leao = new Leao();
		
		gato.emitirSom();
		cachorro.emitirSom();
		leao.emitirSom();
		
		Animal dog = new Cachorro();
		dog.emitirSom();
		Animal cat = new Gato();
		cat.emitirSom();

	}

}
