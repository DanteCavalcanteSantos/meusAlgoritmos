package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
// 		Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a 
//		sua ter�a parte.
//		Ex: 
//		Digite um n�mero: 3.5
//		O dobro de 3.5 � 7.0
//		A ter�a parte de 3.5 � 1.16666
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = scn.nextDouble();
		double valorMultiplicado = valor * 2;
		double valorTerco = valor / 3;
		
		System.out.println("O dobro do valor � " + valorMultiplicado);
		System.out.println("O ter�o do valor �: " + valorTerco);
		
		

	}

}
