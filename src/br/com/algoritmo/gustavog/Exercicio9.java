package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
		// e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

		
		Scanner scn = new Scanner(System.in);
		System.out.println("Qual valor você tem em dinheiro(R$): ");
		double carteira = scn.nextDouble();
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Qual o valor atualmente do dólar? ");
		double valorBidens = scn1.nextDouble();
		
		double valorConversaoMoeda = carteira * valorBidens;
		
		System.out.println("O valor de reais é " + carteira + "\n" + "O valor atual em dolar é: " 
		+ valorBidens + "\n" + "O valor convertido é: " + valorConversaoMoeda);
		
		
		
		
		
		
		
	}

}
