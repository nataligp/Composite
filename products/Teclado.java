package products;

import products.Produto;

public class Teclado implements Produto {
    private String nome;
    private double preco;

    public Teclado(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + ", Preço: " + preco);
    }

    @Override
    public void addComp(Produto produto) {
    }
}