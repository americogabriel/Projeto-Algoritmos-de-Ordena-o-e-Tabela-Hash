/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class InsertionSort implements IAlgoritmoOrdenacao {

  @Override
	
  public void ordenarVetor(int[] vetor) {

    for(int i = 1; i < vetor.length; i++) {
       int atual = vetor[i];
       int indiceJ = i - 1;
		       
       while ( indiceJ >= 0 && atual < vetor[indiceJ] ) {
         vetor[indiceJ + 1] = vetor[indiceJ];

         indiceJ = indiceJ - 1;
		               
       }
		          
       vetor[ indiceJ + 1 ] = atual;

     } // FOR ELEMENTOS
		     
  }

  @Override
	
  public String toString() {
    
    return "InsertionSort";
    
  }

}
