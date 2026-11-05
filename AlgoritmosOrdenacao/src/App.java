import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Menu:\n1- Bubble Sort\n2- Selection Sort\n3- Insertion Sort\n4- Quick Sort\n5- Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Bubble Sort
                    break;

                case 2:
                    // Selection Sort
                    break;

                case 3:
                    // Insertion Sort
                    break;

                case 4:
                    // Quick Sort
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
