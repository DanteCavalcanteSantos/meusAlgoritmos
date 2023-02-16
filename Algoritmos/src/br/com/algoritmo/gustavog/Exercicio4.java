package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio4 {
		
	
	public static void main(String[] args) {
		// Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		Double valor = scn1.nextDouble();
		
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Digite o segundo valor: ");
		Double valor2 = scn2.nextDouble();
		
		Double soma = valor + valor2;
		
		System.out.println("A soma dos valores é: " + soma);
		
		

	}

}
