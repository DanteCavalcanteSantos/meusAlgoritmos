package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio3 {

// Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem
	
	
	public static void main(String[] args) {
		
		Scanner funcionario = new Scanner(System.in);
		System.out.println("Qual o nome do Funcion�rio? ");
		String nome = funcionario.next();
		
		Scanner salario = new Scanner(System.in);
		System.out.println("Qual o sal�rio do Funcion�rio?");
		Double valor = salario.nextDouble();
		
		System.out.println("Funcion�rio: " + nome + "\n" + "Sal�rio: " + valor);
		
		funcionario.close();
		salario.close();
		
		
	}

}
 