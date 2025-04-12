# Projeto Controle de Estoque

Este repositório contém a implementação de um sistema básico de controle de estoque em Java.

## Descrição

O projeto demonstra a criação de um sistema que permite adicionar, remover e visualizar produtos no estoque. O sistema mantém um registro dos produtos e suas quantidades, facilitando o gerenciamento do estoque.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

* `Estoque.java`: Implementa a classe `Estoque` com atributos e métodos para gerenciar o estoque.
* `Produto.java`: Implementa a classe `Produto` para representar os produtos no estoque.
* `Main.java`: Classe principal que demonstra o uso do sistema de controle de estoque.

## Como Executar

1.  Clone o repositório:

    ```bash
    git clone [https://github.com/mateuscalmeidac/controle-estoque.git](https://github.com/mateuscalmeidac/controle-estoque.git)
    ```

2.  Compile os arquivos Java:

    ```bash
    javac src/*.java
    ```

3.  Execute a classe `Main`:

    ```bash
    java src.Main
    ```

## Exemplo de Uso

A classe `Main` demonstra como criar uma instância de `Estoque`, adicionar produtos, remover produtos e visualizar o estoque.

```java
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto("Camiseta", 10, 29.99);
        Produto produto2 = new Produto("Calça", 5, 59.99);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        estoque.visualizarEstoque();

        estoque.removerProduto("Camiseta", 2);

        estoque.visualizarEstoque();
    }
}
