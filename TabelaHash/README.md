
# Projeto Tabela HASH

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

## Informações Importantes

- **Data da Apresentação:** 19/11/2026 durante a aula (postar no Blackboard antes da apresentação).
- **Equipe:** No mínimo 5 e no máximo 7 pessoas.
- **Submissão:** Ao final do trabalho, apenas um membro de cada equipe deverá postar o projeto completo no Blackboard, incluindo **(OBRIGATORIAMENTE)** os nomes dos membros da equipe.
- **Avaliação / Nota:** 1,5 pontos.
- **Avisos:**
  - Projetos copiados terão **nota ZERO**.
  - **Nenhuma biblioteca pronta** que forneça a implementação da Tabela Hash pode ser usada.
