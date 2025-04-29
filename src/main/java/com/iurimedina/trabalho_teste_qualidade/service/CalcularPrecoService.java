package com.iurimedina.trabalho_teste_qualidade.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class CalcularPrecoService {

	private static final Map<Predicate<Integer>, Double> regrasPrecoMap = new LinkedHashMap<>();
	static {
		regrasPrecoMap.put(idade -> idade > 0 && idade <= 12, 10.0);
		regrasPrecoMap.put(idade -> idade > 12 && idade <= 59, 30.0);
		regrasPrecoMap.put(idade -> idade >= 60 && idade <= 120, 15.0);
	}
	
	
	public static Double calcularPreco(Integer idade) {
		for(Map.Entry<Predicate<Integer>, Double> regra : regrasPrecoMap.entrySet()) {
			if(regra.getKey().test(idade)) {
				return regra.getValue();
			}
		}
		throw new IllegalArgumentException("Idade invalida: " + idade);
	}

}
