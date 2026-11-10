public class TabelaHash {
    private static final int M = 11;
    private No[] tabela;

    public TabelaHash() {
        tabela = new No[M];
    }

    private int hash(int chave) {
        return chave % M;
    }

    public void inserir(Aluno a) {
        int indice = hash(a.getMatricula());

        if (buscar(a.getMatricula()) != null) {
            System.out.println("Erro: ja existe aluno cadastrado com a matricula " + a.getMatricula() + ".");
            return;
        }

        No novo = new No(a);
        if (tabela[indice] == null) {
            tabela[indice] = novo;
        } else {
            No atual = tabela[indice];
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }

        System.out.println("Aluno inserido com sucesso no indice " + indice + ".");
    }

    public Aluno buscar(int matricula) {
        int indice = hash(matricula);
        No atual = tabela[indice];

        while (atual != null) {
            if (atual.getAluno().getMatricula() == matricula) {
                return atual.getAluno();
            }
            atual = atual.getProximo();
        }

        return null;
    }

    public void remover(int matricula) {
        int indice = hash(matricula);
        No atual = tabela[indice];
        No anterior = null;

        while (atual != null) {
            if (atual.getAluno().getMatricula() == matricula) {
                if (anterior == null) {
                    tabela[indice] = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                System.out.println("Aluno com matricula " + matricula + " removido com sucesso.");
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        System.out.println("Aluno com matricula " + matricula + " nao encontrado.");
    }

    public void exibir() {
        System.out.println("\n=== Tabela Hash (M = " + M + ") ===");
        for (int i = 0; i < M; i++) {
            System.out.print("Indice " + i + ": ");
            No atual = tabela[i];
            if (atual == null) {
                System.out.println("vazio");
            } else {
                while (atual != null) {
                    System.out.print(atual.getAluno().toString());
                    atual = atual.getProximo();
                    if (atual != null) {
                        System.out.print(" -> ");
                    }
                }
                System.out.println();
            }
        }
    }
}
