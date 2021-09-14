package br.com.fiap.ex1;

public class Exercicio1 {

	public static void main(String[] args) {
		//Inserir o valor 18 na lista crescente [12, 15, 23, 42, 54, 63, 70, 72, 82]
		int[] lista = new int[10] ;
		int valor = 18;
		int i=0, j, n=9;

		//procura posição para inserir i=0;
		while ((valor > lista[i]) && (i<n))
			i++;
		//trecho identifica valor 18 deve ser inserido posição 2
		//conta mais um elemento que será inserido	  

		n= n+1;
		/*desloca cada elemento do vetor para uma posição à frente até posição 2*/

		for (j=n; j>i; j--)
		 	lista[j] = lista[j-1];

		//insere o valor 18 na posição 
		lista[i] = valor;
		}
		
}


