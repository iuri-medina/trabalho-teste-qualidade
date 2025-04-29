package com.iurimedina.trabalho_teste_qualidade.service;

public class ValidacaoQuantBilhetes {

	public static boolean validarQuantBilhetes(int quantidade) {
	 	return quantidade >= 1 && quantidade <= 5;
	}
}
