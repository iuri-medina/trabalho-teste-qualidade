package com.iurimedina.trabalho_teste_qualidade;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iurimedina.trabalho_teste_qualidade.service.CalcularPrecoService;
import com.iurimedina.trabalho_teste_qualidade.service.ValidacaoQuantBilhetes;

@SpringBootApplication
public class TrabalhoTesteQualidadeApplication {
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(TrabalhoTesteQualidadeApplication.class, args);
		
		
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite sua idade: ");
		int idadeUsuario = Integer.parseInt(scanner.nextLine());
			
		System.out.println("Digite a quantidade de bilhetes que deseja comprar: ");
		int quantBilhetes = Integer.parseInt(scanner.nextLine());
		
		if(!ValidacaoQuantBilhetes.validarQuantBilhetes(quantBilhetes)) {
			System.out.println("Erro: quantidade não pode ser menor que 1 ou maior que 5.");
			System.exit(1);
		}
		try {
			Double total = CalcularPrecoService.calcularPreco(idadeUsuario) * quantBilhetes;
			System.out.println("Total: R$ " + total);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			System.exit(1);
		}
		
		
		
		
		
		
		
		
	}

}
