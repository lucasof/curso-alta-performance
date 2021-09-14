package br.com.fiap.fila;

import java.util.Scanner;

public class Fila_INT {

	  //defini��o n� da FILA	
	    private static class NO{
	      public  int dado;
	      public  NO prox;
	    }
	  
	  //defini��o dos ponteiros ini e fim	
	    private static NO ini;
	    private static NO fim;
	    
	    public static class Retorno{
	      public  int item;
	      public  boolean ok;
	    }
	    
	    public void INIT() {
	      ini = null;
	      fim = null;
	    }
	    
	    
	    public boolean IsEmpty() {
	      return (ini == null && fim == null);
	    }
	    
	    public void ENQUEUE(int item) {
	      NO novo = new NO();
	      novo.dado = item;
	      novo.prox = null;
	      if (IsEmpty())  
	        ini = novo;
	      else 
	        fim.prox = novo;
	      fim = novo;
	    }
	  
	  
	    public Retorno DEQUEUE() {
	      Retorno saida = new Retorno();
	      if(!IsEmpty()) {
	        saida.item = ini.dado;
	        ini = ini.prox;
	        if (ini == null) fim = null;
	        saida.ok = true;
	      }
	      else
	        saida.ok = false;
	      return saida;
	    }
	    
	      
	    public static void main(String[] args) {
	  
	  //Instanciando o objeto fila
	      Fila_INT fila = new Fila_INT();
	  
	      Retorno resultado = new Retorno();
	      Scanner entrada = new Scanner(System.in);
	      int item, opcao;
	  
	      fila.INIT();
	  
	    //repeti��o para inserir elementos na FILA
	      do { 
	    System.out.print("Digite dado inteiro: ");
	      item= entrada.nextInt();
	      fila.ENQUEUE(item);
	      System.out.print("Digite 0 para encerrar inser��o de dados  ");
	        opcao=entrada.nextInt();
	      }while (opcao != 0);
	    
	    
	    // repetira elemento da FILA at� que esta fique vazia
	      do {
	        resultado = fila.DEQUEUE();
	        if (resultado.ok)
	          System.out.println("Dado retirado: " + resultado.item);	
	          } while (resultado.ok);
	  
	    entrada.close();	
	    }
	  
	  }
