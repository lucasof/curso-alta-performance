package br.com.fiap.pilha;

import java.util.*;

public class Pilha_INT {

//defini��o do NO
	private static class NO{
		public  int dado;
		public  NO prox;
	}

//defini��o do retornos dos m�todos POP e TOP
	public static class Retorno{
		public  int item;
		public  boolean ok;
	}
//defini��o do ponteiro topo da pilha	
	private static NO topo;
	
	public void INIT() {
		topo = null;
	}
	
	public boolean IsEmpty() {
		return topo == null;
	}
	
	public void PUSH(int item) {
		NO novo = new NO();
		novo.dado = item;
		novo.prox = topo;
		topo = novo;
	}
	
	public Retorno POP() {
		Retorno saida = new Retorno();
		if(!IsEmpty()) {
			saida.item = topo.dado;
			topo = topo.prox;
			saida.ok = true;
		}
		else
			saida.ok = false;
		return saida;
	}
	
	public Retorno TOP() {
		Retorno saida = new Retorno();
		if(!IsEmpty()) {
			saida.item = topo.dado;
			saida.ok = true;
		}
		else
			saida.ok = false;
		return saida;
	}
	


//Fun��o main que exemplifica a utiliza��o das opera��es sobre pilha
	public static void main(String[] args) {
					
		Pilha_INT s = new Pilha_INT();
		Scanner entrada = new Scanner(System.in);

//Declara��o de vari�veis necess�rias para usar m�todos da Pilha_INT
		int item ;
		int opcao;
	  Retorno res = new Retorno();
	
//inicia a pilha fazendo topo = null
		  s.INIT();	
		
//invoca metodo TOP para obter dado do n� do topo da pilha
	res = s.TOP();
	if (res.ok)
		System.out.println("Execu��o do TOP: "+  res.item);
	   else
		System.out.println("Execu��o do TOP: pilha VAZIA");

//repeti��o para inserir elementos na pilha
	do { 
	System.out.println("Digite valor inteiro para dado  ");
	item= entrada.nextInt();
	s.PUSH(item);
	System.out.println("Digite 0 para encerrar empilhamento de dados  ");
	opcao=entrada.nextInt();
	} while (opcao != 0);
		
//invoca metodo TOP para obter dado do n� do topo da pilha		
	res = s.TOP();
	if (res.ok)
	System.out.println("Execu��o do TOP: " + res.item);
		
//repeti��o para retirar e apresentar todos elementos da pilha	
	do {
	res = s.POP();
	if (res.ok)
			System.out.println("Dado retirado: " + res.item);	
        } while (res.ok);
	entrada.close();
   }
}
