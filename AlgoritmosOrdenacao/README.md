# Atividade: Algoritmos de Ordenação

**Prazo de Entrega:** 18/11/2026 às 23:59h  
**Equipe:** Mínimo 5 a máximo 7 alunos  
**Pontuação:** Vale até 1,0 ponto (2º Estágio)  

---

## Equipe
- Gabriel da Cunha Prudencio
- Gabriel Ferreira Américo
- José Adrian Cosmo de Sousa
- Iago Veras de Melo
- Caio Hanel
- João Pedro Medeiros
- Rafael Onias Barbosa

---

## 1. Algoritmos de Ordenação

* Baixar o arquivo .zip e importar na sua IDE Java; nele vocês encontram as classes de ordenação;
* **IMPORTANTE:** As classes estão lá, mas o código **ESTÁ INCOMPLETO**; faz parte do projeto completá-lo;
* Implementar a classe main() para fornecer um menu de escolha do algoritmo de ordenação desejado; vocês podem fornecer um conjunto grande de números como entrada gravados em um arquivo .txt a ser lido e carregado para a memória no início do sistema;
* Mostrar os dados de entrada e de saída — quando houver grande volume, mostrar apenas os 100 primeiros;
* Simular a execução dos algoritmos para entradas de n, n^2, n^3 e n^10 e anotar o tempo estimado em uma tabela comparativa — use a IA de preferência da equipe (informe a IA utilizada), fornecendo o algoritmo e solicitando as simulações.

---

## Roteiro de Execução (Ordem de Dependências)

### Concluído
- [x] Classes de ordenação implementadas (BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort).
- [x] Interface IAlgoritmoOrdenacao e utilitário base Utils.
- [x] Estrutura visual do menu criada no App.java.
- [x] Identificação da equipe adicionada.

### Pendente (em ordem de prioridade)
- [ ] **Passo 1 (Fonte de Dados):**
  - Criar arquivo de dados de teste (.txt) com grande quantidade de números.
  - Implementar método leitor para carregar esses números para a memória no início da execução.
- [ ] **Passo 2 (Formatação de Exibição):**
  - Implementar função para exibir dados de entrada e saída com a regra de limitar aos 100 primeiros itens quando houver grande volume.
- [ ] **Passo 3 (Integração do Menu no App.java):**
  - Preencher os cases do menu para operar sobre o vetor carregado em memória.
  - Utilizar clone do vetor para permitir repetição de testes.
  - Chamar o algoritmo escolhido, exibir entrada e saída (limitada a 100) e calcular o tempo de execução.
- [ ] **Passo 4 (Simulação e Análise Comparativa):**
  - Realizar as simulações para tamanhos de entrada n, n^2, n^3 e n^10.
  - Preencher tabela comparativa de tempos e indicar a IA utilizada conforme exigido pelo professor.
