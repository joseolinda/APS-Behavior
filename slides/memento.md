---
title: "Memento"
---

## Memento
### Também conhecido como
- Lembrança
- Retrato
- Snapshot

---

## Propósito
O **Memento** é um padrão de projeto comportamental que permite salvar e restaurar o estado anterior de um objeto sem revelar os detalhes de sua implementação.

![Padrão de projeto Memento](https://refactoring.guru/images/patterns/content/memento/memento-pt-br.png)

---

## Problema

- Imagine criar uma aplicação de editor de texto que, além de editar texto, pode formatá-lo e inserir imagens. Você decide implementar a funcionalidade de desfazer operações, salvando o estado dos objetos antes de cada operação.

--

![Revertendo operações no editor](https://refactoring.guru/images/patterns/diagrams/memento/problem1-pt-br.png)

- O desafio surge ao tentar copiar o estado privado de objetos sem violar o encapsulamento, o que pode resultar em uma forte dependência entre classes e tornar o código frágil.

--

![Como fazer uma cópia do estado privado de um objeto?](https://refactoring.guru/images/patterns/diagrams/memento/problem2-pt-br.png)

---

## Solução

- O padrão Memento delega a criação de retratos do estado ao próprio objeto originador, mantendo o encapsulamento intacto. Mementos armazenam o estado do objeto e são acessíveis apenas pelo originador, enquanto cuidadores gerenciam o histórico sem acessar diretamente o estado do objeto.

--

![O originador tem acesso total ao memento](https://refactoring.guru/images/patterns/diagrams/memento/solution-pt-br.png)

---

## Estrutura
- **Originadora**: Classe que pode produzir e restaurar retratos de seu estado.
- **Memento**: Objeto que armazena o estado da originadora. Deve ser imutável.
- **Cuidadora**: Gerencia quando capturar o estado da originadora e quando restaurá-lo.

* Implementações variam dependendo do suporte da linguagem para classes aninhadas e interfaces intermediárias.


--


## Pseudocódigo


Ver exemplo Java

---

## Aplicabilidade

- Quando você quer produzir retratos do estado de um objeto para restaurar seu estado anterior.
- Quando o acesso direto aos campos de um objeto violaria seu encapsulamento.

---

## Prós e Contras

--

### Prós

- Permite salvar e restaurar o estado de um objeto sem violar o encapsulamento.
- Simplifica o código da originadora ao delegar a gestão do histórico para cuidadoras.

--

### Contras

- Pode consumir muita RAM se criado frequentemente.
- Cuidadoras devem acompanhar o ciclo de vida da originadora.

---

## Relações com outros padrões
- Pode ser usado com Command para implementar "desfazer".
- Iterator pode usar Memento para capturar e restaurar estados de iteração.
- Prototype pode ser uma alternativa mais simples ao Memento para duplicar o estado de objetos.