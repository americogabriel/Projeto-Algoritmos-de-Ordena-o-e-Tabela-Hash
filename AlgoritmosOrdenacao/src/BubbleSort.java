/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class BubbleSort implements IAlgoritmoOrdenacao {

  @Override
	
  public void ordenarVetor(int[] vetor) {

    boolean isTroca;

    int tamanhoVetorMenosUm = vetor.length - 1;  // define o tamanho exato do vetor
	
    do{ 	
	  isTroca = false;
		
	  for(int i = 0; i < tamanhoVetorMenosUm ; i++) {	// for para rodar todos os índices do vetor  
      if( vetor[i] > vetor[i + 1] ) {  // checa se o número do índice atual é maior que o número do índice da frente, se for, realiza a troca
        int aux = vetor[i];
        
        vetor[i] = vetor[i + 1];
        vetor[i + 1] = aux;
        
        isTroca = true; // torna o isTroca True para continuar com o while
        
      }
		
	  }
		
    } while(isTroca); // enquanto o isTroca for True o while continua, quando não entrar mais no if para realizar trocas o isTroca continua False e sai do while
	
  }
  
  @Override
	
  public String toString() {
	
    return "BubbleSort";
    
  }
	
}
