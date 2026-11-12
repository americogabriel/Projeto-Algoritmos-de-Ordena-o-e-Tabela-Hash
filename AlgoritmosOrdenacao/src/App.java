import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        // Sorteia aleatoriamente uma sequência de números do arquivo entradas.txt (entre 5 e 200 elementos) com o método sortearVetorDoArquivo
        int[] vetorOriginal = Utils.sortearVetorDoArquivo("entradas.txt");
        int[] vetor = vetorOriginal.clone(); // crio um novo array na memória de "vetor" com os valores de "vetorOriginal"

        System.out.println("Vetor inicial carregado aleatoriamente de entradas.txt (" + vetor.length + " elementos).");
        
        do {
            System.out.println("\nMenu:\n1- Bubble Sort\n2- Selection Sort\n3- Insertion Sort\n4- Quick Sort\n5- Merge Sort\n6- Criar relatorio de tempo de execucao dos algoritmos\n7- Sortear outro vetor de entradas.txt\n8- Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Bubble Sort
                    vetor = vetorOriginal.clone(); // reinicio o vetor para desordenar ele sempre que quiser trocar de algortimo de ordenação
                    System.out.println("\n--- Vetor Original (Tamanho: " + vetor.length + ") ---");
                    Utils.imprimirVetor(vetor);
                    BubbleSort bubbleSort = new BubbleSort();
                    System.out.println("Ordenando com " + bubbleSort.toString() + "...");
                    long inicio1 = System.nanoTime();
                    bubbleSort.ordenarVetor(vetor);
                    long fim1 = System.nanoTime();
                    System.out.println("--- Vetor Ordenado ---");
                    Utils.imprimirVetor(vetor);
                    System.out.printf("Tempo de execucao: %.4f ms (%d ns)\n", (fim1 - inicio1) / 1_000_000.0, (fim1 - inicio1));
                    break;

                case 2:
                    // Selection Sort
                    vetor = vetorOriginal.clone(); // reinicio o vetor para desordenar ele sempre que quiser trocar de algortimo de ordenação
                    System.out.println("\n--- Vetor Original (Tamanho: " + vetor.length + ") ---");
                    Utils.imprimirVetor(vetor);
                    SelectionSort selectionSort = new SelectionSort();
                    System.out.println("Ordenando com " + selectionSort.toString() + "...");
                    long inicio2 = System.nanoTime();
                    selectionSort.ordenarVetor(vetor);
                    long fim2 = System.nanoTime();
                    System.out.println("--- Vetor Ordenado ---");
                    Utils.imprimirVetor(vetor);
                    System.out.printf("Tempo de execucao: %.4f ms (%d ns)\n", (fim2 - inicio2) / 1_000_000.0, (fim2 - inicio2));
                    break;

                case 3:
                    // Insertion Sort
                    vetor = vetorOriginal.clone(); // reinicio o vetor para desordenar ele sempre que quiser trocar de algortimo de ordenação
                    System.out.println("\n--- Vetor Original (Tamanho: " + vetor.length + ") ---");
                    Utils.imprimirVetor(vetor);
                    InsertionSort insertionSort = new InsertionSort();
                    System.out.println("Ordenando com " + insertionSort.toString() + "...");
                    long inicio3 = System.nanoTime();
                    insertionSort.ordenarVetor(vetor);
                    long fim3 = System.nanoTime();
                    System.out.println("--- Vetor Ordenado ---");
                    Utils.imprimirVetor(vetor);
                    System.out.printf("Tempo de execucao: %.4f ms (%d ns)\n", (fim3 - inicio3) / 1_000_000.0, (fim3 - inicio3));
                    break;

                case 4:
                    // Quick Sort
                    vetor = vetorOriginal.clone(); // reinicio o vetor para desordenar ele sempre que quiser trocar de algortimo de ordenação
                    System.out.println("\n--- Vetor Original (Tamanho: " + vetor.length + ") ---");
                    Utils.imprimirVetor(vetor);
                    QuickSort quicksort = new QuickSort();
                    System.out.println("Ordenando com " + quicksort.toString() + "...");
                    long inicio4 = System.nanoTime();
                    quicksort.ordenarVetor(vetor);
                    long fim4 = System.nanoTime();
                    System.out.println("--- Vetor Ordenado ---");
                    Utils.imprimirVetor(vetor);
                    System.out.printf("Tempo de execucao: %.4f ms (%d ns)\n", (fim4 - inicio4) / 1_000_000.0, (fim4 - inicio4));
                    break;

                case 5:
                    // Merge Sort
                    vetor = vetorOriginal.clone(); // reinicio o vetor para desordenar ele sempre que quiser trocar de algortimo de ordenação
                    System.out.println("\n--- Vetor Original (Tamanho: " + vetor.length + ") ---");
                    Utils.imprimirVetor(vetor);
                    MergeSort mergeSort = new MergeSort();
                    System.out.println("Ordenando com " + mergeSort.toString() + "...");
                    long inicio5 = System.nanoTime();
                    mergeSort.ordenarVetor(vetor);
                    long fim5 = System.nanoTime();
                    System.out.println("--- Vetor Ordenado ---");
                    Utils.imprimirVetor(vetor);
                    System.out.printf("Tempo de execucao: %.4f ms (%d ns)\n", (fim5 - inicio5) / 1_000_000.0, (fim5 - inicio5));
                    break;
                case 6:
                    // Criar relatório de tempo de execução dos algoritmos
                    Utils.gerarRelatorioExecucao(vetorOriginal, "relatorio_tempo_execucao.txt");
                    break;
                case 7:
                    // Sortear um novo vetor
                    vetorOriginal = Utils.sortearVetorDoArquivo("entradas.txt"); // chama o método sortearVetorDoArquivo() para guarda o vetor sorteado na variável
                    vetor = vetorOriginal.clone(); // passa uma copia dos valores do vetor para a memória da variável "vetor"
                    System.out.println("\nNovo vetor sorteado de entradas.txt com sucesso (" + vetor.length + " elementos)!");
                    break;
                case 8:
                    // Parar execução
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 8);

        scanner.close();
    }
}
