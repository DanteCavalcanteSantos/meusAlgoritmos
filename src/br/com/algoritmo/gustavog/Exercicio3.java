package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio3 {

// Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem
	
	
	public static void main(String[] args) {
		
		Scanner funcionario = new Scanner(System.in);
		System.out.println("Qual o nome do Funcionário? ");
		String nome = funcionario.next();
		
		Scanner salario = new Scanner(System.in);
		System.out.println("Qual o salário do Funcionário?");
		Double valor = salario.nextDouble();
		
		System.out.println("Funcionário: " + nome + "\n" + "Salário: " + valor);
		
		funcionario.close();
		salario.close();
		
		
	}

}
 