package com.ifsc.tds;

import java.util.ArrayList;

public class TesteAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		
		Cachorro dog = new Cachorro();
		listaAnimais.add(dog);
		
		Gato cat = new Gato();
		listaAnimais.add(cat);
		
		Leao lion = new Leao();
		listaAnimais.add(lion);
		
		Animal dog2 = new Cachorro();
		listaAnimais.add(dog2);
		
		Animal cat2 = new Gato();
		listaAnimais.add(cat2);
		
		for (int i = 0; i < listaAnimais.size(); i++) {
			Animal umAnimal = listaAnimais.get(i);
			
			if (umAnimal instanceof Gato) {
				System.out.println("Esse objeto é um Gato!");
			} else if(umAnimal instanceof Cachorro) {
				System.out.println("Esse objeto é um Cachorro!");
			} else if(umAnimal instanceof Leao) {
				System.out.println("Esse objeto é um Leao!");
			}
			else {
				System.out.println("Objeto não determinado");
			}
			
			umAnimal.emitirSom();
		}
	}
}
