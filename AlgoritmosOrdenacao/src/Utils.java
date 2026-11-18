import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    if (vetor == null) {
      System.out.println("  Vetor = null");
      return;
    }

    System.out.print("  Vetor = {");
    if (vetor.length > 100) {
      for (int i = 0; i < 100; i++) {
        System.out.print(vetor[i]);
        if (i < 99) {
          System.out.print(", ");
        }
      }
      System.out.print(", ... (mostrando apenas os 100 primeiros de " + vetor.length + " elementos)");
    } else {
      for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i]);
        if (i < (vetor.length - 1)) {
          System.out.print(", ");
        }
      }
    }

    System.out.println("}");
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
  // recebe o nome do arquivo, carrega as sequencias númericas de cada linha do arquivo e retorna uma lista com todas as sequencias organizadas por linha do arquivo.txt
  public static List<int[]> carregarSequenciasDoArquivo(String nomeArquivo) throws IOException {
    File file = new File(nomeArquivo);
    if (!file.exists()) {
      File altFile = new File("AlgoritmosOrdenacao", nomeArquivo);
      if (altFile.exists()) {
        file = altFile;
      }
    }

    List<int[]> sequencias = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String linha;
      while ((linha = br.readLine()) != null) {
        linha = linha.trim();
        if (linha.isEmpty()) {
          continue;
        }
        String[] partes = linha.split("[,\\s]+");
        int[] v = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
          v[i] = Integer.parseInt(partes[i]);
        }
        sequencias.add(v);
      }
    }
    return sequencias;
  }

  // Método que lê o arquivo txt com sequencias de números, escolhe aleatoriamente uma sequencia e retorna para o main o vetor aleatório
  public static int[] sortearVetorDoArquivo(String nomeArquivo) throws IOException {
    List<int[]> sequencias = carregarSequenciasDoArquivo(nomeArquivo);
    if (sequencias.isEmpty()) {
      throw new IllegalStateException("Nenhuma sequência encontrada no arquivo: " + nomeArquivo);
    }
    Random random = new Random();
    return sequencias.get(random.nextInt(sequencias.size())); // sorteia um número aleatório e utiliza para ser o índice do array sorteado
  }
}
