# Projeto Tabela HASH

**Data da Apresentacao:** 19/11/2026 durante a aula (postar no Blackboard antes da apresentacao).  
**Equipe:** No minimo 5 e no maximo 7 pessoas.  
**Avaliacao / Nota:** 1,5 pontos.  

---

## Equipe
- Gabriel da Cunha Prudencio
- Gabriel Ferreira Américo
- José Adrian Cosmo de Sousa
- Iago Veras de Melo
- Caio Hanel
- João Pedro Medeiros

---

## Descricao do Projeto

Implemente usando uma linguagem de programacao (C, Java, Python ou JavaScript) a estrutura de dados do tipo **Tabela Hash encadeada** para armazenar informacoes dos alunos de uma universidade.

### Informacoes do Aluno

Para cada aluno deve-se armazenar as seguintes informacoes:

- **Matricula** (chave de busca) - *Todas as matriculas devem ser numeros inteiros*
- **Nome**
- **Idade**

---

## Estrutura e Regras de Hashing

### Funcao de Transformacao (Hash)

A seguinte funcao de transformacao deve ser usada:

$$
h(\text{chave}) = \text{chave} \bmod M
$$

Onde **$M = 11$** e o tamanho da tabela hash.

### Tratamento de Colisao (Hashing Encadeado)

- Durante a insercao, caso ocorra uma colisao, o novo aluno deve ser inserido **no final da lista encadeada**.
- Antes das operacoes de **Inserir**, **Buscar** e **Remover**, e necessario computar o valor do endereco usando a Funcao Hash.

---

## Funcionalidades e Menu do Sistema

Crie um menu interativo com as seguintes opcoes:

1. **Inserir novo Aluno**
   - O usuario deve informar: matricula, nome e idade do aluno.
   - **Regra:** O sistema **nao** deve permitir cadastrar dois alunos com a mesma matricula.
2. **Buscar Aluno**
   - O usuario deve digitar o numero da matricula do aluno.
3. **Remover Aluno**
   - O usuario deve digitar o numero da matricula do aluno.
4. **Exibir Tabela Hash**
   - Apresenta o estado atual dos indices e suas respectivas listas encadeadas.
5. **Encerrar Sistema**

---

## Avisos e Regras
- Projetos copiados terao **nota ZERO**.
- **Nenhuma biblioteca pronta** que forneca a implementacao da Tabela Hash pode ser usada (como java.util.HashMap, Hashtable, etc.).
- Submissao obrigatoria com o nome de todos os membros no Blackboard.

---

## Status e Pendencias do Projeto

- [x] Configuracao Inicial: Projeto Java configurado no VS Code.
- [x] Identificacao da Equipe: Nomes dos membros do grupo adicionados.
- [ ] Classe Aluno: Criar a classe com atributos matricula (int), nome (String) e idade (int), com getters e toString().
- [ ] Estrutura de No / Lista Encadeada propria: Implementar a classe No (ou Elemento) contendo o objeto Aluno e a referencia proximo, sem usar bibliotecas prontas.
- [ ] Classe TabelaHash:
  - [ ] Vetor de listas encadeadas de tamanho fixo M = 11.
  - [ ] Funcao hash: h(chave) = chave mod 11.
  - [ ] Metodo inserir(Aluno a): verificar se a matricula ja existe antes de inserir; em caso de colisao, inserir obrigatoriamente no final da lista encadeada.
  - [ ] Metodo buscar(int matricula): calcular hash, percorrer lista e retornar o aluno (ou informar se nao encontrado).
  - [ ] Metodo remover(int matricula): calcular hash, percorrer lista, remover o no mantendo o encadeamento.
  - [ ] Metodo exibir(): percorrer os indices de 0 a 10 e imprimir os alunos encadeados em cada posicao.
- [ ] Menu Interativo (App.java): Implementar o menu com as 5 opcoes com leitura via teclado (Scanner).
