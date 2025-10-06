package com.ifsc.tds;

public class TestarAnimais {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2, "");
		Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", (float) 1.5, "Barbatanas e cauda");
		Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", (float) 0.5, "Mel");
		
		camelo.setAlimento("Vegetais do deserto");
		camelo.dadosMamifero();
		tubarao.dadosPeixe();
		ursocanada.dadosMamifero();
	}

}