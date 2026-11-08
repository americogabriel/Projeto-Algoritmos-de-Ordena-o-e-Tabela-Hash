import java.util.Random;

/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class Utils {

  private Utils() {

  }
  
  // Métodos
  
  public static void imprimirVetor(int[] vetor) {
	
	System.out.print( "  Vetor = {" );
	  if(vetor.length > 100){
      for(int i = 0; i < 101; i++) {

        System.out.print( vetor[i] );
        if( i < ( vetor.length - 1 ) ) {
          System.out.print( ", " );
        }
        
      }
    }
    else{
      for(int i = 0; i < vetor.length; i++) {

        System.out.print( vetor[i] );
        if( i < ( vetor.length - 1 ) ) {
          System.out.print( ", " );
        }
        
      }
    }
    
    System.out.println( "}" );
    
  }

  public static int[] gerarVetor(int tamanhoVetor, int limiteSuperior) {
	
	Random random = new Random();
	
	int[] vetor = new int[tamanhoVetor];
	
    for(int i = 0; i < tamanhoVetor; i++) {
	    	
	  int numero = random.nextInt( limiteSuperior );
	 
	  vetor[i] = numero;
	  
    } // FOR VETOR
	    
    return vetor;
    
  }

}
