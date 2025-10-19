package com.ifsc.tds;

public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario estag = new Funcionario();
		Gerente gerente = new Gerente();
		
		estag.setCpf("123.123.123-45");
		estag.setNome("Estagiário");
		estag.setSalario(1500);
		
		gerente.setCpf("321-321-321-54");
		gerente.setNome("Gerente");
		gerente.setSalario(2500);
		gerente.setSenha(123);
		
		System.out.println("Estagiário: " + estag.getNome());
		System.out.println("Estagiário: " + estag.getCpf());
		System.out.println("Estagiário: " + String.format("%.2f", estag.getSalario()));
		
		System.out.println("Gerente: " + gerente.getNome());
		System.out.println("Gerente: " + gerente.getCpf());
		System.out.println("Gerente: " + String.format("%.2f", gerente.getSalario()));

		if(gerente.validarSenha(123)) {
			System.out.println("Abriu o cofre!");
		} else {
			System.out.println("Erro!");
		}
		
	}

}
