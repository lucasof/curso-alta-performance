package br.com.fiap.ex2;

public class Exercicio2 {
	
	

	private static class NO {
		public double dado;
		public NO prox;
	}
	
	public static void main(String[] args) {
		
		NO aux,aux2;
		NO lista = null;
		System.out.println("Valor ponteiro lista= " + lista);
		
		NO novo1 = new NO();
		novo1.dado= 2;
		novo1.prox = lista;
		lista = novo1;	

		NO novo2 = new NO();
		novo2.dado= 7;
		novo2.prox = null;
		lista.prox = novo2;
		
		NO novo3 = new NO();
		novo3.dado= 5;
		novo3.prox = lista;
		lista= novo3;
		
		//Remoção de um nó
		aux = lista;
		lista = aux.prox;
	}
	
}
