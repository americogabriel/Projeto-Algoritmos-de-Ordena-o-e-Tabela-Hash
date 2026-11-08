import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int[] vetor = {56,12,67,100,80,31};
        
        do {
            System.out.println("Menu:\n1- Bubble Sort\n2- Selection Sort\n3- Insertion Sort\n4- Quick Sort\n5- Merge Sort\n6- Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Bubble Sort
                    Utils.imprimirVetor(vetor);
                    BubbleSort bubbleSort = new BubbleSort();
                    System.out.println(" Ordenado com " + bubbleSort.toString());
                    bubbleSort.ordenarVetor(vetor);
                    Utils.imprimirVetor(vetor);
                    break;

                case 2:
                    // Selection Sort
                    break;

                case 3:
                    // Insertion Sort
                    Utils.imprimirVetor(vetor);
                    InsertionSort insertionSort = new InsertionSort();
                    System.out.println("Ordenado com " + insertionSort.toString());
                    insertionSort.ordenarVetor(vetor);
                    Utils.imprimirVetor(vetor);
                    break;

                case 4:
                    // Quick Sort
                    break;

                case 5:
                    // Merge Sort
                    Utils.imprimirVetor(vetor);
                    MergeSort mergeSort = new MergeSort();
                    System.out.println("Ordenado com " + mergeSort.toString());
                    mergeSort.ordenarVetor(vetor);
                    Utils.imprimirVetor(vetor);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}
