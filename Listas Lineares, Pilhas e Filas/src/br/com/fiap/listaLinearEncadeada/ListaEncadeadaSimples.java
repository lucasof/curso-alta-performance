package br.com.fiap.listaLinearEncadeada;

public class ListaEncadeadaSimples {
	
	    
	  //declaração do nó e dos atributos
	  private  static class NO {
	    public int dado;
	    public NO prox;
	  }


	  public static void main(String[] args) {
		  
		  
		  //inicia lista vazia atribuindo null ao ponteiro lista
		  NO lista = null;
		  System.out.println("Valor ponteiro lista= " + lista);

		  //	um nó é alocado e é inserido na lista
		  // NO novo = new NO();
		  //novo.dado=5;
		  //novo.prox = lista;
		  //lista = novo;		
		     
		  
		  for(int i =1; i<=2;i++) {
				NO novo2 = new NO();
				novo2.dado= i+4;
				//i=1 -> prox vai apontar para NULL 
				novo2.prox = lista;
				// lista passsa a apontar para novo2
				lista = novo2;					
		  }
	
		  System.out.println("Dado do NO apontado por lista= "+lista.dado);
		  System.out.println("Dado do NO apontado por prox " +lista.prox.dado);
		  
		  //para iterar sobre um grupo de Nós
		  NO aux=lista;
		  while (aux!=null) {
		    System.out.println("Dado do NO apontado por prox " +aux.dado);
		    aux = aux.prox;
		  }
	  }
	    
}


