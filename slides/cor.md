---
title: "Chain of Responsibility"
---

## Chain of Responsibility
### Também conhecido como
- CoR
- Corrente de responsabilidade
- Corrente de comando
- Chain of command

---

## Propósito
- O **Chain of Responsibility** é um padrão de projeto comportamental que permite passar pedidos por uma corrente de handlers. Cada handler decide se processa o pedido ou o passa adiante para o próximo na corrente.

![Padrão de projeto Chain of Responsibility](https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility.png)

---

## Problema
- Imagine um sistema de encomendas online onde somente usuários autenticados podem criar pedidos e apenas usuários administrativos têm acesso total. As checagens devem ser feitas sequencialmente, mas com o tempo, o código das checagens se torna inchado e difícil de manter.

![Problema resolvido pelo Chain of Responsibility](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/problem1-pt-br.png)

---

## Solução
- Transformar comportamentos em objetos handlers e ligá-los em uma corrente. Cada handler decide processar o pedido ou passá-lo adiante. Isso permite uma flexibilidade maior no tratamento dos pedidos e facilita a manutenção do sistema.

![Handlers alinhados formando uma corrente](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-pt-br.png)

---

## Analogia com o mundo real
- Chamadas para o suporte técnico podem atravessar diversos operadores antes de encontrar alguém capaz de resolver o problema, similar ao percurso de um pedido na corrente de responsabilidade.

![Chamada de suporte técnico](https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility-comic-1-pt-br.png)

---

## Estrutura
- **Handler**: interface comum a todos os handlers concretos.
- **Handler Base**: classe opcional para colocar o código padrão.
- **Handlers Concretos**: contém o código real para processar pedidos.
- **Cliente**: compõe correntes e pode ativar qualquer handler.

--

![Estrutura do padrão de projeto Chain of Responsibility](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png)

---

## Pseudocódigo

Ver exemplo Java

---

## Aplicabilidade
- Quando seu programa precisa processar diferentes tipos de pedidos de várias maneiras.
- Quando é essencial executar diversos handlers em uma ordem específica.
- Quando o conjunto de handlers e suas ordens devem mudar durante a execução.

---

## Prós e Contras

--

### Prós

- Controle sobre a ordem de tratamento dos pedidos.
- Desacoplamento das classes que invocam e realizam operações.
- Facilidade para introduzir novos handlers sem quebrar o código existente.

--

### Contras
Alguns pedidos podem acabar sem tratamento.