package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
// 		Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
//		sua terça parte.
//		Ex: 
//		Digite um número: 3.5
//		O dobro de 3.5 é 7.0
//		A terça parte de 3.5 é 1.16666
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = scn.nextDouble();
		double valorMultiplicado = valor * 2;
		double valorTerco = valor / 3;
		
		System.out.println("O dobro do valor é " + valorMultiplicado);
		System.out.println("O terço do valor é: " + valorTerco);
		
		

	}

}
