☕ Sistema de Pedidos em uma cafeteria 
---

Este é um projeto acadêmico desenvolvido em Java que simula um sistema de pedidos de uma cafeteria. O projeto foi elaborado
utilizando dois padrões da programação orientada a objetos: Decorator e Command.

- **Decorator Pattern** - permite montar bebidas com ingredientes adicionais.
- **Command Pattern** - encapsula os pedidos como comandos que podem ser executados e armazenados.

---

### Estrutura do Projeto

- `comandos/` - implementação do padrão Command
- `ingredientes/` - implementação dos ingredientes adicionais acionando o padrão Decorator
- `produtos/` - são as bebidas base (ex.: chá e café).
- `itenscardapio/` - são os itens adicionais para complementar o seu pedido
- `principal/` - dispõe classe main para execução.

---

  ### Design Patterns Utilizados

  **Decorator**
  
  Permite acrescentar ingredientes extras a bebidas sem alterar as classes bases.
  
  Exemplo no código:
  ```java
  Produto cafe = new CafeSimples();
  Produto cafeComLeite = new Leite(cafe);
  ```

  **Command**
  
  Transforma a ação de fazer pedidos para objetos e permite executar e refazer pedidos.

  Exemplo no código:
  ```java
  Comando pedido = new FazerPedido(cafeComLeite);
  garcom.executarComando(pedido);
  ```

  ---
  
  ### Como Executar
  
  1. Clone o repositório:
     ```java
     git clone https://github.com/julia1923/sistema-pedidos-cafeteria.git
       ```

  2. Mude de diretório:
     ```java
     cd sistema-pedidos-cafeteria
       ```
     
  4. Compile o projeto (Git Bash):
     ```java
     mkdir -p bin
     find src -name "*.java" > sources.txt
     javac -d bin @sources.txt
       ```
     
  5. Execute o programa:
      ```java
     java -cp bin principal.Main
      ```


