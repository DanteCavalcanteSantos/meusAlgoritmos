package br.com.algoritmo.gustavog;

import java.util.Scanner;

public class Exercicio2 {

	//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
	//Qual é o seu nome?
	//Imprima Olá Fulano, é um prazer te conhecer
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String nome = scn.next();
		System.out.println("Olá " + nome + ", prazer em te conhecer");
		scn.close();

	}

}
