package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio2 {

	//Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
	//Qual � o seu nome?
	//Imprima Ol� Fulano, � um prazer te conhecer
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Qual � o seu nome?");
		String nome = scn.next();
		System.out.println("Ol� " + nome + ", prazer em te conhecer");
		scn.close();

	}

}
