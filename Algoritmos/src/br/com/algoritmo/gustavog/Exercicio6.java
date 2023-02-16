package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
// 		Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
//		sucessor.
//		Ex: 
//		Digite um número: 9
//		O antecessor de 9 é 8
//		O sucessor de 9 é 10
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = scn.nextDouble();
		double menos = valor - 1;
		double mais = valor + 1;

		System.out.println("O antecessor do valor é " + menos);
		System.out.println("O sucessor do valor é " + mais);
		
		
		
		

	}

}
