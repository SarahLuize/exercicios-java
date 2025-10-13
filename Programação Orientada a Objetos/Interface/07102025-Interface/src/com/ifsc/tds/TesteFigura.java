package com.ifsc.tds;

public class TesteFigura {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		
		quadrado.setLado(2);
		System.out.println(quadrado.getNomeFigura());
		System.out.println("Área : " + quadrado.getArea());
		System.out.println("Perimetro : " + quadrado.getPerimetro());

		triangulo.setLado1(3);
		triangulo.setLadoAltura(3);
		triangulo.setLadoBase(5);
		System.out.println(triangulo.getNomeFigura());
		System.out.println("Área: " + triangulo.getArea());
		System.out.println("Perimetro: " + triangulo.getPerimetro());
	}

}
