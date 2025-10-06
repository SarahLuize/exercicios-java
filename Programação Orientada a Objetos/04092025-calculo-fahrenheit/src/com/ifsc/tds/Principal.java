package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float celsius=0f;
		float fahrenheit=0f;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Celsius: ");
		celsius = scan.nextFloat();
		scan.close();
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Fahrenheit: " + fahrenheit);

	}

}
