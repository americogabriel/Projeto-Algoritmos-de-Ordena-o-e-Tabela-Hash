/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */
                        // todos as classes utilizam como base os métodos do IAlgoritmosOrdenacao
public class SelectionSort implements IAlgoritmoOrdenacao {

  @Override // usado para indicar que um metodo ja existente está sendo sobrescrito
	
  public void ordenarVetor(int[] vetor) {
	
    for(int i = 0; i < vetor.length; i++) {
		    	  
	  int indiceMenorElemento = i;
		
	  for(int j = i + 1; j < vetor.length; j++) {
		       
	    if( vetor[j] < vetor[indiceMenorElemento] ) {
		        
		  indiceMenorElemento = j;
		  
	    }
		
	  } // FOR MENOR ELEMENTO
		
	  if( indiceMenorElemento != i ) {
		    	   
		int menorElemento = vetor[indiceMenorElemento];
		
		vetor[indiceMenorElemento] = vetor[i];
		
		vetor[i] = menorElemento;
		
	  }
		
    } // FOR ELEMENTOS
	
  }

  @Override
	
  public String toString() {
	
    return "SelectionSort";
    
  }

}
