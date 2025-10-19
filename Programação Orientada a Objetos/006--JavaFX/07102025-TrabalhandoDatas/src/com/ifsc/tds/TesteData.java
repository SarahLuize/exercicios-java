package com.ifsc.tds;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class TesteData {

	public static void main(String[] args) {

		//DATA INICIAL
		Calendar dataInicio = Calendar.getInstance();
		//ATRIBUI A DATA 01/JAN/2018
		dataInicio.set(1500, Calendar.APRIL, 22);
		//DATA DE HOJE
		Calendar dataFinal = Calendar.getInstance();
		//CALCULA A DIFERENÇA ENTRE HOJE E DA DATA DE INICIO
		long diferenca = dataFinal.getTimeInMillis() - dataInicio.getTimeInMillis();
		//QUANTIDADE DE MILISSEGUNDOS EM UM DIA
		int tempoDia = 1000 * 60 * 60 * 24;
		long diasDiferenca = diferenca / tempoDia;
		JOptionPane.showMessageDialog(null, "Diferença de dias: " + diasDiferenca);
	}

}
