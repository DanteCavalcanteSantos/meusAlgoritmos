package br.com.algoritmos;

import java.util.Scanner;

public class ConversorCelsius {

	public static void main(String[] args) {
		
		Scanner fh = new Scanner(System.in);
		System.out.println("Qual o valor em Fahrenheit?");
		double valorFh = fh.nextDouble();
		double valorCe = (valorFh - 32) * 5/9;
		System.out.println("O valor em Celsius é: " + valorCe);

	}

}
