package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
		// e mostre quantos d�lares ela pode comprar. Considere US$1,00 = R$3,45.

		
		Scanner scn = new Scanner(System.in);
		System.out.println("Qual valor voc� tem em dinheiro(R$): ");
		double carteira = scn.nextDouble();
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Qual o valor atualmente do d�lar? ");
		double valorBidens = scn1.nextDouble();
		
		double valorConversaoMoeda = carteira * valorBidens;
		
		System.out.println("O valor de reais � " + carteira + "\n" + "O valor atual em dolar �: " 
		+ valorBidens + "\n" + "O valor convertido �: " + valorConversaoMoeda);
		
		
		
		
		
		
		
	}

}
