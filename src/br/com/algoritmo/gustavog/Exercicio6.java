package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
// 		Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu 
//		sucessor.
//		Ex: 
//		Digite um n�mero: 9
//		O antecessor de 9 � 8
//		O sucessor de 9 � 10
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = scn.nextDouble();
		double menos = valor - 1;
		double mais = valor + 1;

		System.out.println("O antecessor do valor � " + menos);
		System.out.println("O sucessor do valor � " + mais);
		
		
		
		

	}

}
