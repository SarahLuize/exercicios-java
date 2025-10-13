package com.ifsc.tds;

public class Quadrado implements FigurasGeometricas {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String getNomeFigura() {
		return "Quadrado";
	}

	@Override
	public int getArea() {
		double area = 0;
		area = this.lado * this.lado;
		return (int) area;
	}

	@Override
	public int getPerimetro() {
		double perimetro = 0;
		perimetro = this.lado * 4;
		return (int) perimetro;
	}
}
