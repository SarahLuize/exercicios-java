package com.ifsc.tds;

public class Triangulo implements FigurasGeometricas {

	private int lado1;
	private int ladoBase;
	private int ladoAltura;
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLadoBase() {
		return ladoBase;
	}
	public void setLadoBase(int ladoBase) {
		this.ladoBase = ladoBase;
	}
	public int getLadoAltura() {
		return ladoAltura;
	}
	public void setLadoAltura(int ladoAltura) {
		this.ladoAltura = ladoAltura;
	}
	
	@Override
	public String getNomeFigura() {
		return "Triangulo";
	}
	@Override
	public int getArea() {
		return (this.ladoBase*this.ladoAltura)/2;
	}
	@Override
	public int getPerimetro() {
		return (this.lado1 + this.ladoAltura + this.ladoBase);
	}
	

}
