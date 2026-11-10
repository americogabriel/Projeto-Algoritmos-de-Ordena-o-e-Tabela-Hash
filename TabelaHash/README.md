# Projeto Tabela Hash

Implementação em Java de uma tabela hash encadeada para armazenar alunos de uma universidade.

## Informações do projeto

- **Apresentação:** 19/11/2026, durante a aula.
- **Submissão:** postar no Blackboard antes da apresentação.
- **Equipe:** de 5 a 7 integrantes.
- **Avaliação:** 1,5 ponto.

## Equipe

- Gabriel da Cunha Prudencio
- Gabriel Ferreira Américo
- José Adrian Cosmo de Sousa
- Iago Veras de Melo
- Caio Hanel
- João Pedro Medeiros
- Rafael Onias Barbosa

## Dados armazenados

Cada aluno possui:

- **Matrícula:** número inteiro e chave de busca.
- **Nome**
- **Idade**

## Regras da tabela hash

- O tamanho da tabela é fixo: **M = 11**.
- O endereço de cada matrícula é calculado pela função:

  `h(chave) = chave mod 11`

- As colisões são tratadas por encadeamento. Quando houver colisão, o novo aluno deve ser inserido **no final da lista** daquele índice.
- O endereço hash deve ser calculado antes de inserir, buscar ou remover um aluno.
- Não é permitido cadastrar mais de um aluno com a mesma matrícula.
- Não podem ser usadas bibliotecas prontas que implementem tabela hash, como `HashMap` ou `Hashtable`.

## Funcionalidades

O programa apresenta um menu com as seguintes opções:

1. **Inserir aluno:** solicita matrícula, nome e idade.
2. **Buscar aluno:** solicita a matrícula e apresenta o aluno correspondente, se encontrado.
3. **Remover aluno:** solicita a matrícula e remove o aluno correspondente, se encontrado.
4. **Exibir tabela hash:** mostra os 11 índices e os alunos encadeados em cada um.
5. **Encerrar sistema.**

## Como compilar e executar

É necessário ter o Java JDK instalado, com `javac` e `java` disponíveis no `PATH`. Os comandos abaixo devem ser executados no diretório `TabelaHash/`.

Compile os arquivos-fonte:

```bash
javac -d bin src/*.java
```

Inicie o programa:

```bash
java -cp bin App
```

## Andamento da implementação

- [x] Configuração inicial do projeto no VS Code.
- [x] Cadastro dos integrantes da equipe.
- [x] Classe `Aluno` com matrícula, nome e idade.
- [x] Classe `No` para representar os elementos encadeados.
- [x] Classe `TabelaHash` com tamanho 11, função hash, inserção, busca, remoção e exibição.
- [x] Menu interativo com as cinco opções e tratamento de entradas inválidas.

## Observação

Projetos copiados terão nota zero.
