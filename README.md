# Projeto de Estruturas de Dados II

Trabalho pratico desenvolvido em grupo para a disciplina de Estruturas de Dados II. O repositorio reune implementacoes de algoritmos classicos de ordenacao e uma estrutura de busca baseada em Tabela Hash.

---

## Equipe
- Gabriel da Cunha Prudencio
- Gabriel Ferreira Américo
- José Adrian Cosmo de Sousa
- Iago Veras de Melo
- Caio Hanel
- João Pedro Medeiros

---

## Conteudo do Repositorio

### 1. [Algoritmos de Ordenacao](./AlgoritmosOrdenacao)
Programa interativo que permite ao usuario escolher e executar algoritmos para ordenar conjuntos de dados:
* Bubble Sort
* Selection Sort
* Insertion Sort
* Quick Sort

### 2. [Tabela Hash](./TabelaHash)
Modulo focado na implementacao da estrutura de dados Tabela Hash encadeada com M = 11 posicoes para gerenciamento de alunos universitarios (matricula, nome, idade), sem uso de colecoes prontas do Java.

---

## Status Geral e Pendencias dos Projetos

### Algoritmos de Ordenacao
- [x] Classes dos algoritmos implementadas (BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort).
- [x] Interface IAlgoritmoOrdenacao e utilitario Utils (gerar e imprimir vetor).
- [x] Estrutura inicial do menu interativo no App.java.
- [x] Nomes dos integrantes da equipe adicionados.
- [ ] Lógica de execucao no menu: Conectar as chamadas de ordenacao dentro dos cases do switch em App.java.
- [ ] Entrada via arquivo .txt: Implementar leitura de arquivo com grande conjunto de numeros para a memoria.
- [ ] Regra dos 100 primeiros: Limitar a exibicao no terminal para mostrar apenas os 100 primeiros elementos quando houver grande volume.
- [ ] Tabela comparativa de tempos: Simular a execucao para entradas de tamanho n, n^2, n^3 e n^10 com tempos estimados e indicacao da IA utilizada.

### Tabela Hash
- [x] Estrutura inicial do projeto Java configurada.
- [x] Nomes dos integrantes da equipe adicionados.
- [ ] Classe Aluno: Criar modelo com matricula (int), nome (String) e idade (int).
- [ ] Lista Encadeada propria: Implementar estrutura de nos (No) para encadeamento, sem usar bibliotecas prontas do Java.
- [ ] Classe TabelaHash:
  - [ ] Vetor de tamanho M = 11.
  - [ ] Funcao hash: h(chave) = chave mod 11.
  - [ ] Insercao com colisao no final da lista encadeada e bloqueio de matriculas duplicadas.
  - [ ] Operacoes de Inserir, Buscar, Remover e Exibir.
- [ ] Menu Interativo (App.java):
  - [ ] 1 - Inserir novo Aluno
  - [ ] 2 - Buscar Aluno
  - [ ] 3 - Remover Aluno
  - [ ] 4 - Exibir Tabela Hash
  - [ ] 5 - Encerrar Sistema

---

## Tecnologias
* Linguagem: Java (JDK 17+)
