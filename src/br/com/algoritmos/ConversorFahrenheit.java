package br.com.algoritmos;

import java.util.Scanner;

public class ConversorFahrenheit {

	public static void main(String[] args) {
		
		
		 Scanner ce = new Scanner(System.in);
		 System.out.println("Qual o valor em Celsius?");
		 double valorCe = ce.nextDouble();
		 double valorFh = (9*valorCe + 160)/5;
		 System.out.println("O valor de fahrenheit é: " +  valorFh);
		 
		

	}

}
