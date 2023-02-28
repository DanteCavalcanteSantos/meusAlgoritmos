package br.com.algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class TreinandoLista {

	public static void main(String[] args) {

		ArrayList<String> listaDeNomes = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o nome do abençoado?");
		listaDeNomes.add(sc.next());
		
		for(int i = 0; i < listaDeNomes.size(); i++) {
			System.out.println(i);
		}
		

	}

}
