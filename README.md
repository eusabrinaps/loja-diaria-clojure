# Loja Diaria

Código desenvolvido como atividade de uma disciplina da faculdade para praticar conceitos da linguagem Clojure.

## Sobre o projeto

O programa simula a consolidacao das operacoes de uma loja durante um dia. A partir de uma lista de vendas e cancelamentos, ele:

- conta as operacoes de um determinado tipo;
- calcula o valor das vendas;
- calcula o saldo final do dia, descontando os cancelamentos.

## Estrutura

```text
.
├── deps.edn
├── README.md
└── src/
    └── loja_diaria/
        └── core.clj
```

## Requisitos

- Clojure instalado;
- Java instalado para executar o Clojure.

## Como executar

Na raiz do projeto, execute:

```bash
clojure -M -m loja-diaria.core
```

O programa exibira o total de vendas concluidas, o total de vendas canceladas e o saldo do dia.

## Exemplo de saida

```text
Total de vendas concluídas com sucesso: 225.0
Total de vendas canceladas: 1
Saldo do dia: 125.0
```