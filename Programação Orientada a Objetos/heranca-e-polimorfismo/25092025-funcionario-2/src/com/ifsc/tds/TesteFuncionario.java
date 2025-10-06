package com.ifsc.tds;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		
		gerente1.setcpf("123.123.123-45");
		gerente1.setNome("Fulano");
		gerente1.setSalario(1500);
		gerente1.setSenha(123);
		
		if (gerente1.validarsenha(123)) {
			System.out.println("Acessou!");
		} else {
			System.out.println("Negado!");
		}

	}

}
