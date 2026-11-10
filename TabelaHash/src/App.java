import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabelaHash tabela = new TabelaHash();
        int opcao;

        do {
            System.out.println("\n=== Menu Tabela Hash ===");
            System.out.println("1. Inserir novo Aluno");
            System.out.println("2. Buscar Aluno");
            System.out.println("3. Remover Aluno");
            System.out.println("4. Exibir Tabela Hash");
            System.out.println("5. Encerrar Sistema");
            System.out.print("Escolha uma opcao: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("Matricula: ");
                    int matricula = lerInteiro(scanner);
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = lerInteiro(scanner);
                    scanner.nextLine();
                    tabela.inserir(new Aluno(matricula, nome, idade));
                    break;
                case 2:
                    System.out.print("Matricula para buscar: ");
                    int mBuscar = lerInteiro(scanner);
                    scanner.nextLine();
                    Aluno encontrado = tabela.buscar(mBuscar);
                    if (encontrado != null) {
                        System.out.println("Aluno encontrado: " + encontrado);
                    } else {
                        System.out.println("Aluno nao encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Matricula para remover: ");
                    int mRemover = lerInteiro(scanner);
                    scanner.nextLine();
                    tabela.remover(mRemover);
                    break;
                case 4:
                    tabela.exibir();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
                scanner.next();
            }
        }
    }
}
