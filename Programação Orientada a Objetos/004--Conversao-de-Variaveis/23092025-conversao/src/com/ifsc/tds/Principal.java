package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		// inteiro para float
		int x = 10;
		float y = x;
		// float para inteiro
		float z = 15.5f;
		int w = (int) z;
		// String para inteiro
		String a = "10";
		int b = 0;
		
		String c = "10.75";
		float d = 0;
		String e = "15.85";
		double f = 0;
		
		
		//CONVERSÃO
		// inteiro para float
		y = (float) x;
		w = (int) z;
		
		// String para inteiro
		b = Integer.parseInt(a); // "10" => 10
		// String para float
		d = Float.parseFloat(c);
		// String para double
		f = Double.parseDouble(e);
		
		System.out.println("Valor de X: " + x);
		System.out.println("Valor de Y: " + y);
		System.out.println("Valor de Z: " + z);
		System.out.println("Valor de W: " + w);
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de D: " + d);
		System.out.println("Valor de E: " + e);
		System.out.println("Valor de F: " + f);


		




	}

}
