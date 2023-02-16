package br.com.algoritmos;


public class LinearSearch {
	
	//procura o objeto 'key' no vetor 'a'
	
	public static int linearSearch(Object[] a, Object Key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(Key)) {
				return i;
			}
		}
		return -1;
	}
	
	// procurar o valor 'key' no vetor 'a'
	public static int linearSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				return i; // valor encontrato, retorna o indice
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] a1= {2, 3, 8, -1, -4, 20, 0, 5};
		String[] a2 = {"Hello", "World"};
	        
		System.out.println("Key = 20, Index = " + linearSearch(a1, 20));
		System.out.println("Key = \"World\", Index = " + linearSearch(a2, "World"));
		System.out.println("Key = 9, Index = " + linearSearch(a1, 9));
	    System.out.println("Key = \"Java\", Index = " + linearSearch(a2, "Java"));
		System.out.println("Key = Hello, index = " + linearSearch(a2, "Hello"));
		
 		
		
		
	}
	
	
	
}
