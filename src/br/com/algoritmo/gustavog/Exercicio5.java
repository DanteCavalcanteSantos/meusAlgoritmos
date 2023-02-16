package br.com.algoritmo.gustavog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 extends ExercicioMelhorado5{

	public static void main(String[] args) {
		// Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
		//na tela a sua média na disciplina.

		//scn1.useLocale(Locale.US);
		//scn1.useDelimiter("."); Ver no alura novamente.
		
		Exercicio5 aprendiz = new Exercicio5();

		
		ArrayList<String> listaAlunos = new ArrayList<>();
		ArrayList<Double> listaNotas1 = new ArrayList<>();
		ArrayList<Double> listaNotas2 = new ArrayList<>();
		HashMap<String, Double> resultado = new HashMap<>();
		
		Scanner nomeAluno = new Scanner(System.in);
		System.out.println("Informe o nome do Aluno: ");
		listaAlunos.add(nomeAluno.next());
		
		Scanner notaUm = new Scanner(System.in);
		System.out.println("Informe a primeira nota do Aluno: ");
		listaNotas1.add(notaUm.nextDouble());
		
			
		Scanner notaDois = new Scanner(System.in);
		System.out.println("Informe a nota do Aluno: ");
		listaNotas2.add(notaDois.nextDouble());
		
		
		
		System.out.println("A média do aluno foi: ");
		
		
		
	
		
		
		
	}

}
