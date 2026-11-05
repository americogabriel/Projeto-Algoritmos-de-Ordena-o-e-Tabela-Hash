# Projeto Tabela HASH

**Data da Apresentação:** 19/11/2026 durante a aula (postar no Blackboard antes da apresentação).  
**Equipe:** No mínimo 5 e no máximo 7 pessoas.  
**Avaliação / Nota:** 1,5 pontos.  

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

## Descrição do Projeto

Implemente usando uma linguagem de programação (C, Java, Python ou JavaScript) a estrutura de dados do tipo **Tabela Hash encadeada** para armazenar informações dos alunos de uma universidade.

### Informações do Aluno

Para cada aluno deve-se armazenar as seguintes informações:

- **Matrícula** (chave de busca) — *Todas as matrículas devem ser números inteiros*
- **Nome**
- **Idade**

---

## Estrutura e Regras de Hashing

### Função de Transformação (Hash)

A seguinte função de transformação deve ser usada:

$$
h(\text{chave}) = \text{chave} \bmod M
$$

Onde **$M = 11$** é o tamanho da tabela hash.

### Tratamento de Colisão (Hashing Encadeado)

- Durante a inserção, caso ocorra uma colisão, o novo aluno deve ser inserido **no final da lista encadeada**.
- Antes das operações de **Inserir**, **Buscar** e **Remover**, é necessário computar o valor do endereço usando a Função Hash.

---

## Funcionalidades e Menu do Sistema

Crie um menu interativo com as seguintes opções:

1. **Inserir novo Aluno**
   - O usuário deve informar: matrícula, nome e idade do aluno.
   - **Regra:** O sistema **não** deve permitir cadastrar dois alunos com a mesma matrícula.
2. **Buscar Aluno**
   - O usuário deve digitar o número da matrícula do aluno.
3. **Remover Aluno**
   - O usuário deve digitar o número da matrícula do aluno.
4. **Exibir Tabela Hash**
   - Apresenta o estado atual dos índices e suas respectivas listas encadeadas.
5. **Encerrar Sistema**

---

## Avisos e Regras
- Projetos copiados terão **nota ZERO**.
- **Nenhuma biblioteca pronta** que forneça a implementação da Tabela Hash pode ser usada (como java.util.HashMap, Hashtable, etc.).
- Submissão obrigatória com o nome de todos os membros no Blackboard.

---

## Roteiro de Execução (Ordem de Dependências)

### Concluído
- [x] Configuração inicial do projeto no VS Code.
- [x] Identificação da equipe adicionada.

### Pendente (em ordem de prioridade)
- [ ] **Passo 1 (Entidade Aluno):**
  - Criar classe Aluno com matrícula (int), nome (String) e idade (int), construtor, getters e toString().
- [ ] **Passo 2 (Estrutura de Nó / Encadeamento):**
  - Criar classe No contendo objeto Aluno e referência para o próximo nó (sem usar bibliotecas prontas).
- [ ] **Passo 3 (Classe TabelaHash):**
  - Criar array de referências No com tamanho fixo M = 11.
  - Implementar função hash: h(chave) = chave mod 11.
  - Implementar método inserir(Aluno a): verificar duplicidade de matrícula antes de inserir; em colisão, inserir obrigatoriamente no final da lista encadeada.
  - Implementar método buscar(int matricula): retornar o aluno ou null/aviso caso não exista.
  - Implementar método remover(int matricula): desvincular o nó da lista encadeada mantendo a integridade dos ponteiros.
  - Implementar método exibir(): percorrer os 11 índices mostrando todos os alunos encadeados em cada posição.
- [ ] **Passo 4 (Menu Interativo no App.java):**
  - Instanciar a TabelaHash e criar loop com Scanner no App.java para as 5 opções com tratamento de entradas inválidas.
