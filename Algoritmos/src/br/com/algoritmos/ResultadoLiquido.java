package br.com.algoritmos;

import java.util.Scanner;

public class ResultadoLiquido {

	public static void main(String[] args) {
	
		
//		SalarioLiquido teste = new SalarioLiquido();
//		
//		
//		Scanner prof = new Scanner(System.in);
//		System.out.println("Qual o valor da hora trabalhada: ");
//		
//		
		
	SalarioLiquido prof = new SalarioLiquido();
	prof.setValorHora(35);
	prof.setHorasTrabalhada(160);
	System.out.println(prof.calculaSalarioB());
		
		
	}

}
