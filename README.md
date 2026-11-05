# Projeto de Estruturas de Dados II

Trabalho prático desenvolvido em grupo para a disciplina de Estruturas de Dados II. O repositório reúne implementações de algoritmos clássicos de ordenação e uma estrutura de busca baseada em Tabela Hash.

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

## Conteúdo do Repositório

### 1. [Algoritmos de Ordenação](./AlgoritmosOrdenacao)
Programa interativo que permite ao usuário escolher e executar algoritmos para ordenar conjuntos de dados:
* Bubble Sort
* Selection Sort
* Insertion Sort
* Quick Sort

### 2. [Tabela Hash](./TabelaHash)
Módulo focado na implementação da estrutura de dados Tabela Hash encadeada com M = 11 posições para gerenciamento de alunos universitários (matrícula, nome, idade), sem uso de coleções prontas do Java.

---

## Status e Roteiro de Execução (Ordem de Dependências)

### Algoritmos de Ordenação

Itens concluídos:
- [x] Classes dos algoritmos implementadas (BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort).
- [x] Interface IAlgoritmoOrdenacao e utilitário base Utils.
- [x] Estrutura visual do menu criada no App.java.
- [x] Nomes dos integrantes da equipe adicionados.

Passos pendentes em ordem de execução:
- [ ] Passo 1 (Entrada de Dados): Criar arquivo de teste (.txt) e implementar método para carregar os números na memória.
- [ ] Passo 2 (Formatação de Saída): Implementar função para exibir dados de entrada e saída limitando aos 100 primeiros elementos quando houver grande volume.
- [ ] Passo 3 (Integração do Menu): Conectar os cases do menu no App.java para ler a opção, clonar o vetor carregado, acionar o algoritmo escolhido e medir o tempo de execução.
- [ ] Passo 4 (Relatório e Análise): Simular a execução para entradas de tamanho n, n^2, n^3 e n^10 e registrar a tabela comparativa com a IA utilizada.

### Tabela Hash

Itens concluídos:
- [x] Estrutura inicial do projeto Java configurada.
- [x] Nomes dos integrantes da equipe adicionados.

Passos pendentes em ordem de execução:
- [ ] Passo 1 (Entidade Aluno): Criar a classe Aluno com matrícula (int), nome (String) e idade (int).
- [ ] Passo 2 (Estrutura de Nó): Criar a classe No contendo objeto Aluno e referência para o próximo nó (sem coleções prontas).
- [ ] Passo 3 (Classe TabelaHash):
  - [ ] Instanciar array de nós com tamanho fixo M = 11.
  - [ ] Implementar função hash: h(chave) = chave mod 11.
  - [ ] Método inserir: validar duplicatas de matrícula e inserir colisões no final da lista encadeada.
  - [ ] Métodos buscar, remover e exibir o estado dos 11 índices.
- [ ] Passo 4 (Menu Interativo): Implementar o loop do menu no App.java com Scanner para as 5 opções (Inserir, Buscar, Remover, Exibir e Sair).

---

## Tecnologias
* Linguagem: Java (JDK 17+)
