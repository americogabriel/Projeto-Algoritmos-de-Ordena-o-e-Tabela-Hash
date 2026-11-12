import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //  PARTE DE MÉTODOS FEITO PELA IA PARA GERAR O RELATÓRIO DE TEMPO DE EXECUÇÃO DE CADA ALGORITMO DE ORDENAÇÃO
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Cria um novo vetor repetindo os elementos do vetor original pelo fator multiplicador informado.
   * Exemplo: para {5, 4, 8, 1, 90} e multiplicador = 2, retorna {5, 4, 8, 1, 90, 5, 4, 8, 1, 90}.
   */
  public static int[] multiplicarVetor(int[] vetorOriginal, int multiplicador) {
    if (vetorOriginal == null) {
      return new int[0];
    }
    int[] novoVetor = new int[vetorOriginal.length * multiplicador];
    for (int i = 0; i < multiplicador; i++) {
      System.arraycopy(vetorOriginal, 0, novoVetor, i * vetorOriginal.length, vetorOriginal.length);
    }
    return novoVetor;
  }

  /**
   * Formata os elementos de um vetor em linhas de quantidade definida, facilitando a leitura em arquivo de texto.
   */
  public static String formatarVetorEmLinhas(int[] vetor, int elementosPorLinha) {
    if (vetor == null || vetor.length == 0) {
      return "{}";
    }
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for (int i = 0; i < vetor.length; i++) {
      if (i > 0 && i % elementosPorLinha == 0) {
        sb.append("\n  ");
      }
      sb.append(vetor[i]);
      if (i < vetor.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("}");
    return sb.toString();
  }

  /**
   * Executa a simulação de ordenação com todos os algoritmos para 4 variações de tamanho do vetor sorteado:
   * 1. Tamanho normal (n)
   * 2. Tamanho n² (dobrado: 2n)
   * 3. Tamanho n³ (triplicado: 3n)
   * 4. Tamanho n¹⁰ (10 vezes: 10n)
   * Mede o tempo de execução de cada algoritmo com nanoTime e gera um arquivo .txt detalhado com o vetor utilizado e os tempos.
   */
  public static void gerarRelatorioExecucao(int[] vetorOriginal, String nomeArquivo) throws IOException {
    if (vetorOriginal == null || vetorOriginal.length == 0) {
      System.out.println("Erro: Vetor vazio ou nulo.");
      return;
    }

    IAlgoritmoOrdenacao[] algoritmos = new IAlgoritmoOrdenacao[] {
      new BubbleSort(),
      new SelectionSort(),
      new InsertionSort(),
      new QuickSort(),
      new MergeSort()
    };

    int[] multiplicadores = { 1, 2, 3, 10 };
    String[] titulosRodadas = {
      "1a Rodada: Tamanho Normal (n = " + vetorOriginal.length + ")",
      "2a Rodada: Tamanho n^2 (Dobrado: 2n = " + (vetorOriginal.length * 2) + ")",
      "3a Rodada: Tamanho n^3 (Triplicado: 3n = " + (vetorOriginal.length * 3) + ")",
      "4a Rodada: Tamanho n^10 (10x: 10n = " + (vetorOriginal.length * 10) + ")"
    };
    String[] colunasTabela = {
      "n (" + vetorOriginal.length + ")",
      "n^2 (" + (vetorOriginal.length * 2) + ")",
      "n^3 (" + (vetorOriginal.length * 3) + ")",
      "n^10 (" + (vetorOriginal.length * 10) + ")"
    };

    double[][] temposMs = new double[algoritmos.length][multiplicadores.length];
    long[][] temposNs = new long[algoritmos.length][multiplicadores.length];
    int[][] vetoresRodadas = new int[multiplicadores.length][];

    System.out.println("\n=======================================================");
    System.out.println("   INICIANDO SIMULACOES E MEDICAO DE TEMPO");
    System.out.println("=======================================================");
    System.out.println("Vetor base sorteado: n = " + vetorOriginal.length + " elementos.");

    for (int r = 0; r < multiplicadores.length; r++) {
      int mult = multiplicadores[r];
      vetoresRodadas[r] = multiplicarVetor(vetorOriginal, mult);
      System.out.println("\n-> Executando " + titulosRodadas[r] + "...");

      for (int a = 0; a < algoritmos.length; a++) {
        int[] copia = vetoresRodadas[r].clone();
        long inicio = System.nanoTime();
        algoritmos[a].ordenarVetor(copia);
        long fim = System.nanoTime();
        long duracaoNs = fim - inicio;
        double duracaoMs = duracaoNs / 1_000_000.0;

        temposNs[a][r] = duracaoNs;
        temposMs[a][r] = duracaoMs;

        System.out.printf(Locale.US, "   [%s] Concluido em: %.4f ms (%d ns)\n", algoritmos[a].toString(), duracaoMs, duracaoNs);
      }
    }

    // Gravação no arquivo .txt com codificação UTF-8 explícita
    File arquivoSaida = new File(nomeArquivo);
    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoSaida), StandardCharsets.UTF_8))) {
      bw.write("================================================================================\n");
      bw.write("         RELATÓRIO DE TEMPO DE EXECUÇÃO DOS ALGORITMOS DE ORDENAÇÃO             \n");
      bw.write("================================================================================\n");
      bw.write("Data/Hora da Geração: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
      bw.write("IA Utilizada: Google Antigravity (Gemini 3.8 Flash)\n");
      bw.write("Tamanho Original do Vetor (n): " + vetorOriginal.length + " elementos\n\n");

      bw.write("VETOR ORIGINAL SORTEADO:\n");
      bw.write(formatarVetorEmLinhas(vetorOriginal, 25) + "\n\n");

      for (int r = 0; r < multiplicadores.length; r++) {
        bw.write("================================================================================\n");
        bw.write(titulosRodadas[r].toUpperCase() + "\n");
        bw.write("================================================================================\n");
        bw.write("Quantidade de Elementos: " + vetoresRodadas[r].length + "\n");
        bw.write("Vetor Utilizado:\n");
        bw.write(formatarVetorEmLinhas(vetoresRodadas[r], 25) + "\n\n");

        bw.write("Tempos de Execução:\n");
        for (int a = 0; a < algoritmos.length; a++) {
          bw.write(String.format(Locale.US, "  - %-15s: %10.4f ms  (%12d ns)\n",
              algoritmos[a].toString(), temposMs[a][r], temposNs[a][r]));
        }
        bw.write("\n");
      }

      // Tabela Comparativa Resumida (ms)
      bw.write("================================================================================\n");
      bw.write("                      TABELA COMPARATIVA RESUMIDA (ms)                          \n");
      bw.write("================================================================================\n");
      bw.write(String.format(Locale.US, "| %-15s | %-14s | %-14s | %-14s | %-14s |\n",
          "Algoritmo", colunasTabela[0], colunasTabela[1], colunasTabela[2], colunasTabela[3]));
      bw.write("|-----------------|----------------|----------------|----------------|----------------|\n");
      for (int a = 0; a < algoritmos.length; a++) {
        bw.write(String.format(Locale.US, "| %-15s | %11.4f ms | %11.4f ms | %11.4f ms | %11.4f ms |\n",
            algoritmos[a].toString(), temposMs[a][0], temposMs[a][1], temposMs[a][2], temposMs[a][3]));
      }
      bw.write("================================================================================\n\n");

      // Detalhamento em Nanosegundos (ns)
      bw.write("================================================================================\n");
      bw.write("                      TABELA COMPARATIVA RESUMIDA (ns)                          \n");
      bw.write("================================================================================\n");
      bw.write(String.format(Locale.US, "| %-15s | %-14s | %-14s | %-14s | %-14s |\n",
          "Algoritmo", colunasTabela[0], colunasTabela[1], colunasTabela[2], colunasTabela[3]));
      bw.write("|-----------------|----------------|----------------|----------------|----------------|\n");
      for (int a = 0; a < algoritmos.length; a++) {
        bw.write(String.format(Locale.US, "| %-15s | %11d ns | %11d ns | %11d ns | %11d ns |\n",
            algoritmos[a].toString(), temposNs[a][0], temposNs[a][1], temposNs[a][2], temposNs[a][3]));
      }
      bw.write("================================================================================\n");
    }

    // Exibir tabela comparativa no console
    System.out.println("\n================================================================================");
    System.out.println("                      TABELA COMPARATIVA DE TEMPOS (ms)                         ");
    System.out.println("================================================================================");
    System.out.printf(Locale.US, "| %-15s | %-14s | %-14s | %-14s | %-14s |\n",
        "Algoritmo", colunasTabela[0], colunasTabela[1], colunasTabela[2], colunasTabela[3]);
    System.out.println("|-----------------|----------------|----------------|----------------|----------------|");
    for (int a = 0; a < algoritmos.length; a++) {
      System.out.printf(Locale.US, "| %-15s | %11.4f ms | %11.4f ms | %11.4f ms | %11.4f ms |\n",
          algoritmos[a].toString(), temposMs[a][0], temposMs[a][1], temposMs[a][2], temposMs[a][3]);
    }
    System.out.println("================================================================================");
    System.out.println("\nRelatorio completo salvo com sucesso no arquivo:\n" + arquivoSaida.getAbsolutePath());
  }
}
