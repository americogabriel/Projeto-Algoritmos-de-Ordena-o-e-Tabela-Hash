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
- [x] **Passo 1 (Fonte de Dados):**
  - Arquivo de dados de teste (`entradas.txt`) com sequências de 5 a 200 números.
  - Métodos leitores e de sorteio implementados em `Utils.java`.
- [x] **Passo 2 (Formatação de Exibição):**
  - Função `imprimirVetor` configurada para limitar aos 100 primeiros itens quando há grande volume.
- [x] **Passo 3 (Integração do Menu no App.java):**
  - Cases do menu operando sobre o vetor sorteado carregado em memória.
  - Uso de clone do vetor para garantir repetição de testes sem contaminação entre algoritmos.
  - Exibição de entrada, saída e cálculo de tempo de execução (ms e ns).
- [x] **Passo 4 (Simulação e Análise Comparativa):**
  - Nova opção no menu para gerar relatório de simulações com tamanhos de entrada $n$, $n^2$ (2x), $n^3$ (3x) e $n^{10}$ (10x).
  - Geração automática de arquivo `relatorio_tempo_execucao.txt` contendo os vetores usados, tempos medidos e tabela comparativa.
  - Identificação da IA utilizada (Google Antigravity / Gemini 3.8 Flash).
