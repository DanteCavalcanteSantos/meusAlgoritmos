package StackOverFlow;

import java.util.ArrayList;
import java.util.HashSet;

// FizzBuzz é uma questão que cai em entrevista que consiste que 
// todo número divisivel por 3 for igual a 0, ele é "Fizz"
// todo número divisivel por 5 for igual a 0, ele é "Buzz"
// todo número divisivel pelo 3 e 5 é "FizzBuzz"
// melhorar o código

public class FizzBuzz {
	
	
	public static void main(String[] args) {
		
		
		HashSet<Double> lista = new HashSet<>();
		
		lista.add((double) (1));
		lista.add((double) (2));
		lista.add((double) (3));
		lista.add((double) (4));
		lista.add((double) (5));
		lista.add((double) (25));
		
		System.out.println(lista);
		
		for(double i = 0; i < lista.size(); i++) {
			if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0  && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
		}
	}
	

	
	
}
