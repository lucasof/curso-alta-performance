package br.com.fiap.pilha;

import java.util.Scanner;

import br.com.fiap.pilha.Pilha_INT.Retorno;

public class ExemploConvers�oBinario {
	public static void main(String[] args) {
		
		  Pilha_INT s = new Pilha_INT();
		  Retorno res = new Retorno();
		  Scanner entrada = new Scanner(System.in);
		  int resto, num;
		  
		//inicia a pilha fazendo topo = null
		  s.INIT();	
		  
		  System.out.print("Digite valor n�mero na base 10: ");
		  num = entrada.nextInt();
		  
		// fazendo divis�es sucessivas e empilhando os valores do
		// resto at� que num seja zero	
		  while (num > 0) {
		    resto = num % 2;
		    s.PUSH(resto);
		    num = num/2;
		  }
		    
		/* escrevendo o resto na ordem inversa que foram obtidos           
		   usando a propriedade LIFO da pilha*/
		  System.out.println("Numero em binario: ");
		  do {
		    res = s.POP();
		    if (res.ok)
		      System.out.print(" "+ res.item);	
		      } while (res.ok);
		    entrada.close();
		 }
}
