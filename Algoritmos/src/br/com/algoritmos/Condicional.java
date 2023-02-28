package br.com.algoritmos;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um valor: ");
		sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Escreva outro valor: ");
		sc1.nextInt();
		
		int soma = sc.nextInt() + sc1.nextInt();
		
		if(soma == 10) {
			System.out.println("O valor é verdadeiro");
		} else if(soma > 10 && soma < 10) {
			System.out.println("O valor é falso");
		}

	}

}
